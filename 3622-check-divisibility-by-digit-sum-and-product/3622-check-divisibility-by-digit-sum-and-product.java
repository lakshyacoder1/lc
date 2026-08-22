class Solution {
    public boolean checkDivisibility(int n) {
        int k = n;
        int sum = 0;
        int pdt = 1;
        while(n>0){
            sum = sum + (n%10);
            pdt = pdt*(n%10);
            n = n/10;
            
        }
        int p = sum+pdt;
        if(k % p == 0){
            return true;
        }
        return false;
    }
}