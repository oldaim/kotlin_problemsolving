import java.util.*
import kotlin.math.max
import kotlin.math.min

class Main


fun main() {
    solution("aaabbaccccabba")
}

fun solution(s: String): Int {
    var answer: Int = 0
    var st = s.first()
    var point = 0
    var trash = ""
    var countFirst = 0
    var countNotFirst = 0

    for ((count,letter) in s.withIndex()){

        if (letter == st) countFirst++ else countNotFirst++
        if (countFirst == countNotFirst) {


            if (count + 1 < s.length) {
                answer++
                st = s[count + 1]
                trash = s.substring(count + 1 , s.length)
            }


            countNotFirst = 0
            countFirst = 0
        }

    }


    if (trash.length > 0) answer++

    println(answer)

    return answer
}

