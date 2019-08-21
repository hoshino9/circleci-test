plugins {
	kotlin("jvm") version "1.3.41"
}

val arrowVersion = "0.10.0"

repositories {
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/arrow-kt/arrow-kt/")
}

dependencies {
	compile("io.arrow-kt:arrow-core:$arrowVersion")
	compile("io.arrow-kt:arrow-core-extensions:$arrowVersion")
	compile("io.arrow-kt:arrow-syntax:$arrowVersion")
	compile("io.arrow-kt:arrow-typeclasses:$arrowVersion")
	compile("io.arrow-kt:arrow-extras-data:$arrowVersion")
	compile("io.arrow-kt:arrow-extras-extensions:$arrowVersion")
}