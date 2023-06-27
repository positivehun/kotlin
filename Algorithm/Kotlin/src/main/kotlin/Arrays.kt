fun Arrays(){
    //배열 : 연속된 기억공간을 확보하여 값 들을 저장하고 관리하는 자료구조를 의미한다.

    //배열은 0 부터 시작되는 인덱스 번호로 관리한다.
    //Kotiln에서는 다양한 타입의 값을 배열에 담을 수 있으며 한가지 타입으로 제한하여 값을 담을수도 있다
    // arrayOf()를 활용하여 생성할수있다
    // 제너릭을 활용하여 타입을 제한할수도 있다.

    val array1 = arrayOf(10,20,30,40,50)
    println("array1: $array1") // 메모리주소 알려줌
    println("array1: ${array1.contentToString()}") // 값 알려줌

    val array2 = arrayOf(100,11.11,"문자열",true)
    println("array2: ${array2.contentToString()}") // 값 알려줌

    val array3 = intArrayOf(10,20,30,40,50)
    val array4 = doubleArrayOf(11.11,22.22,33.33,44.44)

    //객체를 array의 요소로 설정하고싶으면 객체ArrayOf 는 사용할수없다]
    // 다만 제너릭으로 설정할 경우 활용 가능하다

    val array5 = arrayOf<String>("set","map","list")
    println("array3: ${array3.contentToString()}") // 값 알려줌
    println("array4: ${array4.contentToString()}") // 값 알려줌
    println("array5: ${array5.contentToString()}") // 값 알려줌

    println("-------------------------------------------------")//

    //Array클래스를 활용하여 Array생성이 가능하다

    val array6 = Array(5,{0})
    println("array6: ${array6.contentToString()}") // 값 알려줌
    val array7 = Array(5){it*2}
    println("array7: ${array7.contentToString()}") // 값 알려줌

    for(i in array7){
        println("array7: $i") // 값 알려줌
    }
    println("-------------------------------------------------")//

    //다차원 배열
    val  array8 = arrayOf(arrayOf(10,20,30), arrayOf(40,50,60), arrayOf(70,80,90))
    println("array8: ${array8.contentToString()}") // 배열안의 배열들의 정보가 나옴
    println("array8: ${array8.contentDeepToString()}") // 배열안의 배열들의 값에 대한 정보가 나옴


    for (item in array8){
        for (item1 in item){
            println("item1 : $item1")
        }
    }

    for (item in array8){
        for (item1 in item){
            println("item1 : $item1")
        }
    }

    for (item in array8){
        for (item1 in item){
            println("item1 : $item1")
        }
    }

    //배열 요소에 접근하는 방법은 array.get(index) 혹은 array[index] 방법이 있다








}