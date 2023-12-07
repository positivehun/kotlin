fun main(){
    println("let's go")
    Base(2).shout(1)
    Derived(1).shout(1)
    Derived(1).shout2(2)


}
// 코틀린에서는 클래스는 객체를 생성하기 위한 템플릿
// 클래스는 속성(변수)과 메소드(함수)를 포함할 수 있습니다.

class Myclass{}



//코틀린에서 클래스는 주 생성자와 하나 이상의 부 생성자를 가질 수 있습니다.
//주 생성자는 클래스 헤더의 일부입니다.
class Person(val name: String,var age: Int)

//상속
//코틀린의 모든 클래스는 Any라는 슈퍼클래스를 상속받습니다.
//클래스를 상속하기 위해서는 클래스 앞에 open 키워드를 붙어야합니다.
//기본적으로 코틀린의 클래스는 final이기 때문입니다

open class Base(p:Int){
    open fun shout(p:Int){
        println("Base Shout $p")
    }
}

class Derived(p:Int) : Base(p){
    //override를 사용하려면 상속받은 클래스의 함수 앞에 open을 써주면 된다.
    override fun shout(p:Int){
        println("Derived Shout $p")
    }

    fun shout2(p:Int){
        println("Derived Shout $p")
    }

}