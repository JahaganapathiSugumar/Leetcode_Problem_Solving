class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        i = 0
        for word in words:
            if word != s[i:len(word)+i]:return False
            i += len(word)
            if len(s) == i:return True

        return False
        