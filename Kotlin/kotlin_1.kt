// val : 초깃값 바꿀 수 없는 변수 / var : 초깃값 바꿀 수 있는 변수
val data1_1 = 10
var data1_2 = 10

fun kotlin_1_1() {
    data1_1 = 20    // 오류
    data1_2 = 20
}

// 명시적으로 타입 선언 / 최상위 선언 변수는 초깃값 할당 필요
val data1_3: Int = 10
val data1_4: Int   // 오류


// 함수 내부에 선언한 변수는 초깃값 할당 필요 X / 변수 이용하려면 값 할당 필요
fun kotlin_1_2() {
    val data1_5: Int

    println(data1_5)   // 오류

    data1_5 = 10

    println(data1_5)
}

// 초기화 미루기 (lateinit) : var 선언 변수에만 사용 가능 / Int, Double, Boolean, Byte등의 타입에는 사용 불가
lateinit var data1_6: Int     // 오류
lateinit val data1_7: String  // 오류
lateinit var data1_8: String


// 초기화 미루기 (lazy) : 소스에서 변수가 최초로 이용되는 순간 자동 실행되어 그 결괏값이 변수의 초깃값으로 할당 / 여러 줄 -> 마지막 줄의 실행 결괏값 할당
val data1_9: Int by lazy {
    println("in lazy...")
    10
}

fun kotlin_1_3() {
    println("in test...")
    println(data1_9 + 10)
}

/*

실행 결과

in lazy...
in test...
20

*/