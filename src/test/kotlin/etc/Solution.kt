package etc

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.util.LinkedList
import java.util.Queue

class Solution: FunSpec({

    test("test 1") {
        val arr: Array<Array<String>> = arrayOf(
            arrayOf("W", "W", "B"),
            arrayOf("W", "B", "W"),
            arrayOf("B", "W", "W"),
        )

        println(arr[0].toList())
        println(arr[1].toList())

        val rows = arr.size
        val cols = arr[0].size

        val rowCounts = IntArray(rows) { 0 }
        val colCounts = IntArray(cols) { 0 }

        arr.forEachIndexed { index, strings ->  }

        // Count the number of 'B's in each row and column
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (arr[i][j] == "B") {
                    rowCounts[i]++
                    colCounts[j]++
                }
            }
        }

        println(rowCounts.toList())
        println(colCounts.toList())

        var lonelyBCount = 0

        // Check for lonely 'B's
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (arr[i][j] == "B" && rowCounts[i] == 1 && colCounts[j] == 1) {
                    lonelyBCount++
                }
            }
        }

//        println(lonelyBCount)
    }

    test("test 2") {
        val target = "ohouse"
        val typed = "oohoussse"

        val targetQueue: Queue<Char> = LinkedList()
        target.forEach { targetQueue.add(it) }

        val typedQueue: Queue<Char> = LinkedList()
        typed.forEach { typedQueue.add(it) }

        while (targetQueue.isNotEmpty()) {
            val char = targetQueue.poll()

            for (i in 0 .. typedQueue.size) {
                if (char == typedQueue.peek()) {
                    typedQueue.poll()
                } else {
                    break
                }
            }
        }

    }


    test("test 3") {
        val a = 1




        a shouldBe 1
    }

    test("test 4") {
        val a = 1

        val cards = intArrayOf(5, 3, 4, 4)
        val slotSize = 2

        val sortedCards = cards.sorted()


        a shouldBe 1
    }

    test("test 5") {
        val a = 1

        val happiness = intArrayOf(9, 10, 6, 0, 4, 6, 10)

        var happyDayRange = 0
        var happyDay = 0
        var unHappyDay = 0
        happiness.forEachIndexed { i, happy ->
            if (happy >= 8) {
                happyDay++
                happyDayRange++
            } else {
                unHappyDay++

                if (happyDay > unHappyDay) {
                    happyDayRange++
                } else {
                    happyDayRange = 0
                    happyDay = 0
                    unHappyDay = 0
                }
            }
        }

        a shouldBe 1
    }
})
