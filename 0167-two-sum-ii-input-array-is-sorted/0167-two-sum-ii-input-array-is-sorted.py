class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        l = 0
        r = len(numbers) - 1

        while l < r :
            cursum = numbers[r] + numbers[l]

            if cursum > target:
                r -= 1
            elif cursum < target:
                l += 1
            else:
                return [l+1,r+1]

        return []


        