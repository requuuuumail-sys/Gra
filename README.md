# ZeBuild - Village Building Game for Android

A Clash of Clans-style village building game for Android with resource management, building upgrades, and strategic gameplay.

## Features

✅ **Village Building System** - Place and manage various buildings in your village
✅ **Resource Management** - Collect and spend Gold and Elixir
✅ **Building Upgrades** - Level up buildings to improve production
✅ **Shop System** - Purchase new buildings and upgrades
✅ **Interactive Gameplay** - Tap buildings to collect resources
✅ **Progress Tracking** - Track your village's development

## Game Mechanics

### Buildings
- **Farm** - Produces Gold (5 Gold/minute)
- **House** - Produces Gold (3 Gold/minute)
- **Barracks** - Trains troops (2 units/minute)
- **Tower** - Defensive structure
- **Wall** - Defensive barrier
- **Gold Vault** - Storage for resources

### Resources
- **Gold** - Primary currency for building and upgrades
- **Elixir** - Secondary resource for special upgrades

### Gameplay Loop
1. Collect resources from buildings
2. Purchase new buildings in the shop
3. Upgrade existing buildings
4. Expand your village
5. Unlock new building types

## Project Structure

```
zebuild/
├── AndroidManifest.xml          # App configuration
├── MainActivity.java             # Main menu screen
├── GameActivity.java            # Main game screen
├── ShopActivity.java            # Shop interface
├── Building.java                # Building class
├── build.gradle                 # Gradle configuration
├── activity_main.xml            # Main menu layout
├── activity_game.xml            # Game screen layout
├── activity_shop.xml            # Shop layout
├── colors.xml                   # Color resources
├── strings.xml                  # String resources
├── styles.xml                   # UI styles
├── button_style.xml             # Primary button style
├── button_style_secondary.xml   # Secondary button style
├── button_style_tertiary.xml    # Tertiary button style
├── button_circle.xml            # Circular button style
├── bg_main.xml                  # Main menu background
├── bg_shop.xml                  # Shop background
├── header_background.xml        # Header background
└── README.md                    # This file
```

## Building Instructions

### Requirements
- Android Studio (Latest version)
- Android SDK 21+ 
- Java Development Kit (JDK) 11+
- 2GB RAM minimum

### Steps to Build APK

1. **Download Android Studio** (if not already installed)
   - Download from: https://developer.android.com/studio

2. **Create Project Structure**
   ```
   Create new directory: zebuild/
   Create subdirectories:
   - app/src/main/java/com/zebuild/game/
   - app/src/main/res/layout/
   - app/src/main/res/values/
   - app/src/main/res/drawable/
   ```

3. **Copy Files**
   - Copy all .java files to: `app/src/main/java/com/zebuild/game/`
   - Copy all layout .xml files to: `app/src/main/res/layout/`
   - Copy colors.xml, strings.xml, styles.xml to: `app/src/main/res/values/`
   - Copy drawable .xml files to: `app/src/main/res/drawable/`
   - Copy AndroidManifest.xml to: `app/src/main/`
   - Copy build.gradle to: `app/`

4. **Open in Android Studio**
   - Open Android Studio
   - File → Open → Select the zebuild directory
   - Wait for Gradle sync to complete

5. **Build the APK**
   - Go to: Build → Build Bundle(s) / APK(s) → Build APK(s)
   - The APK will be generated at: `app/build/outputs/apk/debug/app-debug.apk`

6. **Generate Release APK** (Optional)
   - Build → Build Bundle(s) / APK(s) → Build App Bundle
   - Sign with your keystore
   - Output: `app/build/outputs/bundle/release/app-release.aab`

### Alternatively: Command Line Build

```bash
# Navigate to project directory
cd zebuild

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Install on connected device
./gradlew installDebug
```

## Installation

### On Android Device
1. Enable "Unknown Sources" in Settings → Security
2. Transfer the APK file to your device
3. Open file manager and tap the APK
4. Follow installation prompts

### Via USB (Android Studio)
1. Connect Android device via USB
2. Enable USB debugging on device
3. In Android Studio: Run → Run 'app'
4. Select your device from the list

### Via Emulator
1. Create Android Virtual Device (AVD) in Android Studio
2. Run the app on the emulator

## Game Controls

### Main Menu
- **PLAY** - Start a new game
- **SHOP** - Browse and purchase buildings
- **SETTINGS** - Adjust game settings

### In-Game
- **Tap Building** - Collect resources
- **Add Building Button** - Add new building (costs 100 Gold)
- **Upgrade Button** - Upgrade selected building (costs 50 Elixir)
- **Back Button** - Return to main menu

## Customization

### Modify Resources
Edit `res/values/colors.xml`:
```xml
<color name="colorPrimary">#2E7D32</color>
<color name="colorPrimaryDark">#1B5E20</color>
```

### Change Building Stats
Edit `Building.java`:
```java
switch (name) {
    case "Farm":
        this.productionRate = 5; // Change production rate
        break;
}
```

### Add New Buildings
In `GameActivity.java`:
```java
buildings.add(new Building(x, y, "NewBuilding", width, height, color));
```

## Performance Tips

- Game targets Android 5.0+ (SDK 21)
- Optimized for 1GB+ RAM devices
- Smooth 60 FPS gameplay
- Low battery consumption with background optimization

## Troubleshooting

### Gradle Sync Issues
- File → Invalidate Caches → Restart
- Delete `.gradle` folder
- Re-sync project

### Build Failures
- Ensure Java 11+ is installed
- Check Android SDK is properly installed
- Update all dependencies in build.gradle

### Runtime Crashes
- Check AndroidManifest.xml permissions
- Verify all layout files are in correct directory
- Check logcat for detailed error messages

## Future Updates

- [ ] Multiplayer raids
- [ ] Alliance system
- [ ] More building types
- [ ] Advanced graphics
- [ ] Cloud save system
- [ ] Achievement system
- [ ] Leaderboards

## Credits

Created with ❤️ for Android gaming enthusiasts

## License

This project is for educational and personal use.

## Contact & Support

For issues or suggestions, check the project files and customize as needed.

---

**Enjoy Building Your Village with ZeBuild!** 🏰
