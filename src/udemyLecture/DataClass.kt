package udemyLecture

fun main(args: Array<String>) {

    var d1 = DataClass(100, "문자열1")
    println("d1.a1 : " + d1.a1)
    println("d1.a2 : " + d1.a2)

    var d2 = DataClass2(200, "문자열2")
    println("d2.a1 : " + d2.a1)
    println("d2.a2 : " + d2.a2)

    var d3 = DataClass2()
    println("d3.a1 : " + d3.a1)
    println("d3.a2 : " + d3.a2)


    //데이터 클래스로부터 만든 객체를 복제해서 새로운 객체를 만드는것을 copy 라고함
    var d5 = d2.copy();
    println("d5.a1 : " + d5.a1)
    println("d5.a2 : " + d5.a2)

    var d6 = d2.copy(a2 ="새로운문자열");
    println("d6.a1 : " + d6.a1)
    println("d6.a2 : " + d6.a2)

}

data class DataClass(var a1: Int, var a2: String);

data class DataClass2(var a1: Int = 0, var a2: String = "기본문자열"); //초기값 설정 가능

