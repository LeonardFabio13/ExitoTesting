plugins {
    id("java")
    id("org.sonarqube") version "4.4.1.3373"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber
    testImplementation("net.serenity-bdd:serenity-cucumber:4.1.13")
    // https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
    testImplementation ("io.cucumber:cucumber-junit:2.3.1")
    testImplementation ("ch.qos.logback:logback-classic:1.2.11")
}

tasks.test {
    useJUnitPlatform()
}
sonar {
    properties {
        property("sonar.projectKey", "LeonardFabio13_ExitoTesting")
        property("sonar.organization", "leonardfabio13")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}