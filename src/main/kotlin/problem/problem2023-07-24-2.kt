package problem

class `problem2023-07-24-2` {

    /*
    * 프로그래머스 Level1 문자열 나누기
    * */
    fun solution(s: String): Int {
        var answer: Int = 0
        var ch = s.first()
        var same = 0
        var notSame = 0
        var trash = ""

        for ((count,letter) in s.withIndex()){
            if(ch == letter) same++ else notSame++
            if(same == notSame){
                answer++
                same = 0
                notSame = 0

                if(count + 1 < s.length) {
                    ch = s[count + 1]
                    trash = s.substring(0, count)
                }
                else {
                    trash = s
                    break
                }

            }
        }

        if(trash.length != s.length) answer++
        println(answer)
        return answer
    }
}