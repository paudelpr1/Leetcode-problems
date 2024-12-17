import heapq
class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
     
        '''
      #using heapq library  -> default min heap
        store = {}
        
        
        for x in nums:
            store[x] = 1+ store.get(x, 0)
        
        heap =  []

        for key, value in store.items():
            heappush(heap, (value, key))
            if len(heap) > k:
                heappop(heap)
        
        res = []

        for i in range(k):
            res.append(heappop(heap)[1])

        
        return res
    '''

        store = {}

        freq = [[] for i in range(len(nums)+1)]

        print(freq)
        for x in nums:
            store[x] = 1+ store.get(x, 0)
        
        for key, value in store.items():
            freq[value].append(key)

        res = []

        for i in range(len(freq)-1, 0, -1):
            for num in freq[i]:
                res.append(num)
                if len(res) == k:
                    return res

            
        
       
 
        