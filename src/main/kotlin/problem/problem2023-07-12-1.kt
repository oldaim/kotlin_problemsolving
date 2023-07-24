package problem

class `problem2023-07-12-1` {

    /*
    * 프로그래머스 Level1 달리기 경주
    * */
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val answer: Array<String> = arrayOf<String>()
        var box: String = ""
        var box2: String =""
        var map = HashMap<String,Int>()
        var intBox: Int? = 0

        for ((count,player) in players.withIndex()){
            map[player] = count
        }

        for (call in callings){

            box = players[map[call]!!]
            box2 = players[map[call]!! - 1]
            players[map[call]!!] = players[map[call]!! - 1]
            players[map[call]!! -1] = box

            intBox = map[box2]
            map[box2] = map[box]!!
            map[box] = intBox!!
        }



        return players
    }
}

