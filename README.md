# VolleyRequestConverter-android
Convert your volley request in URL and find value of Parameter using key.

[![](https://jitpack.io/v/hvyas3662/VolleyRequestConverter-android.svg)](https://jitpack.io/#hvyas3662/VolleyRequestConverter-android)

## How to configure

 1. Add maven in your root build.gradle at the end of repositories
 2. Add the dependency
```gradle
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  implementation 'com.github.hvyas3662:VolleyRequestConverter-android:3.0'
}
```

 ## How to use
 
 ```java
     String url = "http://Example.com/android/api/abcd.php";
     Map<String, String> params = new HashMap<>();
     params.put("param1", "data1");
     params.put("param2", "data2");
     String full_url = new VRC(url, params).getRequestedUrl();
```
