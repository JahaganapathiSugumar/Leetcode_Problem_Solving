class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:

        counter = defaultdict(int)
        balloon = "balloon"
        

        for c in text:
            if c in balloon:
                counter[c] += 1

        if any(c not in counter for c in balloon):
            return 0

        else:
            return min(counter['b'],counter['a'],counter['n'],counter['o']//2,counter['l']//2)