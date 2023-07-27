package problem

class `problem2023-07-27-1` {
    /*
    * 음식을 일렬로 배치
    * 왼쪽 오른쪽 으로 먹어
    * 칼로리가 낮은음식을 먼저 먹을 수 있게 배치
    * */

    fun solution(food: IntArray): String {
        var answer: String = ""
        var str = ""

        for ((count,el) in food.withIndex()){
            if(el % 2 == 1) {
                food[count] -= 1
                food[count] = food[count] / 2
            }else{
                food[count] = food[count] / 2
            }

        }

        for ((count,el) in food.withIndex()){
            if(count != 0) {
                var num = count

                for (i in 1..el) {
                    str += num.toString()
                }
            }
        }


        answer = str + "0" + str.reversed()

        println(answer)

        return answer
    }
}