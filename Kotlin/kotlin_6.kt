// 클래스 선언 : class / 멤버 : 생성자 (constructor), 변수, 함수, 클래스로 구성
class kotlin_6_1 {
    var data6_1 = "kkang"

    constructor(data6_1: String) {
        this.data6_1 = data6_1
    }

    fun kotlin_6_2() {
        println("$data6_1")
    }

    class kotlin_6_3 { }
}

// 객체 생성시 new 키워드 사용 X / 생성자에 맞는 매개변수 입력 필요
fun kotlin_6_4() {
    val data6_2 = kotlin_6_1("kim")

    data6_2.kotlin_6_2()
}

/*

실행 결과

kim

*/

// 주 생성자 : constructor (생략 가능)
class kotlin_6_5 constructor() {

}

class kotlin_6_6() {

}

class kotlin_6_7(data6_3: String, data6_4: Int) {

}

fun kotlin_6_8() {
    val data6_5 = kotlin_6_7("kkang", 10)
}

// init : 주 생성자의 본문을 구현하고 싶을 때 사용
class kotlin_6_9(data6_6: String, data6_7: Int) {
    init {
        println("init")
    }
}

fun kotlin_6_10() {
    val data6_8 = kotlin_6_9("kkang", 10)
}

/*

실행 결과

init

*/

// 생성자의 매개변수 = 지역변수 / 다른 함수에서 사용하기 위해서는 멤버 변수 선언 및 대입 필요 (매개변수 선언시 var / val 키워드 사용 가능)
class kotlin_6_11(data6_9: String, data6_10: Int) {
    init {
        println("$data6_9, $data6_10")
    }

    fun kotlin_6_12() {
        println("$data6_9, $data6_10")  // 오류
    }
}

class kotlin_6_13(var data6_11: String, var data6_12: Int) {
    fun kotlin_6_14() {
        println("$data6_11, $data6_12")
    }
}

fun kotlin_6_15() {
    val data6_13 = kotlin_6_13("kkang", 10)

    data6_13.kotlin_6_14()
}

/*

실행 결과

kkang, 10

*/

// 보조 생성자 : constructor (본문에 선언 / 여러 개 추가 가능)
class kotlin_6_16 {
    constructor(data6_14: String) {
        println("$data6_14")
    }

    constructor(data6_14: String, data6_15: Int) {
        println("$data6_14, $data6_15")
    }
}

fun kotlin_6_17() {
    val data6_16 = kotlin_6_16("kkang")
    val data6_17 = kotlin_6_16("kkang", 10)
}

/*

실행 결과

kkang
kkang, 10

*/

// 주 생성자와 보조 생성자 모두 선언 -> 생성자끼리 연결 필요 (this())
class kotlin_6_18(data6_18: String) {
    constructor(data6_18: String, data6_19: Int) {      // 오류

    }
}

class kotlin_6_19(data6_20: String) {
    constructor(data6_20: String, data6_21: Int): this(data6_20) {

    }

    constructor(data6_20: String, data6_21: Int, data6_22: String): this(data6_20, data6_21) {

    }
}