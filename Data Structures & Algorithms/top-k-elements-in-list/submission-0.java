class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        int sol[] = new int[k];
        for(int i=0;i<k;i++){
            sol[i] = list.get(i).getKey();
        }
        return sol;



    }
}
