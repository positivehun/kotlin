fun FunctionTest(){

    test1()
    test2(100,200.0)
    //값을 추가하면 어떤 변수에 할당되는지 알려줌 개발도구의 기능

    val k1:Int = 100
    val k2:Double = 11.11
    test2(k1,k2)
    test2(a2 = 66.66,a1 = 600)
    //값의 순서를 다르게 할당할 때에는 변수를 직접 지정해주면 된다

    //test3 값을 지정해주지않으면 Default값 호출

    println("test3 기본값 호출")
    test3()
    println("test3 전달값 호출")
    test3(10,10.10)

    println(test4(10,20))

    test5()
}

fun test1(){

    println("test1 호출")
}


fun test2(a1:Int, a2:Double){
    println("a1 : $a1")
    println("a2 : $a2")

}

fun test3(a1:Int = 0,a2:Double = 0.0){

    println("test3 호출")
    println("a1 : $a1")
    println("a2 : $a2")
}

fun test4(a1:Int,a2:Int) : Int{
    println("test4 반환값이 있는 함수")
    return a1+a2
}

fun test5() :  Unit{

    println("test5 : 호출 반환값이 없을때는 Unit")
    println("test5 : Unit 는 생략 가능, void랑 같은 것")
}

fun imsorry(){
    println("imsorry")
}