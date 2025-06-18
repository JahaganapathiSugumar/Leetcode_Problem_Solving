class Solution:
    def maxDifference(self, s: str) -> int:
        visited = []
        count_even = []
        count_odd = []

        for i in range(0,len(s)):
            if s[i] not in visited :
                if s.count(s[i]) % 2 == 0:
                    count_even.append(s.count(s[i]))
                else:
                    count_odd.append(s.count(s[i]))
                visited.append(s[i])

        return max(count_odd) - min(count_even)



        