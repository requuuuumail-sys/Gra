# ZeBuild Graphics Guide

This guide explains the drawable resources used in ZeBuild and how to create or replace them.

## Required Drawable Resources

### Icon Resources

All these icons should be placed in `app/src/main/res/drawable/`

#### 1. **ic_launcher.xml** (App Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="48dp"
    android:height="48dp"
    android:viewportWidth="48"
    android:viewportHeight="48">
    <path
        android:fillColor="#2E7D32"
        android:pathData="M24,2C12.95,2 4,10.95 4,22c0,11.05 8.95,20 20,20s20,-8.95 20,-20C44,10.95 35.05,2 24,2M24,40c,-9.9 0,-18 -8.1 -18,-18s8.1,-18 18,-18 18,8.1 18,18 -8.1,18 -18,18Z"/>
    <path
        android:fillColor="#FFD700"
        android:pathData="M24,12c,-6.6 0,-12 5.4 -12,12s5.4,12 12,12 12,-5.4 12,-12 -5.4,-12 -12,-12Z"/>
</vector>
```

#### 2. **ic_launcher_round.xml** (Rounded App Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="48dp"
    android:height="48dp"
    android:viewportWidth="48"
    android:viewportHeight="48">
    <circle
        android:cx="24"
        android:cy="24"
        android:r="24"
        android:fillColor="#2E7D32"/>
    <circle
        android:cx="24"
        android:cy="24"
        android:r="18"
        android:fillColor="#FFD700"/>
</vector>
```

#### 3. **logo.xml** (Main Logo - for main menu)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="150dp"
    android:height="150dp"
    android:viewportWidth="150"
    android:viewportHeight="150">
    <!-- Castle turrets -->
    <rect
        android:left="20"
        android:top="80"
        android:right="40"
        android:bottom="130"
        android:fillColor="#8B4513"/>
    <polygon
        android:points="20,80 30,60 40,80"
        android:fillColor="#A0522D"/>
    
    <rect
        android:left="110"
        android:top="80"
        android:right="130"
        android:bottom="130"
        android:fillColor="#8B4513"/>
    <polygon
        android:points="110,80 120,60 130,80"
        android:fillColor="#A0522D"/>
    
    <!-- Main castle -->
    <rect
        android:left="30"
        android:top="70"
        android:right="120"
        android:bottom="130"
        android:fillColor="#D2B48C"/>
    
    <!-- Castle gate -->
    <rect
        android:left="65"
        android:top="95"
        android:right="85"
        android:bottom="130"
        android:fillColor="#8B4513"/>
    
    <!-- Flag -->
    <line
        android:startX="75"
        android:startY="70"
        android:endX="75"
        android:endY="40"
        android:strokeColor="#333333"
        android:strokeWidth="3"/>
    <polygon
        android:points="75,40 95,50 85,55"
        android:fillColor="#FFD700"/>
</vector>
```

#### 4. **ic_gold.xml** (Gold Resource Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <circle
        android:cx="20"
        android:cy="20"
        android:r="18"
        android:fillColor="#FFD700"/>
    <circle
        android:cx="20"
        android:cy="20"
        android:r="14"
        android:fillColor="#FFA500"/>
    <circle
        android:cx="20"
        android:cy="20"
        android:r="10"
        android:fillColor="#FFD700"/>
</vector>
```

#### 5. **ic_elixir.xml** (Elixir Resource Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Bottle shape -->
    <path
        android:fillColor="#9C27B0"
        android:pathData="M15,8L15,15L10,25L10,32L30,32L30,25L25,15L25,8Z"/>
    <!-- Liquid inside -->
    <path
        android:fillColor="#E91E63"
        android:pathData="M13,18L13,28L27,28L27,18Z"/>
    <!-- Highlight -->
    <ellipse
        android:cx="18"
        android:cy="12"
        android:rx="3"
        android:ry="2"
        android:fillColor="#CE93D8"/>
</vector>
```

#### 6. **ic_farm.xml** (Farm Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Ground -->
    <rect
        android:left="5"
        android:top="20"
        android:right="35"
        android:bottom="35"
        android:fillColor="#8BC34A"/>
    <!-- Crops -->
    <polyline
        android:points="10,20 10,15"
        android:strokeColor="#4CAF50"
        android:strokeWidth="2"/>
    <polyline
        android:points="20,20 20,10"
        android:strokeColor="#4CAF50"
        android:strokeWidth="2"/>
    <polyline
        android:points="30,20 30,15"
        android:strokeColor="#4CAF50"
        android:strokeWidth="2"/>
</vector>
```

#### 7. **ic_house.xml** (House Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Roof -->
    <polygon
        android:points="5,25 20,10 35,25"
        android:fillColor="#D2691E"/>
    <!-- House body -->
    <rect
        android:left="8"
        android:top="25"
        android:right="32"
        android:bottom="35"
        android:fillColor="#CDAA7D"/>
    <!-- Door -->
    <rect
        android:left="17"
        android:top="26"
        android:right="23"
        android:bottom="35"
        android:fillColor="#8B4513"/>
    <!-- Window -->
    <rect
        android:left="10"
        android:top="28"
        android:right="14"
        android:bottom="32"
        android:fillColor="#87CEEB"/>
</vector>
```

#### 8. **ic_barracks.xml** (Barracks Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Main structure -->
    <rect
        android:left="8"
        android:top="15"
        android:right="32"
        android:bottom="35"
        android:fillColor="#1976D2"/>
    <!-- Roof -->
    <polygon
        android:points="5,15 20,5 35,15"
        android:fillColor="#0D47A1"/>
    <!-- Windows -->
    <rect android:left="12" android:top="20" android:right="16" android:bottom="24" android:fillColor="#FFC107"/>
    <rect android:left="24" android:top="20" android:right="28" android:bottom="24" android:fillColor="#FFC107"/>
</vector>
```

#### 9. **ic_tower.xml** (Tower Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Tower base -->
    <rect
        android:left="15"
        android:top="20"
        android:right="25"
        android:bottom="35"
        android:fillColor="#5D4E37"/>
    <!-- Tower body -->
    <rect
        android:left="12"
        android:top="12"
        android:right="28"
        android:bottom="22"
        android:fillColor="#795548"/>
    <!-- Top spire -->
    <polygon
        android:points="20,5 16,12 24,12"
        android:fillColor="#D32F2F"/>
</vector>
```

#### 10. **ic_wall.xml** (Wall Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Wall segments -->
    <rect android:left="5" android:top="18" android:right="12" android:bottom="30" android:fillColor="#696969"/>
    <rect android:left="14" android:top="18" android:right="21" android:bottom="30" android:fillColor="#696969"/>
    <rect android:left="23" android:top="18" android:right="30" android:bottom="30" android:fillColor="#696969"/>
    <!-- Crenellations -->
    <rect android:left="5" android:top="15" android:right="8" android:bottom="18" android:fillColor="#696969"/>
    <rect android:left="14" android:top="15" android:right="17" android:bottom="18" android:fillColor="#696969"/>
    <rect android:left="23" android:top="15" android:right="26" android:bottom="18" android:fillColor="#696969"/>
</vector>
```

#### 11. **ic_vault.xml** (Gold Vault Building Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="40dp"
    android:height="40dp"
    android:viewportWidth="40"
    android:viewportHeight="40">
    <!-- Vault body -->
    <rect
        android:left="8"
        android:top="10"
        android:right="32"
        android:bottom="30"
        android:fillColor="#37474F"/>
    <!-- Door -->
    <rect
        android:left="10"
        android:top="12"
        android:right="30"
        android:bottom="28"
        android:fillColor="#455A64"/>
    <!-- Lock -->
    <circle
        android:cx="20"
        android:cy="20"
        android:r="4"
        android:fillColor="#FFD700"/>
    <!-- Gold inside -->
    <circle
        android:cx="15"
        android:cy="16"
        android:r="2"
        android:fillColor="#FFA500"/>
    <circle
        android:cx="25"
        android:cy="16"
        android:r="2"
        android:fillColor="#FFA500"/>
</vector>
```

#### 12. **ic_add_building.xml** (Add Building Button Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="50dp"
    android:height="50dp"
    android:viewportWidth="50"
    android:viewportHeight="50">
    <line
        android:startX="25"
        android:startY="10"
        android:endX="25"
        android:endY="40"
        android:strokeColor="@android:color/white"
        android:strokeWidth="3"/>
    <line
        android:startX="10"
        android:startY="25"
        android:endX="40"
        android:endY="25"
        android:strokeColor="@android:color/white"
        android:strokeWidth="3"/>
</vector>
```

#### 13. **ic_upgrade.xml** (Upgrade Button Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="50dp"
    android:height="50dp"
    android:viewportWidth="50"
    android:viewportHeight="50">
    <!-- Up arrow -->
    <polyline
        android:points="25,15 35,30 15,30"
        android:strokeColor="@android:color/white"
        android:strokeWidth="2"
        android:fillColor="@android:color/white"/>
</vector>
```

#### 14. **ic_back.xml** (Back Button Icon)
```xml
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="50dp"
    android:height="50dp"
    android:viewportWidth="50"
    android:viewportHeight="50">
    <!-- Back arrow -->
    <polyline
        android:points="30,15 15,25 30,35"
        android:strokeColor="@android:color/white"
        android:strokeWidth="3"
        android:strokeLineCap="round"
        android:strokeLineJoin="round"
        android:fillColor="none"/>
</vector>
```

---

## How to Create These Drawables

### Option 1: Use the Vector XML Files (Recommended)

1. Copy each XML code above
2. Create files in `app/src/main/res/drawable/`
3. Save as `ic_filename.xml`
4. Android Studio will render them automatically

### Option 2: Use Android Studio Vector Asset Wizard

1. Right-click `drawable` folder
2. New → Vector Asset
3. Choose icon from Material Icons
4. Adjust size and color
5. Click Finish

### Option 3: Import PNG Images

1. Find PNG images online
2. Right-click `drawable` folder
3. Copy PNG files
4. Update references in code if needed

---

## Customizing Graphics

### Change Colors

In any .xml drawable, modify the `fillColor` attribute:
```xml
<circle
    android:fillColor="#FFD700"  <!-- Change this color -->
    android:cx="20"
    android:cy="20"
    android:r="18"/>
```

Color codes:
- `#2E7D32` - Dark Green (Primary)
- `#FFD700` - Gold (Resources)
- `#9C27B0` - Purple (Elixir)
- `#1976D2` - Blue (Barracks)

### Resize Icons

Change the `width` and `height` attributes:
```xml
<vector
    android:width="48dp"  <!-- Change size -->
    android:height="48dp"
    android:viewportWidth="48"
    android:viewportHeight="48">
```

### Add Shadows/Effects

In `styles.xml`, add elevation:
```xml
<item name="android:elevation">8dp</item>
```

---

## Icon Dimensions Reference

| Type | Size | Usage |
|------|------|-------|
| App Icon | 192x192 | Launcher |
| Drawable Icons | 24-48dp | UI Elements |
| Button Icons | 40-50dp | Controls |
| Logo | 150x150dp | Main Menu |

---

## Professional Graphics (Optional)

For a polished look, consider:

1. **Hire a Designer** - Fiverr, Upwork
2. **Use Design Software** - Adobe XD, Figma
3. **Download Assets** - OpenGameArt.org, Itch.io
4. **Use Asset Stores** - Unity Asset Store, Game Art repositories

---

## Testing Graphics

After adding drawable files:
1. Rebuild project: Build → Rebuild Project
2. Run the app on emulator/device
3. Check that icons appear correctly
4. Verify colors match your theme

---

**Your graphics are now ready for ZeBuild!**
