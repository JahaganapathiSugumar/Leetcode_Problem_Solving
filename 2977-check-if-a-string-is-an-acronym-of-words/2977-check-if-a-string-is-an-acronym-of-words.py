class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:

        

        new_str = ""
        for each in words:
            new_str += each[0]

        return new_str == s

        