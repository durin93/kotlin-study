package udemyLecture

fun main(args: Array<String>) {

    var a1 = object {
        var v1 = 100
        var v2 = "문자열"

        fun method1() {
            println("익명 객체의 method1")
        }

    }

    println("a1.v1 : " + a1.v1)
    println("a1.v2 : " + a1.v2)
    a1.method1()

    var a2 = object : AbClass1(), Inter{
        override fun abMethod() {
            println("익명객체의 abMethod")
        }

        override fun interMethod() {
            println("익명객체의 interMethod1")
        }
    }

    a2.abMethod()
    a2.interMethod()

    println("ObjectClass.a1 : " + ObjectClass.a1)
    println("ObjectClass.a2 : " + ObjectClass.a2)
    ObjectClass.method()
    ObjectClass.method2()

    //이 오브젝트 키워드는 팩토리메서드를 만들떄사용
    var a3 = TestClass12.create()

}

interface Inter{
    fun interMethod()
}

abstract class AbClass1{
    abstract fun abMethod()
}

object ObjectClass{
    var a1 = 100
    var a2 = 200

    fun method(){
        println("ObjectClass의 method")
    }
    fun method2(){
        println("ObjectClass의 method2")
    }

}

class TestClass12{
    companion object {
        fun create() : TestClass{
            println("팩토리메서드 호출")
            return TestClass()
        }
    }
}