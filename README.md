
# Movie App
This app fetches data about popular movies and displays them 
it fetches data from TMDB API .

## Tech Stack
* Minimum SDK level 21
* Kotlin based, Coroutines.
* Jetpack:
	* Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
	* ViewModel: Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
	* DataBinding: Binds UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
	* Room: Constructs Database by providing an abstraction layer over SQLite to allow fluent database access.
* Dagger: for Dependency Injection.
* Architecture:
	* MVVM Architecture (View - DataBinding - ViewModel - Model)
* Retrofit2 & OkHttp3: Construct the REST APIs and paging network data.
* Glide for image renderring.
* ksp: Kotlin Symbol Processing API.

https://github.com/uj-git/MovieApp/assets/84584289/5ef2f6e5-97df-4fa8-8531-861da711c37d
