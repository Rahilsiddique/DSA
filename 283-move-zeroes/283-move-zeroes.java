class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int peeche = 0;
        int aage = 0;
        int temp = 0;
        if(n == 0 || n == 1){
            return;
        }
        while(aage < n){
            if(arr[aage] == 0){
                ++aage;
            }
            else{
                temp = arr[aage];
                arr[aage] = arr[peeche];
                arr[peeche] = temp;
                ++aage;
                ++peeche;
            }
        }
    }
}