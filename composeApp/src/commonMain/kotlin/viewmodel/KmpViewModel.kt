package viewmodel

import androidx.compose.runtime.mutableStateOf
import domain.CounterClass
import domain.CounterData
import domain.CounterDataVar
import org.koin.core.component.KoinComponent

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
}
