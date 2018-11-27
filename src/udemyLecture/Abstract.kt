package udemyLecture

fun main(args: Array<String>) {

//    var s1 = Super11() //이렇게 하면 오류, 추상클래스는 객체생성 불가
      var s1 = Sub11()
    s1.method1()
    s1.method2()

}

open abstract class Super11{


    //추상클래스는 객체생성불가능하니 자식을 생성해서 사용
    fun method1(){
        println("Super11의 method1")
    }

    open abstract fun method2()

}

class Sub11 : Super11(){
    override fun method2() {
        println("Sub11의 method2")
    }

}