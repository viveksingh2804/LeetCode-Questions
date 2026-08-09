class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}
        for i in range(len(nums)):
            p = target - nums[i]
            if p in seen:
                return [seen[p], i]
            seen[nums[i]] = i