package leetcode.easy.solution26

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        for (i in 1 until nums.size) {
            if (nums[k] != nums[i]) {
                k++
                nums[k] = nums[i]
            }
        }

        return k + 1
    }
}
