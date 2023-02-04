package extensions

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

internal val VersionCatalog.androidxCore get() = getLibrary("androidx-core")
internal val VersionCatalog.androidxLifecycleRuntime get() = getLibrary("androidx-lifecycle-runtime")
internal val VersionCatalog.androidxActivityCompose get() = getLibrary("androidx-activity-compose")

internal val VersionCatalog.junit get() = getLibrary("junit")

internal val VersionCatalog.androidxTestJunit get() = getLibrary("androidx-test-junit")
internal val VersionCatalog.androidxTestEspresso get() = getLibrary("androidx-test-espresso")

internal val Project.libs: VersionCatalog get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

private fun VersionCatalog.getLibrary(library: String) = findLibrary(library).get()
