// 컬렉션 타입 : 여러 개의 데이터를 표현하는 방법 (Array / List / Set / Map)

// Array (배열 표현) : 첫 번째 매개변수 = 배열의 크기 / 두 번째 매개변수 = 초깃값 지정 함수
// Array<Int> : 정수 배열 / Array<String> : 문자열 배열
val data4_1: Array<Int> = Array(3, {0})     // {0, 0, 0}


// 배열 데이터 접근 : [] / set() / get()
fun kotlin_4_1() {
    val data4_2: Array<Int> = Array(3, {0})     // {0, 0, 0}

    data4_2[0] = 10     // {10, 0, 0}
    data4_2[1] = 20     // {10, 20, 0}
    data4_2.set(2, 30)  // {10, 20, 30}

    println(data4_2.size)
    println("${data4_2[0]}, ${data4_2[1]}, ${data4_2.get(2)}")
}

/*

실행 결과

3
10, 20, 30

*/

// 각 기초 타입의 배열을 나타내는 클래스 이용 가능
val data4_3: IntArray = IntArray(3, {0})    // {0, 0, 0}
val data4_4: BooleanArray = BooleanArray(3, {false})    // {false, false, false}


// arrayOf() : 배열 선언할 때 값 할당 가능 (기초 타입 arrayOf() 함수 이용 가능)
fun kotlin_4_2() {
    val data4_5 = arrayOf<Int>(10, 20, 30)      // {10, 20, 30}
    val data4_6 = intArrayOf(10, 20, 30)        // {10, 20, 30}
}

// List : 순서가 있는 데이터 집합 / 데이터의 중복 허용 / listOf() -> 불변, mutableListOf() -> 가변
// Set : 순서가 없는 데이터 집합 / 데이터의 중복 허용 X / setOf() -> 불변, mutableSetOf() -> 가변
// Map : 키와 값으로 이루어진 데이터 집합 / 순서 X / 키의 중복 허용 X / mapOf() -> 불변, mutableMapOf() -> 가변
fun kotlin_4_3() {
    var data4_7 = listOf<Int>(10, 20, 30)       // {10, 20, 30}
    var data4_8 = mutableListOf<Int>(10, 20, 30)    // {10, 20, 30}

    data4_8.add(3, 40)
    data4_8.set(0, 20)

    println(data4_8.size)
    println("${data4_8[0]}, ${data4_8[1]}, ${data4_8.get(2)}, ${data4_8.get(3)}")
}

/*

실행 결과

4
20, 20, 30, 40

*/

fun kotlin_4_4() {
    var data4_9 = mapOf<String, String>(Pair("one", "hello"), "two" to "world")     // {one: hello, two: world}

    println(data4_9.size)
    println("${data4_9.get("one")}, ${data4_9.get("two")}")
}

/*

실행 결과

2
hello, world

*/