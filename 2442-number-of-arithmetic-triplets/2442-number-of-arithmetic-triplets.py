class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:

        s = set(nums)
        res = 0

        for num in nums:
            if ((num - diff) in s and (num - (diff*2)) in s):
                res += 1

        return res
        