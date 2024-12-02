class Solution:
    def firstUniqChar(self, s: str) -> int:

        seen = {}

        for c in s:
            if c in seen:
                seen[c] += 1
            else:
                seen[c] = 1 

        for i,each in enumerate(s):
            if seen[each] == 1:
                return i

        return -1
        