# VolleyRequestConverter-android
Convert your volley request in URL and find value of Parameter using key.

[![](https://jitpack.io/v/hvyas3662/VRC-android.svg)](https://jitpack.io/#hvyas3662/VRC-android)

## How to configure

1. Add maven in your root build.gradle

```gradle
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add the dependency in your App level build.gradle

```gradle
dependencies {
  implementation 'com.github.hvyas3662:VRC-android:v4.0'
}
```

## How to use

 ```kotlin
val url = "http://Example.com/android/api/abcd.php"
val params: MutableMap<String, String> = HashMap()
params["search"] = searchQuery
val fullUrl: String = Vrc(url, params).getRequestedUrl()
```
