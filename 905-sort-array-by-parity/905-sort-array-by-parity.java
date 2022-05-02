class Solution {
    public int[] sortArrayByParity(int[] arr) {
     // int[] ans = new int[arr.length];
        ArrayList<Integer> ans = new ArrayList<Integer>(arr.length);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                ans.add(arr[i]);
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                ans.add(arr[i]);
            }
        }
        int[] ansT = ans.stream().mapToInt(i -> i).toArray();
        return ansT;
    }
}