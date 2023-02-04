package net.subroh0508.versioncatalog.sample.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

expect fun getPlatformName(): String

private val items = List(100) {
    "${getPlatformName()} ${(it + 1).toString().padStart(3, '0')}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() = Surface(
    modifier = Modifier.fillMaxSize(),
    color = MaterialTheme.colorScheme.background,
) {
    Column(
        Modifier.padding(16.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        items.forEach {
            ListItem(
                { Text(it) },
                Modifier.clickable {  },
            )
        }
    }
}
