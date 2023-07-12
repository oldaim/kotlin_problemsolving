class Main

fun main() {
    solution(arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3), arrayOf(arrayOf("may", "kein", "kain", "radi"), arrayOf("may", "kein", "brin", "deny"), arrayOf("kon", "kain", "may", "coni")))
}

fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    var answer: IntArray = intArrayOf()
    var map = HashMap<String,Int>()
    var ansList = ArrayList<Int>()
    var count = 0

    for (n in name){

        map[n] = yearning[count]
        count ++
    }

    for (arr in photo){
        var sum = 0
        for (el in arr){

            sum = map.getOrDefault(el,0)
        }
        ansList.add(sum)
        sum = 0
    }

    return ansList.toIntArray()
}