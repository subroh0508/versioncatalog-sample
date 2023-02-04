import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import net.subroh0508.versioncatalog.sample.common.App
import net.subroh0508.versioncatalog.sample.common.theme.Theme

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Theme { App() }
    }
}
