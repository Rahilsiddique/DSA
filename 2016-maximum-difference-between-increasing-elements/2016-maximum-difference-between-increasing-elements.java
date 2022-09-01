class Solution {
    public int maximumDifference(int[] arr) {
        int ans = -1;
        int minVal = arr[0];
        for(int i=1;i<arr.length;i++){
            ans = Math.max(ans,arr[i]-minVal);
            minVal = Math.min(minVal,arr[i]);
        }
        if(ans == 0) return -1;
        return ans;
    }
}