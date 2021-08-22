# RetrofitSafeCallUtil
For retrofit error handling

the try catch will called feom the util and you will get a data class Which contains the result, error(in case there is one), and status of the retrofit request

You need to call 

```SafeCall.fetch { <retrofit2.Response<T>> }```

For example

```SafeCall.fetch { api.getPopularMovies() }```

This return SimpleResponse<T>

```
data class SimpleResponse<T>(
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
