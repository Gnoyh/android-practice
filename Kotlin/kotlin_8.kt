/// 데이터 클래스 : data 키워드로 선언 / 데이터를 객체로 묶어줌 / VO (value - object) 클래스 이용에 활용
class kotlin_8_1(val data8_1: String, val data8_2: String, val data8_3: Int)
data class kotlin_8_2(val data8_1: String, val data8_2: String, val data8_3: Int)

fun kotlin_8_3() {
    val data8_4 = kotlin_8_1("kkang", "a@a.com", 10)
    val data8_5 = kotlin_8_1("kkang", "a@a.com", 10)

    val data8_6 = kotlin_8_2("kkang", "a@a.com", 10)
    val data8_7 = kotlin_8_2("kkang", "a@a.com", 10)


    // equals() : 객체의 데이터가 같은지 비교
    println("${data8_4.equals(data8_5)}")
    println("${data8_6.equals(data8_7)}")
}

/*

실행 결과

false
true

*/

// equals() -> 주 생성자에 선언한 멤버 변수의 데이터만 비교 대상
data class kotlin_8_4(val data8_8: String, val data8_9: String, val data8_10: Int) {
    lateinit var data8_11: String

    constructor(data8_8: String, data8_9: String, data8_10: Int, data8_11: String): this(data8_8, data8_9, data8_10) {
        this.data8_11 = data8_11
    }
}

fun kotlin_8_5() {
    val data8_12 = kotlin_8_4("kkang", "a@a.com", 10, "seoul")
    val data8_13 = kotlin_8_4("kkang", "a@a.com", 10, "busan")

    println("${data8_12.equals(data8_13)}")
}

/*

실행 결과

true

*/

// toString() : 객체가 포함하는 멤버 변수의 데이터를 출력
fun kotlin_8_6() {
    class kotlin_8_7(val data8_12: String, val data8_13: String, val data8_14: Int)
    data class kotlin_8_8(val data8_12: String, val data8_13: String, val data8_14: Int)

    val data8_15 = kotlin_8_7("kkang", "a@a.com", 10)
    val data8_16 = kotlin_8_8("kkang", "a@a.com", 10)

    println("${data8_15.toString()}")
    println("${data8_16.toString()}")
}

/*

실행 결과

~~~ (Dummy)
kotlin_8_8(data8_12=kkang, data8_13=a@a.com, data8_14=10)

*/