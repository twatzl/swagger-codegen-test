plugins {
    kotlin("jvm")
    kotlin("kapt")
}

repositories {
    mavenCentral()
}

dependencies {

    implementation(platform(libs.cloudflight.platform.spring.bom))
    annotationProcessor(platform(libs.cloudflight.platform.spring.bom))
    testImplementation(platform(libs.cloudflight.platform.spring.test.bom))
    kapt(platform(libs.cloudflight.platform.spring.bom))
    implementation(project(":test-api"))

    implementation("io.cloudflight.platform.spring:platform-spring-i18n")
    implementation("io.cloudflight.platform.spring:platform-spring-logging")
    implementation("io.cloudflight.platform.spring:platform-spring-json")
    implementation("io.cloudflight.platform.spring:platform-spring-server-config")
    testImplementation("io.cloudflight.platform.spring:platform-spring-test")

    implementation("org.springframework.boot:spring-boot-actuator")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    implementation("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
}