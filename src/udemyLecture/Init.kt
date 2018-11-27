package udemyLecture

fun main(args: Array<String>) {

var t1 = TestClass11();
var t2 = TestClass22(100, 200);
println("t2.a1 : ${t2.a1}")
println("t2.a2 : ${t2.a2}")

var t3 = TestClass33(100, 200);

    println("t3.a1 : ${t3.a1}")
    println("t3.a2 : ${t3.a2}")
    println("t3.a3 : ${t3.a3}")

}

class TestClass11{
    init {
        println("udemyLecture.TestClass1 객체가 생성되면 자동으로 동작하는 부분.")
    }

    //즉 코틀린에서는 객체가 생성될때 자동으로 동작해야될부분이있으며는 생성자를 통하지않고 init 블럭을 사용해라

}

class TestClass22 constructor(a1 : Int, a2 : Int){
 var a1 = a1
var a2 = a2


}

class TestClass33 constructor(a1 : Int){

    var a1 = a1
    var a2 = 0
    var a3 = 0

    constructor(a1 : Int, a2 : Int) : this(a1){ //추가생성자는 반드시 기본생성자호출해야함.
        //기본생성자 먼저
        this.a2 = a2 //기본생성자로 생성된객체에접근해서 담는것
        this.a3 = a1
    }


}
