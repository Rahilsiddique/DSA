class Solution {
    public void rotateHelper(int[] arr,int s,int e){
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[] arr, int d) {
        d = d%arr.length;
        int temp = arr.length-d;
        rotateHelper(arr,0,temp-1);
        rotateHelper(arr,temp,arr.length-1);
        rotateHelper(arr,0,arr.length-1);
    }
}