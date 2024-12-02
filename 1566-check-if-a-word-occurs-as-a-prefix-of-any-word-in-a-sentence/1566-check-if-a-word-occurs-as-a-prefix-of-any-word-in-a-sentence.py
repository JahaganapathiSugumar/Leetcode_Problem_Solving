class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        arr = sentence.split(" ")
        

        for i,each in enumerate(arr):
            if each.startswith(searchWord):
                return i + 1

        return -1
        