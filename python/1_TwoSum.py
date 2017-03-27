class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if len(nums) <= 1:
            return False
        compliments = {}
        for x in range(0, len(nums)):
            if nums[x] in compliments:
                return [compliments[nums[x]], x]
            else:
                compliments[target - nums[x]] = x
