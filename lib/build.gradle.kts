import java.net.URI

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.detekt)
    id("org.gradle.maven-publish")
    signing
}

android {
    namespace = "com.wert2all.icons.phosphor"
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

val pomName = "Phosphor Icons for Jetpack Compose"
val pomDescription = "An implementation of Phosphor Icons for Android Jetpack Compose. This library provides the full set of Phosphor Icons as ImageVectors for use in your Compose applications."
val pomUrl = "https://github.com/wert2all/phosphor-icons-compose"
val pomScmUrl = "https://github.com/wert2all/phosphor-icons-compose"
val pomScmConnection = "scm:git:github.com/wert2all/phosphor-icons-compose.git"
val pomScmDevConnection = "scm:git:ssh://github.com:wert2all/phosphor-icons-compose.git"
val pomLicenseName = "The MIT License"
val pomLicenseUrl = "https://opensource.org/licenses/MIT"
val pomDeveloperId = "wert2all"
val pomDeveloperName = "wert2all"
val pomDeveloperEmail = "wert2all@gmail.com"


publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.wert2all.icons.phosphor"
            artifactId = "phosphor-icons-compose"
            version = project.version.toString()

            afterEvaluate {
                from(components["release"])
            }

            pom {
                name.set(pomName)
                description.set(pomDescription)
                url.set(pomUrl)
                licenses {
                    license {
                        name.set(pomLicenseName)
                        url.set(pomLicenseUrl)
                    }
                }
                developers {
                    developer {
                        id.set(pomDeveloperId)
                        name.set(pomDeveloperName)
                        email.set(pomDeveloperEmail)
                    }
                }
                scm {
                    url.set(pomScmUrl)
                    connection.set(pomScmConnection)
                    developerConnection.set(pomScmDevConnection)
                }
            }
        }
    }
    repositories {
        maven {
            name = "OSSRH"
            url = if (project.version.toString().endsWith("SNAPSHOT")) {
                URI("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            } else {
                URI("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            }
            credentials {
                username = System.getenv("OSSRH_USERNAME")
                password = System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}

signing {
    val signingKey = System.getenv("SIGNING_KEY")
    val signingPassword = System.getenv("SIGNING_PASSWORD")
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications)
}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    val composeBom = platform("androidx.compose:compose-bom:2025.05.00")
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.ui)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
