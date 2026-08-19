# ZeBuild - Complete Installation & Build Guide

## Quick Start (5 Minutes)

If you want to just test the game quickly:
1. Download the pre-built APK from the releases folder
2. Install on your Android device
3. Enjoy!

---

## Full Development Guide (Build from Source)

### Part 1: System Requirements

**Minimum Requirements:**
- Windows 10/11, macOS 10.15+, or Linux (Ubuntu 18.04+)
- 4GB RAM (8GB recommended)
- 2GB disk space for Android SDK
- Internet connection

**Software to Install:**
1. **Android Studio** (Required)
2. **Java Development Kit (JDK) 11+** (Required)

---

### Part 2: Install Java JDK

#### Windows:
1. Download from: https://www.oracle.com/java/technologies/downloads/
2. Select Java 11 or 17
3. Run the installer
4. Follow the installation wizard
5. Verify installation:
   - Open Command Prompt
   - Type: `java -version`
   - You should see the version number

#### macOS:
```bash
brew install java11
```

#### Linux (Ubuntu):
```bash
sudo apt update
sudo apt install openjdk-11-jdk
java -version
```

---

### Part 3: Install Android Studio

1. **Download Android Studio**
   - Visit: https://developer.android.com/studio
   - Click "Download Android Studio"

2. **Install Android Studio**
   - Windows/macOS: Run the installer and follow prompts
   - Linux: Extract and run:
     ```bash
     tar -xzf android-studio-*.tar.gz
     cd android-studio/bin
     ./studio.sh
     ```

3. **First Launch Setup**
   - Accept license agreements
   - Choose "Custom" installation
   - Select:
     - Android SDK
     - Android SDK Platform
     - Performance (Intel HAXM)
   - Wait for downloads to complete (10-15 minutes)

---

### Part 4: Prepare ZeBuild Files

1. **Create Project Directory**
   ```
   Create a folder: ZeBuild
   ```

2. **Download All ZeBuild Files**
   - Get all files from this package
   - Organize in this structure:
   ```
   ZeBuild/
   ├── app/
   │   ├── src/
   │   │   └── main/
   │   │       ├── java/
   │   │       │   └── com/
   │   │       │       └── zebuild/
   │   │       │           └── game/
   │   │       │               ├── MainActivity.java
   │   │       │               ├── GameActivity.java
   │   │       │               ├── ShopActivity.java
   │   │       │               └── Building.java
   │   │       ├── res/
   │   │       │   ├── layout/
   │   │       │   │   ├── activity_main.xml
   │   │       │   │   ├── activity_game.xml
   │   │       │   │   └── activity_shop.xml
   │   │       │   ├── values/
   │   │       │   │   ├── colors.xml
   │   │       │   │   ├── strings.xml
   │   │       │   │   └── styles.xml
   │   │       │   └── drawable/
   │   │       │       ├── button_style.xml
   │   │       │       ├── button_style_secondary.xml
   │   │       │       ├── button_style_tertiary.xml
   │   │       │       ├── button_circle.xml
   │   │       │       ├── bg_main.xml
   │   │       │       ├── bg_shop.xml
   │   │       │       └── header_background.xml
   │   │       └── AndroidManifest.xml
   │   ├── build.gradle
   │   └── proguard-rules.pro
   ├── build.gradle
   ├── settings.gradle
   └── README.md
   ```

---

### Part 5: Open Project in Android Studio

1. **Launch Android Studio**

2. **Open Project**
   - File → Open
   - Navigate to your ZeBuild folder
   - Click "Open"

3. **Wait for Gradle Sync**
   - Android Studio will automatically sync gradle
   - This may take 3-5 minutes
   - Wait until you see "Gradle sync finished"

4. **Configure SDK** (if prompted)
   - Accept the Android SDK installation
   - Choose SDK Platform 34
   - Install necessary components

---

### Part 6: Build the APK

#### Method 1: Using Android Studio GUI

1. **Generate Debug APK** (for testing)
   - Build → Build Bundle(s) / APK(s) → Build APK(s)
   - Wait for the build to complete
   - You'll see: "Build APK(s) finished successfully"

2. **Locate Your APK**
   - The APK is at: `app/build/outputs/apk/debug/app-debug.apk`
   - This APK is ready to install!

#### Method 2: Command Line Build

Open Terminal/Command Prompt in the ZeBuild folder:

**For Debug APK:**
```bash
./gradlew assembleDebug
```

**For Release APK:**
```bash
./gradlew assembleRelease
```

The APK will be in: `app/build/outputs/apk/debug/` or `app/build/outputs/apk/release/`

---

### Part 7: Install on Your Device

#### Option A: Direct Installation (Easiest)

1. **Enable USB Debugging**
   - On your Android device: Settings → Developer Options → USB Debugging
   - (If no Developer Options, tap Build Number 7 times in About Phone)

2. **Connect via USB Cable**
   - Plug phone into computer via USB
   - Allow USB debugging on your phone

3. **Install in Android Studio**
   - Run → Run 'app'
   - Select your device
   - Click OK
   - Wait for installation

#### Option B: Manual Installation

1. **Transfer APK to Device**
   - Copy the APK file to your phone via:
     - USB file transfer
     - Email
     - Cloud storage (Google Drive, Dropbox)

2. **Install from File**
   - On your phone, open file manager
   - Navigate to the APK file
   - Tap the APK file
   - Tap "Install"
   - Tap "Open" to launch

#### Option C: Using ADB (Advanced)

```bash
# Install from command line
adb install app/build/outputs/apk/debug/app-debug.apk

# Launch the app
adb shell am start -n com.zebuild.game/.MainActivity
```

---

### Part 8: Test the Game

Once installed:
1. Find "ZeBuild" icon on your home screen
2. Tap to launch
3. Test the menu buttons
4. Click PLAY to start building your village

**What to Expect:**
- Green main menu with ZeBuild title
- Play button takes you to the village
- Green terrain with colorful buildings
- Resource counter at top
- Control buttons at bottom

---

## Troubleshooting

### Issue: Gradle Sync Failed

**Solution:**
```
File → Invalidate Caches → Restart
Then: File → Sync Now
```

### Issue: Build Failed - "Cannot find symbol"

**Solution:**
- Check Java version: `java -version`
- Should be Java 11+
- Rebuild project

### Issue: Android SDK Not Found

**Solution:**
- File → Project Structure
- SDK Location → Edit
- Set path to Android SDK
- Typical paths:
  - Windows: `C:\Users\YourName\AppData\Local\Android\sdk`
  - Mac: `/Users/YourName/Library/Android/sdk`
  - Linux: `~/Android/Sdk`

### Issue: APK Installation Failed

**Solution:**
- Uninstall old version: `adb uninstall com.zebuild.game`
- Enable Unknown Sources: Settings → Security
- Retry installation

### Issue: App Crashes on Launch

**Check:**
- Android version is 5.0+ (SDK 21+)
- All permission dialogs approved
- Check logcat for errors

---

## Building for Release (Google Play Store)

### Step 1: Create Keystore

```bash
keytool -genkey -v -keystore zebuild.keystore \
-keyalg RSA -keysize 2048 -validity 10000 \
-alias zebuild_key
```

### Step 2: Sign the Release APK

In Android Studio:
- Build → Generate Signed Bundle/APK
- Select APK
- Choose keystore created above
- Use your password
- Select release build type

### Step 3: Upload to Play Store

1. Create Google Play Developer Account
2. Create new app
3. Upload signed APK
4. Fill in app details
5. Submit for review

---

## Performance Optimization

### For Slower Devices:

Edit `build.gradle`:
```gradle
minSdkVersion 21  // Minimum Android 5.0
targetSdkVersion 34

// Reduce DEX count
dexOptions {
    incremental true
    preDexLibraries = false
}
```

### Enable Proguard:

In `build.gradle`:
```gradle
buildTypes {
    release {
        minifyEnabled true
        proguardFiles getDefaultProguardFile(
            'proguard-android-optimize.txt'), 
            'proguard-rules.pro'
    }
}
```

---

## Common Commands Reference

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run on connected device
./gradlew installDebug
./gradlew runDebug

# Clean build cache
./gradlew clean

# Check build dependencies
./gradlew dependencies

# Run unit tests
./gradlew test
```

---

## APK File Information

| Type | Size | Purpose |
|------|------|---------|
| Debug APK | ~5-8 MB | Development & Testing |
| Release APK | ~3-5 MB | Production & Store |

---

## Next Steps

1. ✅ Build the APK (completed above)
2. 📦 Install on device
3. 🎮 Play and test the game
4. 🔧 Customize the code as desired
5. 📤 Submit to Google Play Store (optional)

---

## Support Resources

- Android Studio Help: Help → Android Studio Help
- Android Documentation: https://developer.android.com/docs
- Stack Overflow: Tag questions with `android` and `gradle`
- GitHub Issues: For specific project issues

---

**You're all set! Enjoy building with ZeBuild!** 🚀🏰
