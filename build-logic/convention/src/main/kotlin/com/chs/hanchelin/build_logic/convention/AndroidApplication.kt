package com.chs.hanchelin.build_logic.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureKotlinAndroid(
    commonExtension: CommonExtension<*, *, *, *, *>,
) {
    commonExtension.apply {
        compileSdk = 34

        defaultConfig {
            minSdk = 26
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17 // java source compile
            targetCompatibility = JavaVersion.VERSION_17 // 생성된 자바 바이트코드의 호환성 자바 버전
        }
    }

    configureKotlin()
}

private fun Project.configureKotlin() {
    tasks.withType<KotlinCompile>().configureEach { // 모든 task 중 KotlinCompile 부분만 진행
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_17.toString() // 모든 코틀린 컴파일에 대해 자바 17로 동작
        }
    }
}