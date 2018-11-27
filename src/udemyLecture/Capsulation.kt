package udemyLecture

fun main(args: Array<String>) {

    var t1 = TestClass();
    t1.value1 = 100
    println("t1.value1 : "+ t1.value1)

    //외부에서 접근이 가능한 변수를 선언하고,
    // 이 내부에 set get을 만들고 마치 value1이라는 변수가 있는거처럼
    //여기에 값을넣어주면 set이 호출되고 동작.


}

class TestClass{

    private var a1 = 0

    var value1 : Int
    set(v1){
        println("setter 호출")
        this.a1 = v1
    }
    get(){
        println("getter 호출")
        return a1
    }

    //get() = this.a1


}