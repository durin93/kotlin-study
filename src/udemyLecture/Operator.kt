package udemyLecture

fun main(args: Array<String>) {

    //단항 연산자
    var a1 = 10
    var a2 = -a1
    println("a2 : ${a2}")

    a2 = a1.unaryMinus();
    println("a2 : ${a2}")

    a2 = +a1
    println("a2 : ${a2}")
    a2 = a1.unaryPlus()
    println("a2 : ${a2}")

    var a3 = true
    var a4 = !a3
    println("a4 : ${a4}")

    a4 = a3.not()
    println("a4 : ${a4}")

    //증감 연산자
    var a5 = 10
    a5++
    println("a5 : ${a5}")

    println("a5 : ${a5.inc()}")


    var a6 = 10
    var a7 = 3
    println("a6 + a7 : ${a6.plus(a7)}")
    println("a6 - a7 : ${a6.minus(a7)}")
    println("a6 * a7 : ${a6.times(a7)}")
    println("a6 / a7 : ${a6.div(a7)}")
    println("a6 % a7 : ${a6.rem(a7)}")

    //3~10까지의 값을 관리하는 배열만들기
    var a8 = a7..a6
    var a9 = a6.rangeTo(a5)

    println("a8 : ${a8}")
    println("a9 : ${a9}")

    var a10 = 10
    var a11 = a10 == 10
    println("a11 : ${a11}")

    a11 = a10 > 20
    println("a11 : ${a11}")

    a11 = a10.compareTo(20) > 0
    println("a11 : ${a11}")

    a11 = a10 < 20
    println("a11 : ${a11}")

    a11 = a10.compareTo(20) < 0
    println("a11 : ${a11}")



}