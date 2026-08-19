# ProGuard rules for ZeBuild

# Keep Android framework classes
-keep class android.** { *; }
-keep class androidx.** { *; }

# Keep application classes
-keep class com.zebuild.game.** { *; }
-keep public class com.zebuild.game.MainActivity
-keep public class com.zebuild.game.GameActivity
-keep public class com.zebuild.game.ShopActivity
-keep public class com.zebuild.game.Building

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep enums
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep custom application classes
-keepclassmembers class * {
    public void on*(android.view.View);
}

# Preserve line numbers for debugging
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Remove logging
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
}
