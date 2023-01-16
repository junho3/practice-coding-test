package y2023.m01.d14.doit

class CalculateAverage {
    fun calculateAverage(points: Array<Int>): Float {
        // 1. 가장 높은 포인트를 구함
        val maxPoint = points.max()

        // 2. 점수 / 가장높은포인트 * 100으로 다시 구함
        // 3. 새로운 평균을 구함
        return points
            .map { it.toFloat().div(maxPoint).times(100) }
            .average()
            .toFloat()
    }
}
