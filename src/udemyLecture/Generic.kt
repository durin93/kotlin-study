package udemyLecture

fun main(args: Array<String>) {

    var t1 = TestGNClass<String>()

    t1.testGNmethod("100")


    //여기서 Int를 넣으니 이 객체안에서 해당 T는 모두 Int가 된다.
    var t2 = TestGNClass<Int>()
    t2.testGNmethod(100)

    var t3 = TestGNClass2("문자열")
    t3.testGNmethod("문자열전달")

    var t4 = TestGNClass2(100)
    t4.testGNmethod(200)



    var t5 = TestGNClass3<Int,Int>()
    t5.testGNmethod(100,200)

    var t6 = TestGNClass4(100,200)
    t6.testGNmethod(300,400)

    var t7 = TestGNClass4( "문자열",55.55)
    t7.testGNmethod("문자열2", 99.99)




}

class TestGNClass<T> {
    fun testGNmethod(a1: T) {
        println("a1 : " + a1)
    }
}

//생성자를 이용해서 타입결정
//뒤에 괄호하는게 생성자 정의인듯..
class TestGNClass2<T>(a: T) {

    var value1 = a

    fun testGNmethod(a1: T) {
        println("a1 : " + a1)
        println("value1 : " + value1)
    }

}

class TestGNClass3<A, B> {

    fun testGNmethod(a1: A, a2: B) {
        println("a1 : "+ a1)
        println("a2 : "+ a2)
    }

}

class TestGNClass4<A,B>(a1 : A , a2 : B){

    var a1 = a1;
    var a2 = a2;

    fun testGNmethod(a3: A, a4: B) {
        println("a1 : "+ a1)
        println("a2 : "+ a2)
        println("a3 : "+ a3)
        println("a4 : "+ a4)
    }
}