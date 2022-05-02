class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i]%2 > arr[j]%2){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if(arr[i]%2 == 0) i++;
            if(arr[j]%2 != 0) j--;
        }
        return arr;
    }
}