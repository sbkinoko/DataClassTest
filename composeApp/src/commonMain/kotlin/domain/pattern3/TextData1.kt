package domain.pattern3

import androidx.compose.runtime.Stable

@Stable
data class TextData1(
    val text: String,
    val someList:List<Int> = emptyList(),
)
