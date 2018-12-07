class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        dict1 ={}
        for i in range(len(nums)):
            if nums[i] in dict1:
                dict1[nums[i]]= dict1[nums[i]]+1
            else:
                dict1[nums[i]] = 1
                
        dict2 = sorted(dict1, key=dict1.get, reverse=True)
        
        kmost =[]
        for i in range(k):
            kmost.append(dict2[i])
            
        return kmost
        
        