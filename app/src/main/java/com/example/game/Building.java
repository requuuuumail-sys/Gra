package com.zebuild.game;

public class Building {
    public float x;
    public float y;
    public String name;
    public int width;
    public int height;
    public int color;
    public int level;
    public long lastCollectTime;
    public int productionRate; // Gold/Elixir per minute

    public Building(float x, float y, String name, int width, int height, int color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.width = width;
        this.height = height;
        this.color = color;
        this.level = 1;
        this.lastCollectTime = System.currentTimeMillis();
        
        // Set production based on building type
        switch (name) {
            case "Farm":
                this.productionRate = 5; // 5 gold per minute
                break;
            case "House":
                this.productionRate = 3;
                break;
            case "Barracks":
                this.productionRate = 2;
                break;
            default:
                this.productionRate = 1;
        }
    }

    public void upgrade() {
        this.level++;
        this.width += 5;
        this.height += 5;
        this.productionRate += 2;
    }

    public int getAvailableResources() {
        long currentTime = System.currentTimeMillis();
        long elapsedMinutes = (currentTime - lastCollectTime) / 60000;
        return (int) (elapsedMinutes * productionRate);
    }

    public void collectResources() {
        lastCollectTime = System.currentTimeMillis();
    }

    public void move(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }
}
