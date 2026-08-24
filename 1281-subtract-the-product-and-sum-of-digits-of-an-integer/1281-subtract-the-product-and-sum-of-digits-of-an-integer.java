class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pdt = 1;
        while(n>0){
            pdt = pdt*(n%10);
            sum = sum + (n%10);
            n = n/10;
        }
        return pdt-sum;
    }
}