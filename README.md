# RetrofitSafeCallUtil
For retrofit error handling

the try catch(to retrofit service) will called from the RetrofitSafeCallUtil and you will get a data class Which contains the result, error(in case there is one), and status of the retrofit request

![GitHub release (latest by date)](https://img.shields.io/github/v/release/davidHarush/RetrofitSafeCallUtil)
![GitHub top language](https://img.shields.io/github/languages/top/davidHarush/RetrofitSafeCallUtil)
![GitHub repo size](https://img.shields.io/github/repo-size/davidHarush/RetrofitSafeCallUtil)
![GitHub issues](https://img.shields.io/github/issues/davidHarush/RetrofitSafeCallUtil)
[![CodeFactor](https://www.codefactor.io/repository/github/davidharush/retrofitsafecallutil/badge)](https://www.codefactor.io/repository/github/davidharush/retrofitsafecallutil)


You need to call  <br/>
```SafeCall.fetch { <retrofit2.Response<T>> }``` <br/>
For example <br/>
``` 
val request = SafeCall.fetch { api.getPopularMovies() }
if (request.failed || !request.isSuccessful) {
	//  do failed action
} else{
	//  do isSuccessful action
}
        
```

This return SafeResponse<T>

```
data class SafeResponse<T>(
    val status: Status,
    val data: Response<T>?,
    val exception: Exception?
)
```

### Dependency

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.davidHarush:RetrofitSafeCallUtil:1.1'
	}

For more info : <br/>
[![](https://jitpack.io/v/davidHarush/RetrofitSafeCallUtil.svg)](https://jitpack.io/#davidHarush/RetrofitSafeCallUtil)
