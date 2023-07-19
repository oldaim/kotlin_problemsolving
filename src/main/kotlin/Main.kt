import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution("aukks","wbqd", 5)
}

fun solution(s: String, skip: String, index: Int): String {
    var answer: String = ""
    val skipSet = HashSet<Char>()
    for (letter in skip){
        skipSet.add(letter)
    }

    for (letter in s){
        var count = 1
        var password = letter
        while (count <= index){
            password = password.plus(1)
            if (password.minus('a') > 25) password -= 26
            if (skipSet.contains(password)) continue
            else count++
        }

        answer += password

    }
    println(answer)
    return answer
}
