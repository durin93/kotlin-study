package udemyLecture

fun main(args : Array<String>){

    var s1 = Sub1()
    s1.method1()
    s1.method2()

    var s2 : Super = Sub1()
    s2.method1()
//    s2.method2() //얘는 안된다. 자바랑 같네. 객체는 자식이지만 타입이 부모니깐

    test_function(s1)

}


open class Super{
//함수에 open을 넣어줘야 오버라이딩 가능
    open fun method1(){
        println("Super1의 method1")
    }

}

fun test_function(a1 : Super){
    a1.method1()
}

class Sub1 : Super(){
    fun method2(){
        println("Sub1의 method2")
    }

    override fun method1() {
        println("Sub1의 method1")
    }

}