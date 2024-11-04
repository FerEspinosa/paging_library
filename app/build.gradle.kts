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
    implementation (libs.retrofit)
    implementation (libs.gson)
    implementation (libs.converter.gson)
    // Retrofit + RXjava3
    implementation (libs.adapter.rxjava3)

    // Paging
    implementation(libs.paging.runtime)
    // Paging + RxJava3
    implementation (libs.paging.rxjava3)

    // Dagger hilt
    implementation (libs.hilt.android)
    annotationProcessor (libs.hilt.compiler)

    // Glide
    implementation (libs.glide)

    // lifecycle-ViewModel
    implementation(libs.lifecycle.viewmodel)
    // lifecycle-LiveData
    implementation(libs.lifecycle.livedata)
}