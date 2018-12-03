package udemyLecture

fun main(args: Array<String>) {

    var a1 = Outer1()
    //요롷게는 안됨. 외부클래스로만 가능
    //var a2 = Inner1()
    var a2 = a1.Inner1()

    println("a1.outerMember : " + a1.outerMember)
    println("a2.innerMember : " + a2.innerMember)

    //이런식으로 참조로접근은 둘다 불가
//    println("a1.innerMember : "+a1.innerMember)
//    println("a2.outerMember : "+a2.outerMember)

    //그럼 어디다 쓸까?
    //어떤 클래스가 두개가 있는데, 이 클래스가 얘가 가지고 있는 멤버를 굉장히 많이 사용한다.
    //이런 경우 주소값을 넘겨주고 접근하고 이런식으로 하지말고 내부 클래스로 하면 된다.
    a2.innerMethod()


    //일반적
    method100(TestClass2222())
    method200(TestInter2())

    //익명중첩
    method100(object : TestClass1111(){
        override fun testMethod1() {
            println("익명 중첩 클래스의 testMethod1")
        }
    })

    method200(object : TestInter1{
        override fun interMethod() {
            println("익명 중첩 클래스의 interMethod")
        }
    })

}

class Outer1 {

    var outerMember = 100

    //내부 클래스 키워드
    inner class Inner1 {

        var innerMember = 200

        fun innerMethod() {
            println("outerMember : " + outerMember)
        }

    }


    fun outerMethod() {
//        println("innerMember : " + innerMember)
    }
}

abstract class TestClass1111 {

    abstract fun testMethod1()
}

interface TestInter1{
    fun interMethod()

}


class TestClass2222 : TestClass1111(){
    override fun testMethod1() {
        println("TestClass2의 testMethod1")
    }
}

class TestInter2 : TestInter1{
    override fun interMethod() {
        println("TestInter2의 interMethod1")
    }
}

fun method100(a1 : TestClass1111){
    a1.testMethod1()
}

fun method200(a1 : TestInter1){
    a1.interMethod()
}