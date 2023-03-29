// 함수 타입 : 함수를 선언할 때 나타내는 매개변수와 반환 타입
fun kotlin_12_1(data12_1: Int, data12_2: Int): Int {
    return data12_1 + data12_2
}

/*

반환 타입

(Int, Int) -> Int

*/

val kotlin_12_2: (Int, Int) -> Int = {data12_1: Int, data12_2: Int -> data12_1 + data12_2}


// typealias : 타입의 별칭을 선언하는 키워드 / 데이터 타입을 선언할 때도 사용
typealias data12_3 = Int

fun kotlin_12_3() {
    val data12_4: Int = 10
    val data12_5: data12_3 = 10
}

typealias data12_6 = (Int, Int) -> Boolean

fun kotlin_12_4() {
    val kotlin_12_5: data12_6 = {data12_7: Int, data12_8: Int ->
        data12_7 > data12_8
    }

    println("${kotlin_12_5(10, 20)}")
    println("${kotlin_12_5(20, 10)}")
}

/*

실행 결과

false
true

*/

// 매개변수 타입 생략 가능 (유추 가능시)
val kotlin_12_6: data12_6 = {data12_9, data12_10 ->
    data12_9 > data12_10
}

val kotlin_12_7: (Int, Int) -> Boolean = {data12_11, data12_12 ->
    data12_11 > data12_12
}

val kotlin_12_8 = {data12_13: Int, data12_14: Int ->
    data12_13 > data12_14
}

// 고차 함수 : 함수를 매개변수로 전달받거나 반환하는 함수
fun kotlin_12_9(kotlin_12_10: (Int) -> Boolean): () -> String {
    val data12_15 = if(kotlin_12_10(10)) {
        "valid"
    } else {
        "invalid"
    }

    return {data12_15}
}

fun kotlin_12_11() {
    val kotlin_12_12 = kotlin_12_9({data12_16 -> data12_16 > 0})

    println(kotlin_12_12())
}

/*

실행 결과

valid

*/