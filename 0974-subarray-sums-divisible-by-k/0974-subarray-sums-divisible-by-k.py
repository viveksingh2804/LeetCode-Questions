class Solution(object):
    def subarraysDivByK(self, nums, k):
        count = {}     
        count[0] = 1  
        prefix = 0
        ans = 0

        for x in nums:
            prefix += x
            rem = prefix % k

            if rem < 0:
                rem += k

            if rem in count:  
                ans += count[rem]
                count[rem] += 1
            else:
                count[rem] = 1

        return ans
