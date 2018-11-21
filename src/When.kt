fun main(args: Array<String>) {
    var a1 = 2

    when(a1){
        1 -> {
            println("a1은 1입니다.")
        }
        2 ->{
            println("a1은 2입니다.")
        }
        3 ->{
            println("a1은 3입니다.")
        }
        else ->{
            println("a1은 1,2,3이 아닙니다.")
        }
//내부 코드가 실행되면 밖으로 나간다. break 필요없다.
    }

    when(a1){
        0, 1->{
            println("a1은 0이거나 1입니다")
        }
        2, 3->{
            println("a1은 2이거나 3입니다.")
        }
        else -> {
            println("0123이아닙니다")
        }
    }

    a1 = 7
    when(a1){
        in 1..3 ->{
            println("a1은 1~3사이")
        }
        in 4..6 ->{
            println("a1은 4~6사이")
        }
        !in 1..6 ->{
            println("a1은 1~6사이가 아님")
        }

        else ->{
            println("a1은 모든 조건에 해당하지않음")
        }
    }

    fun function1(a1: Int) = when(a1){
        1 -> {
            100
        }
        2 -> {
            200
        }
        else -> {
            300
        }
    }
}

