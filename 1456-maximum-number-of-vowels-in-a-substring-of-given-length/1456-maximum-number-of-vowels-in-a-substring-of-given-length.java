class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        int maxvowels = 0;
        Set <Character> sb = new HashSet <>();
        sb.add('a');
        sb.add('e');
        sb.add('i');
        sb.add('o');
        sb.add('u');
        //we can use if(s.charAt(i) == 'a' ||   s.charAt(i) == 'e' ||  s.charAt(i) == 'i' ||  s.charAt(i) == 'o' ||   s.charAt(i) == 'u') {    vowels++;} instead of set

        for(int i = 0;i<k;i++){
            if(sb.contains(s.charAt(i))){
                vowels++;
            }
            maxvowels = vowels;
        }
        for(int i = k;i<s.length();i++){
            if(sb.contains(s.charAt(i-k))){
                vowels --;
            }
            if(sb.contains(s.charAt(i))){
                vowels++;
            }
            maxvowels = Math.max(vowels,maxvowels);
        }
        return maxvowels;
    }
}