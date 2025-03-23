package layout

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import viewmodel.KmpViewModel

@Composable
fun Pattern2(
    viewModel: KmpViewModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text("Pattern2")

        CounterComponent(
            viewModel = viewModel,
        )

        CounterClassComponent(
            viewModel = viewModel,
        )

        CounterDataComponent(
            viewModel = viewModel,
        )

        CounterDataVar1Component(
            viewModel = viewModel,
        )

        CounterDataVar2Component(
            viewModel = viewModel
        )
    }
}

@Composable
fun CounterComponent(
    viewModel: KmpViewModel,
) {
    Text(
        text = "counter : ${viewModel.counter}"
    )
}

@Composable
fun CounterClassComponent(
    viewModel: KmpViewModel,
) {
    val mCounterClass by viewModel.mCounterClass

    Text(
        text = "mCounterClass : ${mCounterClass.count}"
    )
}

@Composable
fun CounterDataComponent(
    viewModel: KmpViewModel,
) {
    val mCounterData by viewModel.mCounterData
    Text(
        text = "mCounterData : ${mCounterData.count}"
    )
}

@Composable
fun CounterDataVar1Component(
    viewModel: KmpViewModel,
) {
    val mCounterDataVar1 by viewModel.mCounterDataVar1
    Text(
        text = "mCounterData1 : ${mCounterDataVar1.count}"
    )
}

@Composable
fun CounterDataVar2Component(
    viewModel: KmpViewModel,
) {
    val mCounterDataVar2 by viewModel.mCounterDataVar2
    Text(
        text = "mCounterData2 : ${mCounterDataVar2.count}"
    )
}
