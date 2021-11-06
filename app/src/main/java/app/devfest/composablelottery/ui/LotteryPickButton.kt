package app.devfest.composablelottery.ui

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LotteryPickButton(
    totalLottoList: List<Int>,
    pickedLottoList: List<Int>,
    onLottoNumberPicked: (Int) -> Unit,
    onResetLottoList: () -> Unit
) {

    /**
     * 로또 번호를 뽑는 버튼을 만듭니다.
     * 뽑힌 공 갯수가 6개라면 "다시 뽑기" 버튼, 아니라면 "뽑기" 버튼을 표시합니다.
     *
     * 뽑기 버튼을 눌렀을때는 [onLottoNumberPicked] 에 totalLottoList 에서 랜덤으로 뽑힌 숫자와 함께 invoke,
     * 다시 뽑기 버튼을 눌렀을때는 [onResetLottoList] 를 invoke 합니다.
     * */
    if (pickedLottoList.size == 6) {
        // 다시 뽑기 버튼 구현
        Button(onClick = { onResetLottoList() }) {
            Text(text = "다시 뽑기")
        }

    } else {
        // 뽑기 버튼 구현
        Button(onClick = { onResetLottoList() }) {
            Text(text = "뽑기")
        }

    }

}

@Preview
@Composable
fun lotteryButton() {
    LotteryPickButton(
        totalLottoList = listOf(1, 10, 20, 30, 40, 45),
        pickedLottoList = listOf(1, 11, 22, 33, 44, 45),
        onLottoNumberPicked = {}
    ) {

    }
}