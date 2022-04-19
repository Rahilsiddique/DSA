class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int ans = min;
        while(min > 0){
            if(min%ans == 0 && max%ans == 0){
                break;
            }
            ans--;
        }
        return ans;
    }
}