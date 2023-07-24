package problem

class `problem2023-07-24-2` {

    /*
    * 프로그래머스 Level1 문자열 나누기 '틀린 문제'
    * */
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
}