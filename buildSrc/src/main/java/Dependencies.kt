/**
 * Constants of dependency versions
 */
object Versions {
    // Android SDKs
    const val androidMinSdk = 23
    const val androidCompileSdk = 27
    const val androidTargetSdk = 27

    // Kotlin
    const val kotlin = "1.2.31"

    // Android Libraries
    const val androidGradlePlugin = "3.1.0"
    const val androidSupportLib = "27.1.0"
    const val androidSupportConstraintLayout = "1.0.2"
    const val androidArchRoom = "1.0.0"
    const val androidTestRunner = "1.0.1"
    const val androidTestEspresso = "3.0.1"

    // 3rd party
    const val googlePlaySdk = "11.8.0"
    const val dagger = "2.14.1"
    const val mosby3Mvi = "3.1.0"
    const val junit = "4.12"
    const val threeTenABP = "1.0.5"
}

/**
 * Constants of Gradle dependency names
 */
object Deps {
    // Kotlin
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLibJre7 = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val kotlinStdLibJre8 = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${Versions.kotlin}"

    // Android Libraries
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val androidSupportAppCompatV7 = "com.android.support:appcompat-v7:${Versions.androidSupportLib}"
    const val androidSupportConstraintLayout = "com.android.support.constraint:constraint-layout:${Versions.androidSupportConstraintLayout}"
    const val androidArchRoom = "android.arch.persistence.room:runtime:${Versions.androidArchRoom}"
    const val androidArchRoomCompiler = "android.arch.persistence.room:compiler:${Versions.androidArchRoom}"
    const val androidTestRunner = "com.android.support.test:runner:${Versions.androidTestRunner}"
    const val androidTestEspresso = "com.android.support.test.espresso:espresso-core:${Versions.androidTestEspresso}"

    // 3rd party
    const val googlePlaySdk = "com.google.android.gms:play-services-maps:${Versions.googlePlaySdk}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val mosby3Mvi = "com.hannesdorfmann.mosby3:mvi:${Versions.mosby3Mvi}"
    const val junit = "junit:junit:${Versions.junit}"
    const val threeTenABP = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenABP}"
}