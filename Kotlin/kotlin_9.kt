// 오브젝트 클래스 : 익명 클래스 (클래스의 이름이 없음) / 클래스 선언 동시에 객체 생성 / object 키워드 사용
val data9_1 = object {
    var data9_2 = 10

    fun kotlin_9_1() {
        println("${data9_2}")
    }
}

// 접근시 오류 발생 -> 타입을 명시하지 않음
fun kotlin_9_2() {
    data9_1.data9_2 = 20    // 오류
    data9_1.kotlin_9_1()    // 오류
}

open class kotlin_9_3 {
    open var data9_3 = 10

    open fun kotlin_9_4() {
        println("super : ${data9_3}")
    }
}

val data9_4 = object: kotlin_9_3() {
    override var data9_3 = 20

    override fun kotlin_9_4() {
        println("object : ${data9_3}")
    }
}

fun kotlin_9_5() {
    data9_4.data9_3 = 30
    data9_4.kotlin_9_4()
}

/*

실행 결과

object : 30

*/