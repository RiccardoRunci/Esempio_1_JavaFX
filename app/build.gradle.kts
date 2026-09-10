plugins {
    id("org.openjfx.javafxplugin") version "0.1.0" //Serve per JAVAFX
    application
}

repositories {
    mavenCentral()
}

dependencies {
    //JAVAFX(25):
    implementation("org.openjfx:javafx-controls:25") // 25 numero di versione
    implementation("org.openjfx:javafx-fxml:25") // 25 numero di versione
    //JUNIT(6):
    testImplementation(platform("org.junit:junit-bom:6.1.1")) //importa junit6:
    testImplementation("org.junit.jupiter:junit-jupiter") //importa l'engine di junit6:
    // RISOLUZIONE DEL PROBLEMA: Launcher necessario a Gradle/IDE per eseguire JUnit 6
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.guava)
}
//JAVAFX(25):
javafx {
    version = "25" // 25 numero di versione non è neccessario che sia = alla versione di java!
    modules = listOf("javafx.controls", "javafx.fxml")
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "Main.Main1"
}
tasks.test { // Obbligatorio per eseguire i test con JUnit
    useJUnitPlatform()
    /*Ti fa vedere test per test se passato, skippato o fallito!*/
    testLogging{ events("passed", "skipped", "failed")}
}