class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String s = new String("");
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        int r = n-1;
        for(int i = 0;i<first.length() && i<last.length(); i++){
            char ch1 = first.charAt(i);
            char ch2 = last.charAt(i);
            if(ch1 == ch2){
                s = s + ch1;
            }
            else break;
        }
        return s;
    }
}