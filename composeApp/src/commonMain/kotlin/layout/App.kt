package layout

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.koinInject
import viewmodel.KmpViewModel

@Composable
@Preview
fun App(
    viewModel: KmpViewModel = koinInject(),
) {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 20.dp,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            val modifier = Modifier
                .padding(5.dp)
                .border(
                    width = 1.dp,
                    color = Color.Black
                )
                .fillMaxWidth()

            Pattern1(
                modifier = modifier,
                viewModel = viewModel,
            )

            Pattern2(
                modifier = modifier,
                viewModel = viewModel,
            )

            Button(
                onClick = {
                    viewModel.addCount()
                }
            ) {
                Text("+")
            }

            Pattern3(
                modifier = modifier,
                viewModel = viewModel,
            )
        }
    }
}
