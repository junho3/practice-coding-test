package y2023.m01.d25.dongbin

class RiceCake {
    fun run(riceCakes: List<Int>, target: Int): Int {
        var start = 0
        var end = riceCakes.max()
        var result = 0

//        6
//        19, 15, 10, 17

        while (start <= end) {
            // 1. 중간값을 구함
            val middle = start.plus(end).div(2)

            // 2. 중간값 기준으로 배열의 합을 체크
            val sum = riceCakes.filter { it > middle }
                .sumOf { it.minus(middle) }

            if (sum > target) { // 2-1. 배열의 합이 target 보다 큰 경우 start = 중간값 + 1
                start = middle + 1
            } else if (sum < target) { // 2-2. 배열의 합이 target 보다 작은 경우 end = 중간값 - 1
                end = middle - 1
            } else { // 2-3. 배열의 합이 target 과 동일한 경우 종료
                result = middle
                break
            }
        }

        return result
    }
}
