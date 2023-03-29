// 람다 함수 (익명 함수) : 고차 함수 사용을 위해 필요 (고차 함수 : 매개변수나 반환값으로 함수를 이용)
val kotlin_11_1 = {data11_1: Int, data11_2: Int -> data11_1 + data11_2}

// 일반 함수
fun kotlin_11_2(data11_1: Int, data11_2: Int): Int {
    return data11_1 + data11_2
}

fun kotlin_11_3() {
    println("${kotlin_11_1(10, 20)}")

    println("${{data11_1: Int, data11_2: Int -> data11_1 + data11_2} (10, 20)}")
}

/*

실행 결과

30
30

*/

// 매개변수 없는 람다 함수
fun kotlin_11_4() {
    val kotlin_11_5 = {println("function call")}

    kotlin_11_5()
}

/*

실행 결과

function call

*/

// 매개변수가 1개인 람다 함수 : (Int) -> Unit이 매개변수가 1개인 람다 함수임을 알려줌 (it 키워드로 매개변수 생략 가능)
fun kotlin_11_6() {
    val kotlin_11_7 = {data11_3: Int -> println(data11_3)}
    val kotlin_11_8: (Int) -> Unit = {println(it)}

    kotlin_11_7(10)
    kotlin_11_8(10)
}

/*

실행 결과

10
10

*/

// 람다 함수의 반환값 : 마지막 줄의 실행 결과
fun kotlin_11_9() {
    val kotlin_11_10 = {data11_4: Int, data11_5: Int ->
        println("lambda function")
        data11_4 * data11_5
    }

    println("${kotlin_11_10(10, 20)}")
}

/*

실행 결과

lambda function
200

*/