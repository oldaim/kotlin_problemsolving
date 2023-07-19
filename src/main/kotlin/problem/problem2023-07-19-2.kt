package problem

import java.util.HashSet

class `problem2023-07-19-2` {

    /**
     * programmers Level1 둘만의 암호
     */


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
}