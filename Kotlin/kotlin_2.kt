// 코틀린의 모든 변수는 객체 (Int : 클래스)
fun kotlin_2_1() {
    var data2_1: Int = 10
    var data2_2: Int? = null  // null 대입 가능 (? : 널 허용의 의미)

    data2_1 = data2_1 + 10
    data2_1 = data2_1.plus(10)  // 객체의 메서드 이용 가능
}

// String 큰따옴표와 삼중 따옴표의 차이 (.trimIndent() : 문자열 앞 공백 없애줌)
fun kotlin_2_2() {
    val data2_3 = "Hello \n World"
    val data2_4 = """
        Hello
        World
    """

    println("str1: $data2_3")
    println("str2: $data2_4")
}

/*

실행 결과

str1: Hello
 World
str2:
    Hello
    World

*/

// Any : 최상위 클래스 / 모든 타입의 데이터 할당 가능
val data2_5: Any = 10
val data2_6: Any = "Hello"

class kotlin_2_3

val data2_7: Any = kotlin_2_3()


// Unit : Unit 타입으로 선언한 변수에는 Unit 객체만 대입 가능
// 주로 함수의 반환 타입으로 사용되어, 함수에서 반환문이 없음을 명시적으로 나타냄
val data2_8: Unit = Unit

fun kotlin_2_4(): Unit {
    println(10 + 20)
}

// Nothing : Nothing 타입으로 선언한 변수에는 null만 대입 가능
// 주로 함수의 반환 타입으로 사용되어, 함수가 반환은 하지만 의미 있는 값은 아니라는 의미를 나타냄 (예외를 던지는 함수에도 활용됨)
val data2_9: Nothing? = null

fun kotlin_2_5(): Nothing? {
    return null
}

fun kotlin_2_6(): Nothing {
    throw Exception()
}