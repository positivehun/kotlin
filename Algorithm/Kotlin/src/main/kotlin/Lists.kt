fun Lists(){
    //listOf : 불변형 리스트 생성®
    //mutableListOf:가변형 리스트 생성
    //emptyList : 비어있는 불변형 리스트 생성
    // listOfNotNull : null을 제외한 나머지만으로 리스트를 생성한다.

    val list1 = listOf(10,20,30,40,50) // 내부에 값을 입력해주지 않으면 제너릭으로 타입을 지정해주지 않으면 오류가 발생한다
    val list2 = listOf("문자열1","문자열2","문자열3")


    println(list1)
    println(list2)

    val list3 = mutableListOf<Int>()
    val list4 = mutableListOf("문자열","문자열2")

    println(list3)
    println(list4)

    val list5 = emptyList<Int>()
    println("list5 : $list5")

    val list6 = listOfNotNull(10,20,null,30,null,40,50) // null을 제외하고 출력해준다
    println("list6 : $list6")

    for (item in list1){
        println("list1's Item : $item")
    }
    println(list1.size)

    //get : 0부터 시작하는 인덱스 번호를 통해 객체를 추출할 수 있다. .get(index)  = [index] 같은거
    // Kotlin의 리스트는 배열과 동일하게 []를 사용할 수 있다.

    println("--------------------------------------")
    println("list1 0 : ${list1.get(0)}") // 포맷팅$에 .을 사용하려면 {}로 묵어줘야 한다.
    println("list1 1 : ${list1.get(1)}")
    println("list1 2 : ${list1[2]}")

    //indexOf : 지정된 값의 인덱스 번호를 반환한다. 값이 없을경우 -1을 반환한다
    //lastIndexOf : 지정된 값이 마지막에 해당하는 값의 인덱스 번호를 반환한다. 값이 없을 경우 -1을 반환한다
    //subList : 지정된 범위의 값을 추출하여 새로운 리스트를 생성해 반환한다.

    println("----------------------------------------")

    val list7 = listOf(10,20,30,10,20,30)
    val index1 = list7.indexOf(20)//앞에서부터 탐색
    val index2 = list7.lastIndexOf(20)//뒤에서부터 탐색
    println("index1 : $index1")
    println("index2 : $index2")

    val list8 = list1.subList(1,3) // list1의 인덱스 1  부터 3까지
    println("list8 : $list8")

    //가변형 리스트의 메서드
    //add(객체) : 객체를 추가한다.
    //add(인덱스,객체) : 주어진 인덱스 위치에 객체를 삽입한다.
    //remove(객체) : 주어진 객체를 제거한다.
    //removeAt(인덱스) : 주어진 인덱스의 객체를 제거한다.
    // set(인덱스,객체) : 주어진 인덱스에 객체를 덮어씌운다.

    println("----------------------------------------")

    println("list3 : $list3")

    list3.add(10)
    list3.add(20)
    list3.add(30)
    println("list3 : $list3")

    list3.addAll(listOf(40,50,60))

    println("list3 : $list3")


    list3.add(1,100)
    println("list3 : $list3")

    list3.addAll(2,listOf(200,300,400))

    println("list3 : $list3")

    list3.remove(100)
    println("list3 : $list3")

    list3.removeAll(listOf(200,300,400))
    println("list3 : $list3")

    list3.removeAt(1)
    println("list3 : $list3")

    list3.set(1,200) // []이나 set이나 같은것
    println("list3 : $list3")

    list3[2] = 300
    println("list3 : $list3")

    //list상호 변경
    //toList : 불변형리스트를 생성해 반환한다.
    //toMutableList : 가변형 리스트를 생성해 반환한다

    println("------------------------------------------")

    val list100 = list1.toMutableList()
    list100.add(100)
    println("list100 : $list100")

    val list200 = list100.toList()
    //list200.add() 불변형이라 에러가 발생한다.





}