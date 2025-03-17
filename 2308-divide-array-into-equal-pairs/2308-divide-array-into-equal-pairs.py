class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        fre = [0] * 501

        for num in nums:
            fre[num] += 1

        for each in fre:
            if each % 2 != 0:
                return False
        
        return True