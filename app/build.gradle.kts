plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.android_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.android_app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.coreKtx)
    implementation(libs.lifecycleKtx)
    implementation(platform(libs.composeBom))
    implementation(libs.composeActivity)
    implementation(libs.composeRuntime)
    implementation(libs.composeUi)
    implementation(libs.composeGraphics)
    implementation(libs.composePreview)
    implementation(libs.composeDebugPreview)
    implementation(libs.composeDebugManifest)
    implementation(libs.composeMaterial)
    implementation(libs.composeMaterial3)
    implementation(libs.jUnit)
    implementation(libs.jUnitTest)
    implementation(libs.jUnitUi)
    implementation(libs.espressoTest)

    implementation(libs.accomponistSystemUiController)

}