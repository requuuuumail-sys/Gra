# ZeBuild - Quick Start Guide (5-10 Minutes)

## ⚡ Super Quick Version

### Already have Android Studio?
```bash
1. Clone/download all files
2. Open folder in Android Studio
3. Wait for Gradle sync
4. Build → Build APK(s)
5. Done! Your APK is ready
```

---

## 📋 Prerequisites Checklist

- [ ] Android Studio installed
- [ ] Java 11+ installed
- [ ] Android SDK installed
- [ ] 2GB free disk space
- [ ] Internet connection

**Don't have these?** → See INSTALLATION_GUIDE.md

---

## 🚀 Step-by-Step (5 minutes)

### 1. Prepare Files (1 min)
```
Create this folder structure:
ZeBuild/
├── app/
│   ├── src/main/java/com/zebuild/game/ [put .java files here]
│   ├── src/main/res/layout/ [put .xml layout files here]
│   ├── src/main/res/values/ [put colors/strings/styles.xml here]
│   ├── src/main/res/drawable/ [put all drawable .xml files here]
│   ├── src/main/AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

### 2. Open in Android Studio (1 min)
```
1. File → Open
2. Select ZeBuild folder
3. Click Open
4. Wait for Gradle sync (3-5 minutes)
```

### 3. Build APK (2 min)
```
Build → Build Bundle(s) / APK(s) → Build APK(s)
Wait for: "Build APK(s) finished successfully"
```

### 4. Install on Device (1 min)
```
Option A: Android Studio
- Run → Run 'app'
- Select device
- Click OK

Option B: Manual
- Find APK: app/build/outputs/apk/debug/app-debug.apk
- Copy to phone
- Tap to install
```

**Done!** ✅ Play the game!

---

## 📁 Files Needed (Quick Copy-Paste)

### Java Files (4)
Copy to: `app/src/main/java/com/zebuild/game/`
```
✓ MainActivity.java
✓ GameActivity.java
✓ ShopActivity.java
✓ Building.java
```

### Layout Files (3)
Copy to: `app/src/main/res/layout/`
```
✓ activity_main.xml
✓ activity_game.xml
✓ activity_shop.xml
```

### Resource Files (3)
Copy to: `app/src/main/res/values/`
```
✓ colors.xml
✓ strings.xml
✓ styles.xml
```

### Config Files (3)
```
✓ AndroidManifest.xml → app/src/main/
✓ build.gradle → app/
✓ settings.gradle → ZeBuild/root
```

### Drawable Files (OPTIONAL - 21 files)
Copy to: `app/src/main/res/drawable/`
```
All .xml drawable files
(Game will work without these, using default UI)
```

---

## ⚠️ If You Get Errors

| Error | Fix |
|-------|-----|
| "Cannot find symbol R" | Rebuild: Build → Clean Project → Rebuild |
| "Gradle sync failed" | File → Invalidate Caches → Restart |
| "SDK not found" | File → Project Structure → set SDK path |
| "Java version error" | Install Java 11+ (see INSTALLATION_GUIDE.md) |

---

## 🎮 Game Controls (Once Installed)

| Button | Action |
|--------|--------|
| PLAY | Start game |
| SHOP | Buy buildings |
| + Button | Add building (costs 100 Gold) |
| ⬆ Button | Upgrade building (costs 50 Elixir) |
| ← Button | Back to menu |

---

## 📦 What You Get

- ✅ Fully functional village-building game
- ✅ Resource management (Gold & Elixir)
- ✅ Multiple building types
- ✅ Tap-to-collect mechanic
- ✅ Shop system
- ✅ Upgrade system
- ✅ Android 5.0+ support

---

## 🔧 Customization (Optional)

### Change Game Resources
Edit `Building.java`:
```java
productionRate = 5; // Change how fast buildings produce
```

### Change Colors
Edit `colors.xml`:
```xml
<color name="colorPrimary">#2E7D32</color>
```

### Add More Buildings
Edit `GameActivity.java`:
```java
buildings.add(new Building(x, y, "NewBuilding", 70, 70, Color.CYAN));
```

---

## 📱 Device Requirements

- **Minimum:** Android 5.0 (SDK 21)
- **RAM:** 1GB minimum
- **Storage:** ~10MB free
- **Display:** Any screen size (optimized for portrait)

---

## 🎓 Project Structure Overview

```
ZeBuild/
├── Java Code (Game Logic)
├── XML Layouts (UI Design)
├── Resource Files (Colors, Strings)
├── Drawable Files (Graphics/Icons)
└── Config Files (Build Settings)

Total: 42 files
Build Size: 4-8 MB APK
```

---

## 🔄 Build Commands (Terminal)

If you prefer command line:

```bash
# Navigate to project
cd ZeBuild

# Sync Gradle
./gradlew clean

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Install on device
./gradlew installDebug
adb shell am start -n com.zebuild.game/.MainActivity
```

---

## 📍 Find Your APK

After build:
```
Location: app/build/outputs/apk/debug/app-debug.apk

File size: ~5-8 MB
Ready to: Install on device or share
```

---

## ✨ Next Steps After Building

1. **Install on device** - Test gameplay
2. **Customize** - Modify colors, buildings, mechanics
3. **Add features** - Multiplayer, raids, achievements
4. **Publish** - Upload to Google Play Store
5. **Monetize** - Add ads or in-app purchases

---

## 🆘 Common Issues

### "Project won't sync"
```
Solution: File → Invalidate Caches → Restart
```

### "APK not building"
```
Solution: Build → Clean Project → Rebuild Project
```

### "App crashes on launch"
```
Solution: Check Android version (5.0+), check logcat for errors
```

### "Icons not showing"
```
Solution: They're optional - game works without them
Or: Add drawable files from GRAPHICS_GUIDE.md
```

---

## 📚 Full Documentation

- **README.md** - Features & overview
- **INSTALLATION_GUIDE.md** - Detailed setup (15+ pages)
- **GRAPHICS_GUIDE.md** - Icon & graphics customization
- **PROJECT_STRUCTURE.md** - Complete file reference

---

## 🎯 Success Checklist

- [ ] All files organized correctly
- [ ] Gradle sync successful
- [ ] Project builds without errors
- [ ] APK file created
- [ ] App installs on device
- [ ] Game runs and is playable
- [ ] Buttons work correctly
- [ ] Resources display correctly

---

## ⏱️ Estimated Time

| Task | Time |
|------|------|
| Download & organize files | 2 min |
| Open in Android Studio | 2 min |
| Gradle sync | 3-5 min |
| Build APK | 2-3 min |
| Install on device | 1 min |
| **Total** | **~15 min** |

---

## 🚀 Ready to Build?

1. Go through the file list above
2. Organize files in correct directories
3. Open in Android Studio
4. Click Build → Build APK(s)
5. Wait for success message
6. Your APK is ready! 🎉

---

## 📞 Need Help?

- **Build errors:** Check INSTALLATION_GUIDE.md
- **Graphics issues:** Check GRAPHICS_GUIDE.md
- **Code customization:** Check comments in .java files
- **File organization:** Check PROJECT_STRUCTURE.md

---

**You've got everything you need. Let's build ZeBuild!** 🏰✨

Questions? Check the detailed guides above.
