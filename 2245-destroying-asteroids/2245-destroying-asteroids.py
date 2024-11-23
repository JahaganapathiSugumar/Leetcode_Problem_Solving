class Solution:
    def asteroidsDestroyed(self, mass: int, asteroids: List[int]) -> bool:

        stack = []
        
        asteroids.sort()

        for a in asteroids:

            stack.append(a)

            while stack and stack[-1] <= mass:
                mass += stack.pop()
            
        return not stack
        