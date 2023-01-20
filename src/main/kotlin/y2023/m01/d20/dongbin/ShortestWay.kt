package y2023.m01.d20.dongbin

class ShortestWay {
    fun run(totalNumber: Int, division: Int): Int {
        var restNumber = totalNumber
        var result = 0

        do {
            if (restNumber.mod(division) == 0) {
                restNumber /= division
                result++
            } else {
                restNumber -= 1
                result++
            }
        } while (restNumber > 1)

        return result
    }

    fun run2(totalNumber: Int, division: Int): Int {
        var n: Int = totalNumber
        val k: Int = division
        var result = 0

        while (true) {
            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            val target = n / k * k
            result += n - target
            n = target
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break
            // K로 나누기
            result += 1
            n /= k
        }

        result += n - 1
        return result
    }
}
