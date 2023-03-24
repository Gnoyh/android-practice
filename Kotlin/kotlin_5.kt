// 조건문 if ~ else
fun kotlin_5_1() {
    var data5_1 = 10

    if (data5_1 > 0) {
        println("data > 0")
    }
    else if (data5_1 < 0) {
        println("data < 0")
    }
    else {
        println("data = 0")
    }
}

/*

출력 결과

data > 0

*/

// if ~ else : 결괏값을 반환하는 표현식으로 사용 가능
fun kotlin_5_2() {
    var data5_2 = 10
    val data5_3 = if (data5_2 > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }

    println(data5_3)
}

/*

출력 결과

data > 0
true

*/

// 조건문 when
fun kotlin_5_3() {
    var data5_4 = 10

    when (data5_4) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> println("data is not valid data")
    }
}

/*

출력 결과

data is 10

*/

// when : 조건을 데이터 타입, 범위 등으로 다양하게 명시 가능
fun kotlin_5_4() {
    var data5_5: Any = 10

    when (data5_5) {
        is String -> println("data is String")
        20, 30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10")
        else -> println("data is not valid")
    }
}

/*

출력 결과

data is 1..10

*/

// when : 데이터 명시하지 않고 조건만 명시 가능
fun kotlin_5_5() {
    var data5_6 = 10

    when {
        data5_6 <= 0 -> println("data is <= 0")
        data5_6 > 100 -> println("data is > 100")
        else -> println("data is valid")
    }
}

/*

출력 결과

data is valid

*/

// when : 결괏값을 반환하는 표현식으로 사용 가능 (else 문 생략 불가)
fun kotlin_5_6() {
    var data5_7 = 10

    val data5_8 = when {
        data5_7 <= 0 -> "data is <= 0"
        data5_7 > 100 -> "data is > 100"
        else -> "data is valid"
    }

    println(data5_8)
}

/*

출력 결과

data is valid

*/

// 반복문 for
fun kotlin_5_7() {
    var data5_9: Int = 0

    // (i in 1..10) = {1, 2, ... , 10}
    // (i in 1 until 10) = {1, 2, ... , 9}
    // (i in 2..10 step 2) = {2, 4, ..., 10}
    // (i in 10 downTo 1) = {10, 9, ... , 1}
    for (i in 1..10) {
        data5_9 += i
    }

    println(data5_9)
}

/*

출력 결과

55

*/

// data.indices : 증감 조건 -> 컬렉션 타입의 데이터 개수
fun kotlin_5_8() {
    var data5_10 = arrayOf<Int>(10, 20, 30)

    for (i in data5_10.indices) {
        print(data5_10[i])

        if (i != data5_10.size - 1) print(", ")
    }
}

/*

출력 결과

10, 20, 30

*/

// data.withIndex() : 인덱스와 데이터 함께 가져오기
fun kotlin_5_9() {
    var data5_11 = arrayOf<Int>(10, 20, 30)

    for ((i, v) in data5_11.withIndex()) {
        print(v)

        if (i != data5_11.size - 1) print(", ")
    }
}

/*

출력 결과

10, 20, 30

*/

// 반복문 while
fun kotlin_5_10(args: Array<String>) {
    var data5_12 = 0
    var data5_13 = 0

    while (data5_12 < 10) {
        data5_13 += ++data5_12
    }

    println(data5_13)
}

/*

출력 결과

55

*/