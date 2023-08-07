package problem

class `problem2023-08-07-2` {
    /*
    * id 리스트 가지고 count map 하나랑 신고 map 하나
    * 이때 신고 map value는 set
    * */

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var countMap: MutableMap<String, Int> = mutableMapOf()
        var redMap: MutableMap<String,MutableSet<String>> = mutableMapOf()
        var ansMap: MutableMap<String,Int> = mutableMapOf()
        var ansList = mutableListOf<Int>()

        for (id in id_list){
            countMap[id] = 0
            redMap[id] = mutableSetOf()
            ansMap[id] = 0
        }

        for (re in report){
            var green = re.substringBefore(' ')
            var red =  re.substringAfter(' ')

            if (!redMap[green]!!.contains(red)){
                countMap[red] = countMap[red]!! + 1
                redMap[green]!!.add(red)
            }



        }

        for (id in id_list){
            if (countMap[id]!! >= k){
                for (key in ansMap.keys){
                    if (redMap[key]!!.contains(id)) ansMap[key] = ansMap[key]!! + 1
                }

            }

        }

        for (id in id_list){
            ansList.add(ansMap[id]!!)
        }

        answer = ansList.toIntArray()

        return answer
    }

}