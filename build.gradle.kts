// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies{
        classpath(libs.gradle)
        //classpath(libs.plugins.hilt)
        // NOTE: I took this out because it caused error. Bare in mind
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.hilt) apply false
}