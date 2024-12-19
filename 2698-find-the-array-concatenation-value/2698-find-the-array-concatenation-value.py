class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:

        l , r = 0, len(nums) - 1
        res = 0
        
        while l < r :
            Str = ''
            Str += str(nums[l]) + str(nums[r])
            res += int(Str)
            l += 1
            r -= 1
        
        if len(nums) % 2 == 1:
            res += nums[int(len(nums) / 2)]
        
        
        return res
        