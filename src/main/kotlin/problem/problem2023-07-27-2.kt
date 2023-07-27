package problem

class `problem2023-07-27-2` {
    /*
    *  빵 - 야채 - 고기 - 빵
    *  1 : 빵
    *  2 : 야채
    *  3 : 고기
    *  1 - 2 - 3 - 1
    *  프로그래머스 Level 1 햄버거 만들기 '실패'
    * */

    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var gred = ingredient.toList()
        var count = 0

        while (count < gred.size - 1){
            if(check(gred, gred[count])){
                gred = cutList(gred,count)
                answer++
                count = 0
            }
            count++
        }



        return answer
    }

    fun check(list: List<Int>, index: Int): Boolean =
        list[index] == 1 && list[index + 1] == 2 && list[index + 2] == 3 && list[index + 3] == 1

    fun cutList(list: List<Int>, index: Int): List<Int> =
        list.subList(0,index - 1) + list.subList(index + 5, list.lastIndex)
}