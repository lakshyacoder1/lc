class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

        private int findSquare (int number) {
            int ans = 0;
            while(number>0){
              int   num = number%10;
                ans = ans+ (num*num);
                number = number / 10;
            }
                    return ans;
        
    }
}

