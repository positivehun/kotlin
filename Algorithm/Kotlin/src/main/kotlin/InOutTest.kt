import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Integer.parseInt
import java.util.*

fun main(){

    val file = File("/Users/positive/Desktop/Kotlin/kotlin/Algorithm/Kotlin/src/main/kotlin/10811.txt")
    val reader = BufferedReader(FileReader(file, Charsets.UTF_8))
    val input = mutableListOf<Int>()
    reader.lines().forEach { input.add(parseInt(it)) }

    for (item in input){
        println("input's Item : $item")
    }



}