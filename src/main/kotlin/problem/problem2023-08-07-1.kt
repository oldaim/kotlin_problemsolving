package problem

class `problem2023-08-07-1` {
    /*
    *  1번지표 R, T
    *  2번지표 C, F
    *  3번지표 J, M
    *  4번지표 A, N
    *  RT, TR, FC, CF, MJ, JM, AN, NA
    * */
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""

        var answerMap = mutableMapOf(
            'R' to 0,
            'T' to 0,
            'F' to 0,
            'C' to 0,
            'M' to 0,
            'J' to 0,
            'A' to 0,
            'N' to 0
        )

        for ((num, question) in survey.withIndex()){
            var first = question[0]
            var second = question[1]
            var choice = choices[num]

            when(choice){
                1 -> answerMap[first] = answerMap[first]!! + 3
                2 -> answerMap[first] = answerMap[first]!! + 2
                3 -> answerMap[first] = answerMap[first]!! + 1
                5 -> answerMap[second] = answerMap[second]!! + 1
                6 -> answerMap[second] = answerMap[second]!! + 2
                7 -> answerMap[second] = answerMap[second]!! + 3
                else -> continue
            }


        }

        when{
            answerMap['R']!! > answerMap['T']!! -> answer+= 'R'
            answerMap['R']!! == answerMap['T']!! -> answer+= 'R'
            answerMap['R']!! < answerMap['T']!! -> answer+= 'T'
        }

        when{
            answerMap['C']!! > answerMap['F']!! -> answer+= 'C'
            answerMap['C']!! == answerMap['F']!! -> answer+= 'C'
            answerMap['C']!! < answerMap['F']!! -> answer+= 'F'
        }

        when{
            answerMap['J']!! > answerMap['M']!! -> answer+= 'J'
            answerMap['J']!! == answerMap['M']!! -> answer+= 'J'
            answerMap['J']!! < answerMap['M']!! -> answer+= 'M'
        }

        when{
            answerMap['A']!! > answerMap['N']!! -> answer+= 'A'
            answerMap['A']!! == answerMap['N']!! -> answer+= 'A'
            answerMap['A']!! < answerMap['N']!! -> answer+= 'N'
        }



        return answer
    }

}