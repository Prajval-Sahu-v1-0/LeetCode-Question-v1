class Solution:
    def resultArray(self, nums: list[int], k: int) -> list[int]:
        n = len(nums)
        result = [0] * k
        cnt = [0] * k  # counts for subarrays starting at i+1 (initially empty, i = n)
        
        for i in range(n - 1, -1, -1):
            newcnt = [0] * k
            m = nums[i] % k
            newcnt[m] += 1  # subarray consisting of just nums[i]
            for u in range(k):
                if cnt[u]:
                    newcnt[(m * u) % k] += cnt[u]
            for x in range(k):
                result[x] += newcnt[x]
            cnt = newcnt
        
        return result