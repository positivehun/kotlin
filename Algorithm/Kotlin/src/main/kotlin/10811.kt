
import java.util.*
//
//val file = File("/Users/positive/Desktop/Kotlin/kotlin/Algorithm/Kotlin/src/main/kotlin/10811.txt")
//val reader = BufferedReader(FileReader(file, Charsets.UTF_8))

fun main() = with(System.`in`.bufferedReader()) { // 바구니 뒤집기

    val (N, M) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(N + 1) { it }
    repeat(M) {
        val stack = Stack<Int>()
        val (i, j) = readLine().split(" ").map { it.toInt() }
        for (m in i..j) stack.push(arr[m])
        for (m in i..j) arr[m] = stack.pop()
    }

    print(arr.copyOfRange(1, arr.size).joinToString(" "))
}