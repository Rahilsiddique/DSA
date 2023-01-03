class Solution {
    public int minDeletionSize(String[] strs) {
        int strlen = strs[0].length();
        int i = 0, j = 0;
        int count = 0;
        while(i < strlen){
            for(j=0;j<strs.length-1;j++){
                if((int)strs[j].charAt(i) > (int)strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
            i++;
        }
        return count;
    }
}