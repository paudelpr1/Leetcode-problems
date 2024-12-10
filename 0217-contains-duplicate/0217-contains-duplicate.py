class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        dup = set()
        #dup = set(nums)
        for a in nums:
            dup.add(a)
        if len(dup) == len(nums):
            return False
        return True
        