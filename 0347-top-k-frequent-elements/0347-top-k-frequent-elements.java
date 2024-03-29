class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();

        while(res.size()< k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());

        }

        int[] ans = new int[res.size()];

        for(int i = 0; i< res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;



        



        
        
    }
}