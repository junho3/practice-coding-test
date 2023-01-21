package y2023.m01.d21.dongbin

class ContainNumberInTime {
    fun run(hour: Int): Int {
        var count = 0
        for (i in 0..hour) {
            for (j in 0..59) {
                for (k in 0..59) {
                    val time = i.toString() + j.toString() + k.toString()
                    if (time.contains("3")) {
                        count++
                    }
                }
            }
        }

        return count
    }
}
