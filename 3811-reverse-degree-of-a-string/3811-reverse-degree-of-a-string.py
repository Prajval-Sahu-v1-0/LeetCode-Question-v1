class Solution:
    def reverseDegree(self, s: str) -> int:
        total = 0
        for i, c in enumerate(s):
            reverse_pos = 26 - (ord(c) - ord('a'))  # 'a' -> 26, 'z' -> 1
            total += reverse_pos * (i + 1)           # multiply by 1-indexed position
        return total