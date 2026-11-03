class Solution {
    public String reverseWords(String s) {
        char [] arr = s.toCharArray();
        int p = 0;
        int i = 0;
        int j = 1;
        while(p<arr.length){
            
            if(arr[p] == ' ' || p == arr.length-1){

                if (arr[p] == ' ') {
                    j = p - 1;
                }
                else {
                    j = p;
                }

                while(i<j){

                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                i++;
                j--;
                }
                i = p+1;
            }
            p++;
        }
        String k = new String(arr);
        return k;
    }
}
