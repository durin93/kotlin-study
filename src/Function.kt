fun main(args: Array<String>) {
    function1()
    function2(100, 11.11);
    function3()
    function3(100, 11.11)
    function3(a1 = 100, a2 = 11.11)
    function4()
    var a1 = function5()
    println(a1)
    println(function5())

    function6()
    function6(1)
    function6(1,1)
    function6(1.5)

    function7()
}

fun function1() {
    println("function1 함수가 호출됨")
}

fun function2(a1: Int, a2: Double) {
    println("function2 함수가 호출됨")
    println("a1 : ${a1}")
    println("a2 : ${a2}")
}

fun function3(a1: Int = 0, a2: Double = 0.0) {
    println("function3 함수가 호출됨")
    println("a1 : ${a1}")
    println("a2 : ${a2}")
}

fun function4(): Unit {
//    Unit은 반환타입이 없다는것, 생략가능 (Void 같은거인듯)
    println("function4 함수가 호출됨")
}

fun function5(): Int {
    println("function5 함수가 호출됨")
    return 100
}

fun function6() {
    println("function6 함수가 호출됨")
}

fun function6(a1: Int) {
    println("function6 함수가 호출됨 a1 : ${a1}")
}

//인자 타입이 다른것
fun function6(a1: Double) {
    println("function6 함수가 호출됨 a1 : ${a1}")
}

//인자 갯수가 다른것
fun function6(a1: Int, a2: Int) {
    println("function6 함수가 호출됨 a1 : ${a1} , a2: ${a2}")
}

fun function7(){

    fun function8(){
            println("function8 함수 호출")
    }

    println("function7 함수 호출")
    function8()
}
