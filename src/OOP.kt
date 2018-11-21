fun main(args: Array<String>) {

    var t1 = TestClass1() //메모리상에 객체가 생성됨.
    println("t1 : ${t1}")

    var t2 = TestClass2()

    println("t2.a1 : " + t2.a1)
    println("t2.a2 : " + t2.a2) //점 연산자를 통해 객체변수에 접근가능

    t2.a1 = 100
    t2.a2 = 200 //값을 이런식으로 대입가능 setter같은건가..
    println("t2.a1 : " + t2.a1)
    println("t2.a2 : " + t2.a2) //점 연산자를 통해 객체변수에 접근가능

    var t4 = TestClass3();
    t4.function1()

}

class TestClass1 {

}

class TestClass2 {
    var a1 = 0
    var a2 = 0
}

class TestClass3 {
    fun function1() {
        println("function1 메서드 호출")
    }
}