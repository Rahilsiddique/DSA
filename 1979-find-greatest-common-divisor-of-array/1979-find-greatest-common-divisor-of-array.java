class Solution {
    public int ans(int a,int b){
        while(a != b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        return ans(min,max);
    }
}