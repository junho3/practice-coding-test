package leetcode.easy.solution27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        nums.forEachIndexed { index, i ->
            if (i != `val`) {
                nums[k] = nums[index]
                k++
            }
        }

        return k
    }
}
