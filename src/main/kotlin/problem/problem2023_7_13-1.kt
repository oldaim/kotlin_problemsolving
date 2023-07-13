package problem

class `problem2023_7_13-1` {
    /**
     *  프로그래머스 Level1 공원 산책
     * */
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val parkDimension = ArrayList<CharArray>()
        val height = routes.size
        var width = 0
        var currentLocation = Pair(0,0)
        var moveLocation = Pair(0,0)

        for (line in park) {
            parkDimension.add(line.toCharArray())
            width = line.length
        }

        for (route in routes){

            var direction = route.substringBefore(" ")
            var load = route.substringAfter(" ").toInt()
            var destination =""
            when(direction){
                "N" -> {
                    if(currentLocation.second - load in 0..height - 1 && parkDimension[currentLocation.second - load][currentLocation.first] != 'X')
                        moveLocation = Pair(currentLocation.first, currentLocation.second - load)

                }

                "S" -> {
                    if(currentLocation.second + load in 0..height - 1 && parkDimension[currentLocation.second + load][currentLocation.first] != 'X')
                        moveLocation = Pair(currentLocation.first, currentLocation.second + load)
                }

                "W" -> {
                    if(currentLocation.first - load in 0..width - 1 && parkDimension[currentLocation.second][currentLocation.first - load] != 'X')
                        moveLocation = Pair(currentLocation.first - load, currentLocation.second)
                }

                "E" -> {
                    if(currentLocation.first + load in 0..width - 1 && parkDimension[currentLocation.second][currentLocation.first + load] != 'X')
                        moveLocation = Pair(currentLocation.first + load, currentLocation.second)
                }

            }

            currentLocation = moveLocation

        }

        answer = intArrayOf(currentLocation.first, currentLocation.second)

        return answer
    }
}