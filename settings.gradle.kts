pluginManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven {
            isAllowInsecureProtocol = true
            url = uri("http://185.110.188.132:8081/repository/maven-public/")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TMDB"
include(":app")
include(":core")
include(":core:data")
include(":core:model")
include(":feature")
include(":feature:detail")
include(":feature:home")
