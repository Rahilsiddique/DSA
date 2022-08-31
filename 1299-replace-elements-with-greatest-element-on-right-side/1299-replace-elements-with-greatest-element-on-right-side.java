class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int curr_lead = -1;
        for(int i=n-1;i>0;i--){
                ans[i-1] = Math.max(arr[i],curr_lead);
                curr_lead = ans[i-1];
        }
        ans[n-1] = -1;
        return ans;
    }
}