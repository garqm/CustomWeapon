plugins {
    kotlin("jvm") version "1.5.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    maven("https://papermc.io/repo/repository/maven-public/")
    mavenCentral()
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    jar {
        from (shade.map { if (it.isDirectory) it else zipTree(it) })
    }
}