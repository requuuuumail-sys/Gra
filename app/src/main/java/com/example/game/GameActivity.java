package com.zebuild.game;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {

    private GameSurfaceView gameView;
    private TextView goldText;
    private TextView elixirText;
    private ImageButton addBuildingButton;
    private ImageButton upgradeButton;
    private ImageButton returnButton;

    private int gold = 500;
    private int elixir = 300;
    private List<Building> buildings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Initialize UI elements
        gameView = findViewById(R.id.game_surface);
        goldText = findViewById(R.id.gold_text);
        elixirText = findViewById(R.id.elixir_text);
        addBuildingButton = findViewById(R.id.btn_add_building);
        upgradeButton = findViewById(R.id.btn_upgrade);
        returnButton = findViewById(R.id.btn_return);

        // Initialize buildings
        initializeBuildings();

        // Update resource display
        updateResourceDisplay();

        // Add building button listener
        addBuildingButton.setOnClickListener(v -> {
            if (gold >= 100) {
                addRandomBuilding();
                gold -= 100;
                updateResourceDisplay();
            }
        });

        // Upgrade button listener
        upgradeButton.setOnClickListener(v -> {
            if (elixir >= 50 && !buildings.isEmpty()) {
                buildings.get(0).upgrade();
                elixir -= 50;
                updateResourceDisplay();
            }
        });

        // Return button listener
        returnButton.setOnClickListener(v -> {
            finish();
        });

        gameView.setGameActivity(this);
    }

    private void initializeBuildings() {
        // Add town hall at center
        buildings.add(new Building(200, 300, "Town Hall", 100, 100, Color.RED));
        buildings.add(new Building(400, 300, "House", 80, 80, Color.YELLOW));
        buildings.add(new Building(100, 150, "Farm", 60, 60, Color.GREEN));
        buildings.add(new Building(450, 150, "Barracks", 70, 70, Color.BLUE));
    }

    private void addRandomBuilding() {
        int x = (int) (Math.random() * 400) + 50;
        int y = (int) (Math.random() * 600) + 100;
        String[] types = {"House", "Farm", "Tower", "Barracks"};
        String type = types[(int) (Math.random() * types.length)];
        int color = Color.HSVToColor(new float[]{(float) Math.random() * 360, 0.8f, 0.9f});
        buildings.add(new Building(x, y, type, 70, 70, color));
    }

    private void updateResourceDisplay() {
        goldText.setText("Gold: " + gold);
        elixirText.setText("Elixir: " + elixir);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void addGold(int amount) {
        gold += amount;
        updateResourceDisplay();
    }

    public void addElixir(int amount) {
        elixir += amount;
        updateResourceDisplay();
    }

    // Custom SurfaceView for game rendering
    public static class GameSurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable {
        private SurfaceHolder holder;
        private Thread gameThread;
        private boolean running = false;
        private Paint paint;
        private GameActivity gameActivity;

        public GameSurfaceView(android.content.Context context) {
            super(context);
            holder = getHolder();
            holder.addCallback(this);
            paint = new Paint();
            paint.setAntiAlias(true);
        }

        public void setGameActivity(GameActivity activity) {
            this.gameActivity = activity;
        }

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            running = true;
            gameThread = new Thread(this);
            gameThread.start();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {}

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
            running = false;
            try {
                gameThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (running) {
                Canvas canvas = null;
                try {
                    canvas = holder.lockCanvas();
                    if (canvas != null) {
                        synchronized (holder) {
                            draw(canvas);
                        }
                    }
                } finally {
                    if (canvas != null) {
                        holder.unlockCanvasAndPost(canvas);
                    }
                }
            }
        }

        public void draw(Canvas canvas) {
            // Draw background
            canvas.drawColor(Color.parseColor("#90EE90"));

            if (gameActivity != null) {
                // Draw buildings
                for (Building building : gameActivity.getBuildings()) {
                    paint.setColor(building.color);
                    canvas.drawRect(building.x, building.y, 
                            building.x + building.width, 
                            building.y + building.height, paint);

                    // Draw building name
                    paint.setColor(Color.BLACK);
                    paint.setTextSize(20);
                    canvas.drawText(building.name, building.x + 5, building.y + 30, paint);

                    // Draw level
                    paint.setColor(Color.WHITE);
                    canvas.drawText("Lvl: " + building.level, building.x + 5, building.y + 55, paint);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            if (gameActivity != null && event.getAction() == MotionEvent.ACTION_DOWN) {
                float x = event.getX();
                float y = event.getY();

                for (Building building : gameActivity.getBuildings()) {
                    if (x >= building.x && x <= building.x + building.width &&
                            y >= building.y && y <= building.y + building.height) {
                        // Building tapped
                        building.upgrade();
                        gameActivity.addGold(10);
                    }
                }
            }
            return true;
        }
    }
}
