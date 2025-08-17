class Solution:
    def sortSentence(self, s: str) -> str:
        arr = s.split(" ")
        res = ["*"] * len(arr)
        for i in arr:
            res[int(i[-1])-1] = i[:-1]
        
        return " ".join(res)
