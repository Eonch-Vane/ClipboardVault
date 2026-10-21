// 顶层只声明插件与版本，不 apply；具体应用到 app 模块
plugins {
	id("com.android.application") version "8.7.3" apply false
	id("org.jetbrains.kotlin.android") version "2.1.21" apply false
	// Compose 编译器已并入 Kotlin 工具链，用此插件替代 kotlinCompilerExtensionVersion
	id("org.jetbrains.kotlin.plugin.compose") version "2.1.21" apply false
}                
