class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        total = sum(nums)
        target = total - x
        
        if target < 0:
            return -1
        if target == 0:
            return len(nums)
        
        n = len(nums)
        left = 0
        curr_sum = 0
        best = -1
        
        for right in range(n):
            curr_sum += nums[right]
            while curr_sum > target and left <= right:
                curr_sum -= nums[left]
                left += 1
            if curr_sum == target:
                best = max(best, right - left + 1)
        
        return n - best if best != -1 else -1