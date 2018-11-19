fun main(args : Array<String>){

    function1(a1 ={
        println("f1이 전달한 함수가 호출됨")
    })

    function2(a1 = {x:Int, y:Int ->
        println("f2가 전달한 함수가 호출됨")
        println("x : ${x}")
        println("y : ${y}")
    })


    function3(a1 = {x:Int, y:Int ->
            x+y
        x-y
        //제일 마지막에 작성한 값이 반환됨.
    });

    function3(a1 = {x:Int, y:Int ->
        x-y
    });


    function314(a1 = {x:Int, y: Int ->
         x-y
    })

}

fun function1(a1 : () -> Unit){
//a1이라는 인자는 함수를 받겠다.
    a1()
}

fun function2(a1 : (Int, Int) -> Unit){
    //a1이라는 인자로 매개변수 2개받고, 리턴타입이 없는 함수를 받겠다.
    a1(100,200)
}

fun function3(a1 : (Int, Int) -> Int){
    var a2 = a1(100,200)
    println("a2 : ${a2}")
}

fun function100():Int{
    return 10
}

fun function314(a1 : (Int,Int) -> Int){
    println(a1(10,10))
}
