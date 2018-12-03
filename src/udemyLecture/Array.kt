package udemyLecture

fun main(args: Array<String>) {

    //정수형 기억장소 5개가 만들어지고 값이 들어간다.
    var array1 =  arrayOf(10,20,30,40,50)

    println("array1[0] :"+array1[0])
    println("array1[1] :"+array1[1])

    //value에 배열의 첫번쨰값부터 하나씩 들어감.
    for (value in array1){
        print("${value}, ")
    }
    println()


    //배열이 관리할 갯수, 관리할 값을 수식으로.
    //수식에서 변수는 아무거나 배열의 인덱스라고보면됨.
    // {a -> a //a번째에 a를 넣겠다.
    var array2 = Array(5, {a -> a})

    //0 1 2 3 4
    for (value in array2){
        print("${value}, ")
    }

    println()

    var array3 = Array(5, {a -> a*2})

    //0 2 4 6 8
    for (value in array3){
        print("${value}, ")
    }

    println()


    println("array1.size : " +array1.size) //5

//    var a1 = array1[0] 와 같다.
    var a1 = array1.get(0)

    array1[0] = 100
    array1[1] = 300
    println("array1[0] : " + array1[0])
    println("array1[1] : " + array1[1])
    array1.set(0,1)
    array1.set(1,2)
    println("array1[0] : " + array1[0])
    println("array1[1] : " + array1[1])

    var array4 = array1.copyOf()


    //처음부터 3개만 복사
    var array5 = array1.copyOf(3)
    var array6 = array1.copyOfRange(1,4) //인덱스 1,2,3


    var array7 = arrayOf(60,70,20,30,10)
    var array8 = array7.sortedArray()
    for(value in array8){
        print("${value}, ")
    }
    println()
//    array8.reversedArray() //참조의 변경이아닌듯
    array8 = array8.reversedArray() //그래서 대입을 해주어야하네.
    for(value in array8){
        print("${value}, ")
    }


}