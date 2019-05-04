# VolleyRequestConverter-android
Convert your volley request in URL and find value of Parameter using key.

 ## How to use
 
 ```java
     String url = "http://Example.com/android/api/abcd.php";
     Map<String, String> params = new HashMap<>();
     params.put("param1", "data1");
     params.put("param2", "data2");
     String full_url = new VolleyRequestConverter(url, params).getRequestedUrl();
```
