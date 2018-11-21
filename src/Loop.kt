fun main(args: Array<String>) {

    //코틀린의 For문
//배열에 들어있는 데이터를 처음부터 끝까지 순회하는 목적으로 사용
// for(변수 in 배열){ }
// 배열은 뒤에서 자세히 다룬다고함.

    var a1 = 1..10 // 1부터 10까지의 값을 관리하는 배열을 만듦

    for(item in a1){ //a1 배열에 있는 값을 하나씩 꺼내서 item에 넣어줌
        println("a1 : ${item}")
    }

    //자바 forEach랑 비슷하구만


    for((idx,item) in a1.withIndex()){ //a1 배열에 들어가있는 값들은 하나씩 item에 들어간다.
        //자바 for문과 비슷

        println("a1 ${idx} : ${item}")

    }


    println("-------------------")

    var a2 = 0

    while(a2<10){
        println("a2 : ${a2}")
        a2++;
    }


}