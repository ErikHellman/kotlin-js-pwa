plugins {
    id("org.jetbrains.kotlin.js") version "1.3.60"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.3.60"
}

group = "se.hellsoft"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
    jcenter()
}

kotlin {
    target.browser()

    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.2")
//    implementation("io.ktor:ktor-client-js:1.2.5")
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:0.13.0")
    }
}