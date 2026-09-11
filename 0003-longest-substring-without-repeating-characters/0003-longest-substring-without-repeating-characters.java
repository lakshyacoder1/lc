class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0)  return 0; 
        int max = 0;
        sb.append(s.charAt(0));
        int j = 0;
        while(j<s.length()){
            if(sb.indexOf(String.valueOf(s.charAt(j))) == -1){
                sb.append(s.charAt(j));
                j++;
            }
            else{
                sb.deleteCharAt(0);
            }
            max = Math.max(max,sb.length());
        }
        return max;
    }
}