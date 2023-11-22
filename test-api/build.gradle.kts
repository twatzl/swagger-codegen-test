plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("io.cloudflight.autoconfigure.swagger-api-configure") version "1.1.0"
}

swagger {
    apiSource(closureOf<com.benjaminsproule.swagger.gradleplugin.model.ApiSourceExtension> {
        locations = mutableListOf(
            "io.test.api",
            "io.test.model"
        )
    })
}


repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(libs.cloudflight.platform.spring.bom))
    implementation("io.swagger:swagger-annotations")
    implementation("org.springframework:spring-web")
}