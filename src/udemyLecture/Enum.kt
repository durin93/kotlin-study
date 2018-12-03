package udemyLecture

fun main(args : Array<String>){

    printDirection(Direction.EAST)

    println(Number.ONE)
    println(Number.ONE.num)
    println(Number.TWO)
    println(Number.TWO.num)
}

enum class Direction{
    NORTH, SOUTH, WEST, EAST

}

enum class Number(var num : Int){
    ONE(1),
    TWO(2)
}

fun printDirection(a1 : Direction){
    when(a1){
        Direction.NORTH -> print("북쪽")
        Direction.SOUTH -> print("남쪽")
        Direction.WEST -> print("서쪽")
        Direction.EAST -> print("동쪽")
    }
}