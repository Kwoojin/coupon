val bootJar: org.springframework.boot.gradle.tasks.bundling.BootJar by tasks

bootJar.enabled = false

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.redisson:redisson-spring-boot-starter:3.16.4")
}

tasks.withType<Test> {
    useJUnitPlatform()
}