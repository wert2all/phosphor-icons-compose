import groovy.json.JsonSlurper

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.detekt)
    `maven-publish`
}

group = "com.wert2all.icons.phosphor"
version = getVersion()

android {
    namespace = project.group.toString()
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
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

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

detekt {
    config.setFrom(file("$projectDir/../config/detekt.yml"))
    buildUponDefaultConfig = true
    parallel = true
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.wert2all"
            artifactId = "phosphor-icons-compose"
            version = project.version.toString()

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

fun getVersion(): String {
    val releasePleaseManifest = rootProject.file(".release-please-manifest.json")
    val versionJson = JsonSlurper().parseText(releasePleaseManifest.readText()) as Map<*, *>
    return versionJson["."] as String
}
