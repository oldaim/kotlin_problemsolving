package problem

class `problem2023-07-19-1` {
    /*
    * 프로그래머스 Level 1 : 카드 뭉치
    * */
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var rank1 = 0
        var rank2 = 0
        var mapFirst = HashMap<String,Int>()
        var mapSecond = HashMap<String,Int>()

        for ((count,card) in cards1.withIndex()) mapFirst[card] = count + 1
        for ((count,card) in cards2.withIndex()) mapSecond[card] = count + 1

        for (word in goal){
            if(mapFirst.containsKey(word)){
                if(rank1 + 1 == mapFirst[word]!!) rank1 = mapFirst[word]!!
                else {
                    answer = "No"
                    return answer
                }
            }else if(mapSecond.containsKey(word)){
                if(rank2 + 1 == mapSecond[word]!!) rank2 = mapSecond[word]!!
                else {
                    answer = "No"
                    return answer
                }
            }
        }
        answer = "Yes"
        return answer
    }
}