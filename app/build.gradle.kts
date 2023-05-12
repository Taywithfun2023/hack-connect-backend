/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("hack.connect.backend.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("hack.connect.backend.app.AppKt")
}