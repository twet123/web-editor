import org.jetbrains.kotlin.ir.backend.js.jsPhases

plugins {
    kotlin("multiplatform") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(npm("monaco-editor", "0.45.0"))
            }
        }
    }
}