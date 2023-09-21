pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {

            version("coroutines", "1.7.3")
            library("coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").versionRef("coroutines")
            library("coroutines-android", "org.jetbrains.kotlinx", "kotlinx-coroutines-android").versionRef("coroutines")

            version("androidx-core", "1.12.0")
            library("androidx-core-ktx", "androidx.core", "core-ktx").versionRef("androidx-core")

            version("activity", "1.7.2")
            library("activity-ktx", "androidx.activity", "activity-ktx").versionRef("activity")
            library("activity-compose", "androidx.activity", "activity-compose").versionRef("activity")

            version("compose", "1.5.1")
            version("composeCompiler", "1.5.3")
            library("compose-foundation", "androidx.compose.foundation", "foundation").versionRef("compose")
            library("compose-ui", "androidx.compose.ui", "ui").versionRef("compose")
            library("compose-material", "androidx.compose.material", "material").versionRef("compose")
            library("compose-tooling", "androidx.compose.ui", "ui-tooling").versionRef("compose")

            version("decompose", "2.0.2")
            version("essenty", "1.1.0")
            library("decompose", "com.arkivanov.decompose", "decompose").versionRef("decompose")
            library("decompose-compose", "com.arkivanov.decompose", "extensions-compose-jetpack").versionRef("decompose")
            library("essenty-lifecycle", "com.arkivanov.essenty", "lifecycle").versionRef("essenty")
        }
    }
}

rootProject.name = "GeminioTest"
include(":app")
