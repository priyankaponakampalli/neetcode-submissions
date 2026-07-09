class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        if (n <= 0) {
            return 0;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int m = list.size();
        int count = 1;
        int max = 1;

        for(int i=1;i<m;i++){
            if(list.get(i)-list.get(i-1)==1){
                count++;
                
            }else{
            count = 1;
            }
            max = Math.max(max,count);

        }
        return max;

    }
}
