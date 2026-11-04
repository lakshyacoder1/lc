class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList();
        int [] pcount = new int[26];
        int [] scount = new int[26];
        for(int i = 0;i<p.length();i++){
            pcount[p.charAt(i) - 'a']++;
        }
        for(int i = 0;i<s.length();i++){

            scount[s.charAt(i) - 'a']++;

            if(i>=p.length()){
                scount[s.charAt(i - p.length()) - 'a']--;
            }
            if(Arrays.equals(pcount,scount)){
                list.add((i - p.length()) + 1);
            }
        }
        return list;
    }
}