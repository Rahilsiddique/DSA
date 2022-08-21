class Solution {
    public int findDuplicate(int[] nums) {
        int[] arrT = new int[nums.length];
        Arrays.fill(arrT, 0);
        for (int i = 0; i < nums.length; i++) {
            arrT[nums[i]] += 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (arrT[i] > 1) {
                return i;
            }
        }
        return -1; 
    }
}