fun main(args: Array<String>) {
    println("정수 : ${100}")
    println("정수 (long) : ${100L}")
    println("실수 (double) : ${55.55}")
    println("실수 (float) : ${55.55f}")

    //코틀린은 세자리 마다 언더바를 쓰는것을 허용한다.
    //굉장히 숫자가 클경우 한눈에 보기가 힘들어서 허용.
    //보통 숫자에 세자리마다 쉼표를 사용하는것과 같다.
    //즉 가독성

    println(1000000000)
    println(1_000_000_000) //언더바써도 정수다
    println("문자열")
    println('a')

    var a1 = 100;
    println("a1 : ${a1}")

    var a2 : Int = 100

    println("a2 : ${a2}")

    val a = 100

}