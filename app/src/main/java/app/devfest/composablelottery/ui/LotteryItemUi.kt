package app.devfest.composablelottery.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.devfest.composablelottery.AppTheme

@Composable
fun LotteryItemUi(lottoNumber: Int) {
    /**
    * 이곳은 로또 공 UI 를 구현할 Composable 함수입니다.
    * 매개변수로 Int 자료형의 Lotto Number 를 받습니다.
    * number 의 범위에 따라 다른 색상을 표시합니다.
    * */

    val ballColor = when (lottoNumber) {
        in 1 .. 10 -> Color(0xFFE9B823)
        in 11 .. 20 -> Color(0xFF237CE9)
        in 21 .. 30 -> Color(0xFFC93737)
        in 31 .. 40 -> Color(0xFF505050)
        in 31 .. 45 -> Color(0xFF46A22C)
        else -> Color(0x00000000)
    }

    Surface(
        color = ballColor,
        modifier = Modifier.padding(5.dp).width(30.dp).height(30.dp).clip(CircleShape)) {

        Text(text = "$lottoNumber", modifier = Modifier.padding(5.dp), textAlign = TextAlign.Center)
    }

}

@Composable
@Preview
fun LotteryItemUiPreview() {
    AppTheme {
        Row {
            LotteryItemUi(1)
            LotteryItemUi(20)
            LotteryItemUi(30)
            LotteryItemUi(40)
            LotteryItemUi(45)
        }
    }
}