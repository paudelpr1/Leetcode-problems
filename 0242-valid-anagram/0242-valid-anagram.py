class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        #if sorted(s) == sorted(t):
        #    return True
        #return False

        if len(s) != len(t):
            return False

        anotherT = {}

        for char in s: 
            if char in anotherT:
                anotherT[char] += 1 
            else:
                anotherT[char] = 1
        
        for char in t:
            if char in anotherT:
                anotherT[char] -= 1 
            else:
                anotherT[char] = 1
        
        print(anotherT)
        for value in anotherT.values():
            if value != 0:
                return False
        return True
        #if len(set(anotherT.values())) == 1 and set(anotherT.values()).pop() == 0:
        #    return True
        #return False

       
        
        
        
        