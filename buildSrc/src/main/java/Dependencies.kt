/**
 * Created by florian on 18-03-16.
 */
object Versions {
    const val kotlin = "1.2.21"
    const val androidSupportLib = "27.1.0"
    const val androidConstraintLayout = "1.0.2"
    const val androidArchRoom = "1.0.0"
    const val googlePlaySdk = "11.8.0"
    const val dagger = "2.14.1"
    const val mosby3Mvi = "3.1.0"
    const val junit = "4.12"
    const val androidTestRunner = "1.0.1"
    const val androidTestEspresso = "3.0.1"
}

object Deps {
    const val kotlinStdLibJre8 = "org.jetbrains.kotlin:kotlin-stdlib-jre8:${Versions.kotlin}"
    const val supportAppCompatV7 = "com.android.support:appcompat-v7:${Versions.androidSupportLib}"
    const val supportConstraintLayout = "com.android.support.constraint:constraint-layout:${Versions.androidConstraintLayout}"
    const val googlePlaySdk = "com.google.android.gms:play-services-maps:${Versions.googlePlaySdk}"
    const val androidArchRoom = "android.arch.persistence.room:runtime:${Versions.androidArchRoom}"
    const val androidArchRoomCompiler = "android.arch.persistence.room:compiler:${Versions.androidArchRoom}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val mosby3Mvi = "com.hannesdorfmann.mosby3:mvi:${Versions.mosby3Mvi}";
    const val junit = "junit:junit:${Versions.junit}"
    const val androidTestRunner = "com.android.support.test:runner:${Versions.androidTestRunner}"
    const val androidTestEspresso = "com.android.support.test.espresso:espresso-core:${Versions.androidTestEspresso}"
}