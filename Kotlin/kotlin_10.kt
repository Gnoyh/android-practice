// 컴패니언 클래스 : 클래스 이름으로 접근 (객체 생성 필요 X)
class kotlin_10_1 {
    var data10_1 = 10

    fun kotlin_10_2() {
        println("${data10_1}")
    }
}

// 클래스 이름으로 접근시 오류 -> companion 키워드 선언
fun kotlin_10_3() {
    val data10_2 = kotlin_10_1()

    data10_2.data10_1 = 20
    data10_2.kotlin_10_2()

    kotlin_10_1.data10_1 = 20   // 오류
    kotlin_10_1.kotlin_10_2()   // 오류
}

class kotlin_10_4 {
    companion object {
        var data10_3 = 10

        fun kotlin_10_5() {
            println("${data10_3}")
        }
    }
}

fun kotlin_10_6() {
    kotlin_10_4.data10_3 = 20
    kotlin_10_4.kotlin_10_5()
}

/*

실행 결과

20

*/