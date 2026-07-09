class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String s = strs[i];
            char first[] = s.toCharArray();  
            Arrays.sort(first);
            String sorted = new String(first);
            map.putIfAbsent (sorted,new ArrayList<>());
            map.get(sorted).add(s);         
        }
        return new ArrayList<>(map.values());



        



        
    }
}
