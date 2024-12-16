class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def build(S):
            ans = []
            for i in S:
                if i != "#":
                    ans.append(i)
                else:
                    if ans:
                        ans.pop()

            return "".join(ans)

        return build(s) == build(t)

        