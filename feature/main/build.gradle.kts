@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.hanchelin.android.library.compose)
    alias(libs.plugins.hanchelin.android.hilt)
}

android {
    namespace = "com.chs.hanchelin.feature.main"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}