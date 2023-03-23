// 함수 선언 키워드 : fun / 함수 반환 타입 설정 가능 (생략하면 Unit 적용)
fun kotlin_3_1(data3_1: Int): Int {
    return data3_1 * 10
}

// 함수의 매개변수에는 var이나 val 키워드 사용 불가 (val 자동 적용) / 함수 안에서 매개변숫값 변경 불가
fun kotlin_3_2(data3_2: Int) {
    data3_2 = 10    // 오류
}

// 함수의 매개변수에는 기본값 선언 가능 (호출시 인자 전달 필요 X  -> 기본값 적용)
fun kotlin_3_3() {
    fun kotlin_3_4(data3_3: Int, data3_4: Int = 10): Int {
        return data3_3 * data3_4
    }

    println(kotlin_3_4(10))
    println(kotlin_3_4(10, 20))
}

/*

실행 결과

100
200

*/

// 매개변수 여러개 -> 인자 순서대로 할당 / 호출시 매개변수명 지정 -> 순서 변경 가능 (명명된 매개변수)
fun kotlin_3_5() {
    fun kotlin_3_6(data3_5: Int, data3_6: Int): Int {
        return data3_5 - data3_6
    }

    println(kotlin_3_6(10, 20))
    println(kotlin_3_6(data3_6 = 10, data3_5 = 20))
}

/*

실행 결과

-10
10

*/