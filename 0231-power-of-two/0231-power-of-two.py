import math
class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        i = 0
        a = math.pow(2,i)
        while(a <= n):
            if a == n:
                return True
            i += 1
            a = math.pow(2,i)
        return False