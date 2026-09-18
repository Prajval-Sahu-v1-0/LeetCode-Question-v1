from typing import List

class Solution:
    def maxNumOfSubstrings(self, s: str) -> List[str]:
        n = len(s)
        first = [float('inf')] * 26
        last = [float('-inf')] * 26

        for i, ch in enumerate(s):
            c = ord(ch) - ord('a')
            first[c] = min(first[c], i)
            last[c] = max(last[c], i)

        def find_right_from_left(left: int) -> int:
            c = ord(s[left]) - ord('a')
            right = last[c]
            i = left
            while i <= right:
                ci = ord(s[i]) - ord('a')
                if first[ci] < left:
                    return -1          # can't be self-contained starting here
                right = max(right, last[ci])
                i += 1
            return right

        intervals = []
        for c in range(26):
            if first[c] == float('inf'):
                continue
            left = first[c]
            right = find_right_from_left(left)
            if right != -1:
                intervals.append((right, left))   # sort by end first

        intervals.sort()

        result = []
        prev_end = -1
        for right, left in intervals:
            if left > prev_end:
                result.append(s[left:right + 1])
                prev_end = right

        return result