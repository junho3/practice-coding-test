package leetcode.easy.solution88

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var nums2Index = 0
        for (i in nums1.indices) {
            if (n <= nums2Index) {
                break
            }

            if (nums1[i] == 0) {
                nums1[i] = nums2[nums2Index]
                nums2Index++
            }
        }

        nums1.sort()
    }
}
