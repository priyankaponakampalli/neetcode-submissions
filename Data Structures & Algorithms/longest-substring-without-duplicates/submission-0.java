class Solution {
    public int lengthOfLongestSubstring(String s) {
      int res = 0;
      int n = s.length();
      for(int i=0;i<n;i++){
        HashSet<Character> sett = new HashSet<>();
        for(int j=i;j<n;j++){
          if(sett.contains(s.charAt(j))){
            break;
          }
          sett.add(s.charAt(j));
        }
        res = Math.max(res,sett.size());

      }
      return res;
        
    }
    }
