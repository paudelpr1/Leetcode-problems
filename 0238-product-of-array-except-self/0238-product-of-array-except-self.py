class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        '''
        oth = 1
        leftProd = [1] * len(nums)
        rightProd = [1] * len(nums)

        
        for i in range(1, len(nums), +1):
            leftProd[i] = nums[i-1] * leftProd[i-1]

        for i in range(len(nums)-2, -1,  -1):
            rightProd[i] = nums[i+1] * rightProd[i+1]
        
        finalProd = [1] * len(nums)

        for i in range(len(nums)):
            finalProd[i] = leftProd[i] * rightProd[i]

        return finalProd
        '''

        res = [1] * len(nums)

        prefix = 1

        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        
        postfix = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] = postfix * res[i]
            postfix *= nums[i]
        
        return res
        


        