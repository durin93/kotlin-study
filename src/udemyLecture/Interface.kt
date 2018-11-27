package udemyLecture

fun main(args: Array<String>) {

    var t1 = TestClass111()
    testMethod1(t1)
    testMethod2(TestClass222())
    testMethod1(TestClass333())
    testMethod1(TestClass333())
}

class TestClass111 : Inter1 {
    override fun method1() {
        println("TestClass1의 method1")
    }

}

class TestClass222 : Inter2 {
    override fun method3() {
        println("TestClass222의 method3")
    }

}

class TestClass333 : Inter1, Inter2 {
    override fun method1() {
        println("TestClass333의 method1")
    }

    override fun method3() {
        println("TestClass333의 method3")
    }

}

interface Inter1 {
    fun method1()
    fun method2() {
        println("inter1 method2")
    }
}

interface Inter2 {
    fun method3()
    fun method4() {
        println("inter2 method4")
    }
}

fun testMethod1(a1: Inter1) {
    a1.method1()
    a1.method2()
}

fun testMethod2(a1: Inter2) {
    a1.method3()
    a1.method4()
}
