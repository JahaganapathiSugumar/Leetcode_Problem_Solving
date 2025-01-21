class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if(len(nums) < 2):
            return nums[0]

        arr = []

        arr.append(nums[0])
        arr.append(max(nums[0],nums[1]))

        for i in range(2,len(nums)):
            arr.append(max(arr[i-2]+nums[i],arr[i-1]))

        return arr[-1]
        