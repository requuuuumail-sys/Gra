package com.zebuild.game;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        TextView shopTitle = findViewById(R.id.shop_title);
        LinearLayout shopContainer = findViewById(R.id.shop_container);
        Button backButton = findViewById(R.id.btn_back);

        shopTitle.setText("ZeBuild Shop");

        // Create shop items
        String[] items = {"Farm", "House", "Barracks", "Tower", "Wall", "Gold Vault"};
        int[] prices = {100, 150, 200, 250, 80, 300};
        int[] icons = {R.drawable.ic_farm, R.drawable.ic_house, R.drawable.ic_barracks,
                      R.drawable.ic_tower, R.drawable.ic_wall, R.drawable.ic_vault};

        for (int i = 0; i < items.length; i++) {
            addShopItem(shopContainer, items[i], prices[i], icons[i]);
        }

        backButton.setOnClickListener(v -> finish());
    }

    private void addShopItem(LinearLayout container, String name, int price, int iconRes) {
        LinearLayout itemLayout = new LinearLayout(this);
        itemLayout.setOrientation(LinearLayout.HORIZONTAL);
        itemLayout.setPadding(16, 16, 16, 16);
        itemLayout.setBackgroundColor(android.graphics.Color.parseColor("#E8F5E9"));

        // Icon
        ImageView icon = new ImageView(this);
        icon.setImageResource(iconRes);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(80, 80);
        iconParams.setMargins(0, 0, 16, 0);
        itemLayout.addView(icon, iconParams);

        // Item info
        LinearLayout infoLayout = new LinearLayout(this);
        infoLayout.setOrientation(LinearLayout.VERTICAL);
        infoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        TextView itemName = new TextView(this);
        itemName.setText(name);
        itemName.setTextSize(18);
        itemName.setTextColor(android.graphics.Color.BLACK);
        infoLayout.addView(itemName);

        TextView itemPrice = new TextView(this);
        itemPrice.setText("Price: " + price + " Gold");
        itemPrice.setTextSize(14);
        itemPrice.setTextColor(android.graphics.Color.GRAY);
        infoLayout.addView(itemPrice);

        itemLayout.addView(infoLayout);

        // Buy button
        Button buyButton = new Button(this);
        buyButton.setText("Buy");
        buyButton.setLayoutParams(new LinearLayout.LayoutParams(100, 60));
        buyButton.setOnClickListener(v -> {
            // Handle purchase
            android.widget.Toast.makeText(this, "Purchased " + name, 
                    android.widget.Toast.LENGTH_SHORT).show();
        });
        itemLayout.addView(buyButton);

        container.addView(itemLayout);
    }
}
