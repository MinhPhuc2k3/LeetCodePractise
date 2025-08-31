class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Pair> count = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            count.putIfAbsent(nums[i], new Pair(nums[i], 0));
            count.put(nums[i], new Pair(nums[i], count.get(nums[i]).V+1));
        }
        List<Pair> list = new ArrayList(count.values());
        Collections.sort(list, (o1, o2)->Integer.compare(o1.V, o2.V));
        Collections.reverse(list);
        int []res = new int [k];
        for(int i=0; i<k; i++){
            res[i] = list.get(i).K;
        }
        return res;
    }


}

class Pair{
    public Integer K;
    public Integer V;
    public Pair(int K, int V){
        this.K = K;
        this.V = V;
    }
}