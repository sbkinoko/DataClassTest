package viewmodel

import androidx.compose.runtime.mutableStateOf
import domain.CounterClass
import domain.CounterData
import domain.CounterDataVar
import domain.pattern3.TextData1
import domain.pattern3.TextData2
import domain.pattern3.UIState

class KmpViewModel {

    var counter = 0

    val mCounterClass = mutableStateOf(
        CounterClass()
    )

    val mCounterData = mutableStateOf(
        CounterData()
    )

    val mCounterDataVar1 = mutableStateOf(
        CounterDataVar()
    )

    val mCounterDataVar2 = mutableStateOf(
        CounterDataVar()
    )

    fun addCount() {
        counter++

        mCounterClass.value.count++

        mCounterData.value = mCounterData.value.run {
            copy(
                count = count + 1
            )
        }

        mCounterDataVar1.value.count++

        mCounterDataVar2.value = mCounterDataVar2.value.run {
            copy(
                count = count + 1
            )
        }
    }

    val uiState = mutableStateOf(
        UIState(
            TextData1(""),
            TextData2(""),
        )
    )

    fun updateUIState() {
        uiState.value = uiState.value.let {
            it.copy(
                textData2 = it.textData2.run {
                    copy(text = text + "a")
                }
            )
        }
    }
}
