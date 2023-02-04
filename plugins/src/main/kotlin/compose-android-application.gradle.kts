import extensions.*

plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

dependencies {
    implementation(project(":common"))

    implementation(compose.ui)
    implementation(compose.preview)
    @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
    implementation(compose.material3)
    implementation(libs.androidxCore)
    implementation(libs.androidxLifecycleRuntime)
    implementation(libs.androidxActivityCompose)

    testImplementation(libs.junit)

    @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
    androidTestImplementation(compose.uiTestJUnit4)
    androidTestImplementation(libs.androidxTestJunit)
    androidTestImplementation(libs.androidxTestEspresso)

    debugImplementation(compose.uiTooling)
}

android {
    androidConfig()

    defaultConfig {
        applicationId = ApplicationId
        versionCode = Version.code
        versionName = Version.name
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
