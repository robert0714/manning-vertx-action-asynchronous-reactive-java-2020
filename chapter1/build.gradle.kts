plugins {
  java
  application
}

repositories {
  mavenCentral()
  maven {
    url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
  }
}

dependencies {
  implementation("io.vertx:vertx-core:4.2.1")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

application {
  mainClassName = project.properties.getOrDefault("mainClass", "chapter1.firstapp.VertxEcho") as String
}

tasks.wrapper {
  gradleVersion = "6.8.3"
}
