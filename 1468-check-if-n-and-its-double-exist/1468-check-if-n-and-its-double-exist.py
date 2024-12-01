class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        s = set()

        for ele in arr:
            if ele * 2 in s or ele / 2 in s:
                return True
            s.add(ele)

        return False
        