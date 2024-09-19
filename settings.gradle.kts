plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "belajar-kotlin-oop"
include("src:utils")
findProject(":src:utils")?.name = "utils"
