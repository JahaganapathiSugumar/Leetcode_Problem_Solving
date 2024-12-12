class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:

        while k:
            m = max(gifts)
            i = gifts.index(m)
            gifts[i] = int(math.sqrt(m))
            k -= 1

        return sum(gifts)

        