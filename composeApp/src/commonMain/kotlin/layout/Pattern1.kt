package layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import viewmodel.KmpViewModel

@Composable
fun Pattern1(
    viewModel: KmpViewModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text("Pattern1")
        Text(
            text = "counter : ${viewModel.counter}"
        )

        val mCounterClass by viewModel.mCounterClass
        Text(
            text = "mCounterClass : ${mCounterClass.count}"
        )

        val mCounterData by viewModel.mCounterData
        Text(
            text = "mCounterData : ${mCounterData.count}"
        )

        val mCounterDataVar1 by viewModel.mCounterDataVar1
        Text(
            text = "mCounterData1 : ${mCounterDataVar1.count}"
        )

        val mCounterDataVar2 by viewModel.mCounterDataVar2
        Text(
            text = "mCounterData2 : ${mCounterDataVar2.count}"
        )
    }
}
