// open : 상속할 수 있는 class 만드는 키워드 (없으면 다른 클래스가 상속 X)
open class kotlin_7_1(data7_1: String) {     // 상위 클래스

}

class kotlin_7_2(data7_1: String): kotlin_7_1(data7_1) {    // 하위 클래스

}

// 상속의 최고 이점 : 상위 클래스에 정의된 멤버를 하위 클래스에서 사용 가능
open class kotlin_7_3 {
    var data7_2 = 10

    fun kotlin_7_4() {
        println("$data7_2")
    }
}

class kotlin_7_5: kotlin_7_3()

fun kotlin_7_6() {
    val data7_3 = kotlin_7_5()

    data7_3.data7_2 = 20
    data7_3.kotlin_7_4()
}

// 오버라이딩 : 상위 클래스에 정의된 멤버를 하위 클래스에서 재정의 (주로 함수를 재정의)
open class kotlin_7_7 {
    open var data7_4 = 10

    open fun kotlin_7_8() {
        println("super class : $data7_4")
    }
}

class kotlin_7_9: kotlin_7_7() {
    override var data7_4 = 20

    override fun kotlin_7_8() {
        println("sub class : $data7_4")
    }
}

fun kotlin_7_10() {
    val data7_5 = kotlin_7_9()

    data7_5.kotlin_7_8()
}

/*

실행 결과

sub class : 20

*/

// 접근 제한자 : 코틀린에서는 변수나 함수를 클래스로 묶지 않고, 접근 제한자로 범위 지정 가능
// public : 최상위 - 모든 파일에서 가능 / 클래스 멤버 - 모든 클래스에서 가능
// internal : 최상위 - 같은 모듈 내에서 가능 / 클래스 멤버 - 같은 모듈 내에서 가능
// protected : 최상위 - 사용 불가 / 클래스 멤버 - 상속 관계의 하위 클래스에서만 가능
// private : 최상위 - 파일 내부에서만 가능 / 클래스 멤버 - 클래스 내부에서만 가능
open class kotlin_7_11 {
    var data7_6 = 10
    protected var data7_7 = 20
    private var data7_8 = 30
}

class kotlin_7_12: kotlin_7_11() {
    fun kotlin_7_13() {
        data7_6++
        data7_7++
        data7_8++   // 오류
    }
}

fun kotlin_7_14() {
    val data7_9 = kotlin_7_11()

    data7_9.data7_6++
    data7_9.data7_7++   // 오류
    data7_9.data7_8++   // 오류
}