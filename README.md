# CrashUncaughtException
## 1.Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

## 2.Add the dependency

     dependencies {
  	        compile 'com.github.Everglowzz:CrashUncaughtException:4.0.0'
	  }
	  
## 3.save path is "/sdcard/crash/" or "/crash/"

## 4. permission , attention android 6.0 + 
  
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
