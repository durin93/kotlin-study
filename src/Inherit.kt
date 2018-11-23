fun main(args: Array<String>) {


    var s1 = Sub()
    println("s1.sub_member : ${s1.sub_member}")
    s1.sub_method()

    println("s1.super_member : ${s1.super_member}")
    s1.super_method()

    var s2 = Sub2()
    println("s2.a1 : ${s2.a1}")
    s2 = Sub2(10)
    println("s2.a1 : ${s2.a1}")

}

open class Super1{ //기본적으로 class 앞에  open을 안붙이면 final됨

    var super_member =100

    fun super_method(){
        println("Super1의 메서드")
    }
}


class Sub:Super1{

    var sub_member = 200

    constructor() : super() //부모클래스를 호출하는 생성자 필수

    fun sub_method(){
        println("sub1 의 메서드")
    }

}


open class Super2 constructor(a1 : Int){
    var a1 = a1
}

class Sub2 : Super2{

    constructor() : super(100)
    constructor(a1 : Int) : super(a1)


}

//상속 시 : 부모클래스(open 키워드 붙어야함)
//그리고 반드시 부모클래스의 생성자를 호출하는 생성자 필수!