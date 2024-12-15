class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        avg = []
        n = len(nums)

        while n > 1:
            mi = min(nums)
            ma = max(nums)
            avg.append(float((mi + ma) / 2))
            nums.remove(mi)
            nums.remove(ma)

            n -= 2
        
        return min(avg)
        

            
            
        