class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char p = s.charAt(i);
            if((p>='A'&& p<='Z')||(p>='a'&& p<='z')||p>='0'&&p<='9'){
                 sb.append(Character.toLowerCase(p));
            }
      
       }
       String cleaned = sb.toString();
       int left = 0;
       int right = cleaned.length() - 1;
       while(left<right){
       if(cleaned.charAt(left)!=cleaned.charAt(right)){
        return false;
       }
       left++;
       right--;

       }
       return true;

        
        
    }
}
