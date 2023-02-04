plugins {
    alias(libs.plugins.compose)
    alias(libs.plugins.android.library)
    kotlin("multiplatform")
}

kotlin {
    jvm("desktop")
    android()

    sourceSets {
        commonMain {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.material3)
                implementation(compose.materialIconsExtended)
                implementation(compose.preview)
            }
        }
    }
}

android {
    namespace = "net.subroh0508.versioncatalog.sample.common"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    compileSdk = 32

    defaultConfig {
        minSdk = 24
        targetSdk = 32
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
}
