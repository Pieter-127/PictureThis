# PictureThis - messing around with a StaggeredGrid

Just a basic proof of concept for making use of a StaggeredGridLayoutManager and some basics with coroutines and coil

<img src="art/image1.png" width="25%" /><img src="art/image2.png" width="25%" /><img src="art/image3.png" width="25%" />

# Summary
Made this project just as a basic example for how you'd use a StaggeredGridLayoutManager, for easy reference in future
note: I couldn't really find an api to return images with varying widths and heights so this example is just there for easy reference in future 

# How it's done
The app makes use of Kotlin and a few other libraries to create a native android application 

- Coil - For image loading
- Coroutines - For performing tasks on different threads
- Retrofit - For a service call to the api
- Timber - For logging any errors

...and a few more

# How would you run this ? 

You can simply clone this from github and open the project using android studio (the `master` branch is usually where the latest stable build can be found, `dev` is where I work on new features)  there shouldn't be any additional requirements or configurations needed.

# Attribution
[Lorem Picsum](https://picsum.photos) for their api 
