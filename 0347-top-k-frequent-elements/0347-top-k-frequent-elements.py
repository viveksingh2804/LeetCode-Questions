from collections import Counter

class Solution:
    def topKFrequent(self, nums, k):
        freq = Counter(nums)
        arr = sorted(freq.keys(), key=lambda x: freq[x], reverse=True)
        return arr[:k]