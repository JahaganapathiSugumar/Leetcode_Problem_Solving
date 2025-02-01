class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        res = []
        s = ""
        for i in digits:
            s += str(i)

        n = int(s) + 1

        n = str(n)
        for i in n:
            res.append(int(i))
        
        return res


        