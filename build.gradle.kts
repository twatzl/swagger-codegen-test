plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("kapt") version "1.9.0"
}


group = "org.example"
version = "1.0-SNAPSHOT"
description = "asdf"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

allprojects {

    repositories {
        mavenCentral()
    }
}

subprojects.forEach {
    if (!it.name.endsWith("-ui")) {
        dependencies {
            implementation(platform(libs.cloudflight.platform.spring.bom))
            annotationProcessor(platform(libs.cloudflight.platform.spring.bom))
            testImplementation(platform(libs.cloudflight.platform.spring.test.bom))
            kapt(platform(libs.cloudflight.platform.spring.bom))
        }
    }
}