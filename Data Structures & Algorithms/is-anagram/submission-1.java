class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if(sl!=tl){
            return false;
        }
        for(int i = 0;i < sl ; i++){
            char ch = s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<tl;i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
        

    }
}
