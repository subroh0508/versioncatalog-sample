package net.subroh0508.versioncatalog.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.subroh0508.versioncatalog.sample.common.App
import net.subroh0508.versioncatalog.sample.common.theme.Theme
import net.subroh0508.versioncatalog.sample.ui.theme.VersionCatelogSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme { App() }
        }
    }
}
