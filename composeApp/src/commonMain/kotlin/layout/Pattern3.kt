package layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import domain.pattern3.TextData1
import domain.pattern3.TextData2
import viewmodel.KmpViewModel

@Composable
fun Pattern3(
    viewModel: KmpViewModel,
    modifier: Modifier = Modifier,
) {

    val uiState by viewModel.uiState

    println("ComposeTest pattern3")

    Column(modifier = modifier) {
        Text1(uiState.textData1)
        Text2(uiState.textData2)
        Button(onClick = {
            viewModel.updateUIState()
        }) {
            Text("change")
        }
    }
}

@Composable
private fun Text1(
    textData1: TextData1,
) {
    println("ComposeTest text1")
    Text(textData1.text)
}

@Composable
private fun Text2(
    textData2: TextData2,
) {
    println("ComposeTest text2")
    Text(textData2.text)
}
