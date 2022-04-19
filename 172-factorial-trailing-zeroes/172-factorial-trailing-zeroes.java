class Solution {
    public int trailingZeroes(int n) {
        if(n == 5) return 1;
        int res = 0;
        for(int i = 5;i<=n;i=i*5){
            res += Math.floor(n/i);
        }
        return res;
    }
}