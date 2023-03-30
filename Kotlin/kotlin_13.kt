// 널 (Null) : 객체가 주소를 가지지 못한 상태
val data13_1: String = "hello"  // 문자열 데이터가 저장된 주소가 대입되어있는 형태 / 그 주소로 문자열 데이터를 이용
val data13_2: String? = null    // 아직 주솟값을 가지지 못한 상태


// 널 포인트 예외 : 널인 상태의 객체를 이용할 수 없음 / 널 안정성 : 널 포인트 예외가 발생하지 않도록 코드를 작성하는 것
fun kotlin_13_1() {
    var data13_3: String? = null
    var data13_4 = if (data13_3 == null) {
        0
    } else {
        data13_3.length
    }

    println("$data13_4")
}

/*

실행 결과

0

*/

// 코틀린이 제공하는 널 안전성 연산자
fun kotlin_13_2() {
    var data13_5: String = null

    println("${data13_5?.length ?: 0}")
}

/*

실행 결과

0

*/

// 널 허용 연산자 : ?
fun kotlin_13_3() {
    var data13_6: String = "kkang"
    data13_6 = null     // 오류

    var data13_7: String? = "kkang"
    data13_7 = null
}

// 널 안전성 호출 연산자 : ?.
fun kotlin_13_4() {
    var data13_8: String? = "kkang"
    var data13_9 = data13_8.length  // 오류

    var data13_10: String? = "kkang"
    var data13_11 = data13_10?.length
}

// 엘비스 연산자 (변수가 널일 때 대입해아 하는 값이나 실행해야 하는 구문이 있을 때 사용) : ?:
fun kotlin_13_5() {
    var data13_12: String? = "kkang"

    println("${data13_12?.length ?: -1}")

    data13_12 = null

    println("${data13_12?.length ?: -1}")
}

/*

실행 결과

5
-1

*/

// 예외 발생 연산자 (객체가 널일 때 예외를 일으키는 연산자) : !!
fun kotlin_13_6(data13_13: String?): Int {
    return data13_13!!.length
}

fun kotlin_13_7() {
    println("${kotlin_13_6("kkang")}")
    println("${kotlin_13_6(null)}")
}

/*

실행 결과

5
Exception in ~~

*/