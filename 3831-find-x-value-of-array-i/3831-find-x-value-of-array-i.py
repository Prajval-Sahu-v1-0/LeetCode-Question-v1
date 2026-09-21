from typing import List

class Solution:
    def resultArray(self, nums: List[int], k: int) -> List[int]:
        result = [0] * k
        dp = [0] * k  # dp[s] = number of subarrays ending at current index with product % k == s

        for num in nums:
            a = num % k
            new_dp = [0] * k
            for s in range(k):
                if dp[s]:
                    ns = (s * a) % k
                    new_dp[ns] += dp[s]
            new_dp[a] += 1  # the new singleton subarray starting and ending here
            dp = new_dp

            for s in range(k):
                result[s] += dp[s]

        return result