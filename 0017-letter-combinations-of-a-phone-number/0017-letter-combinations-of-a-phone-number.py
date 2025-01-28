class Solution(object):
    def letterCombinations(self, digits):

        if digits == '':
            return []

        ans , sol = [] , []

        m = {
            '2' : 'abc',
            '3' : 'def',
            '4' : 'ghi',
            '5' : 'jkl',
            '6' : 'mno',
            '7' : 'qprs',
            '8': 'tuv',
            '9' : 'wxyz'
        }

        n = len(digits)

        def backtracking(i = 0):
            if i == n:
                ans.append("".join(sol))
                return

            for letter in m[digits[i]]:
                sol.append(letter)
                backtracking(i+1)
                sol.pop()

        
        backtracking(0)
        return ans
        