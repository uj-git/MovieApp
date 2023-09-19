
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
* Retrofit2, OkHttp3,  Glide.
* ksp: Kotlin Symbol Processing API.

![Movie App Demo](https://github.com/uj-git/MovieApp/assets/84584289/d0b82d2e-222d-4cd7-95f7-2db0eb482338)
