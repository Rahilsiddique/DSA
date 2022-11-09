class Solution {
    public static int giveAns(int[] arr,int s,int e,int target,boolean decider){
        int ans = -1;
        while(s <= e){
            int mid = (s+e)/2;
            if(arr[mid] > target){
                e = mid -1 ;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                ans = mid;
                if(decider){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans[] = new int[2];
        ans[0] = giveAns(nums,s,e,target,true);
        ans[1] = giveAns(nums,s,e,target,false);
        return ans;
    }
}