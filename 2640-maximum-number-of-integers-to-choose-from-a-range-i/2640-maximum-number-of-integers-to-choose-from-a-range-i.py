class Solution:
    def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:
        ban = set(banned)

        select = 0

        for i in range(1,n+1):
            if(i not in ban and i <= maxSum):
                select += 1
                maxSum -= i

            elif(i > maxSum):
                break
                
                
        return select
        