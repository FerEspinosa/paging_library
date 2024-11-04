plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.curso.android.app.practica.paginglibrary"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.curso.android.app.practica.paginglibrary"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Retrofit
    val retrofit_version = "2.11.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.google.code.gson:gson:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")
    // Retrofit + RXjava3
    implementation ("com.squareup.retrofit2:adapter-rxjava3:$retrofit_version")

    // Paging
    val paging_version = "3.3.2"
    implementation("androidx.paging:paging-runtime:$paging_version")
    // Paging + RxJava3
    implementation ("androidx.paging:paging-rxjava3:$paging_version")

    // Dagger hilt
    implementation ("com.google.dagger:hilt-android:2.52")
    annotationProcessor ("com.google.dagger:hilt-compiler:2.52")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    // lifecycle
    val lifecycle_version = "2.8.6"
    // lifecycle-ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version")
    // lifecycle-LiveData
    implementation("androidx.lifecycle:lifecycle-livedata:$lifecycle_version")
}