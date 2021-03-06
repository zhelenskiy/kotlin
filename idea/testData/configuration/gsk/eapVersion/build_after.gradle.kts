import org.gradle.api.JavaVersion.VERSION_1_7

plugins {
    application
    kotlin("jvm") version "$VERSION$"
}

application {
    mainClassName = "samples.HelloWorld"
}

repositories {
    jcenter()
}

dependencies {
    testCompile("junit:junit:4.12")
    implementation(kotlin("stdlib"))
}

// VERSION: $VERSION$