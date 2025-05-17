class Solution {
    public void sortColors(int[] nums) {
        int[] b=new int[3];
        for(int i:nums){
            b[i]++;
        }
        // for(int k:b){
        //     System.out.println(k);
        // }
        int ind=0;
        for(int i=0;i<3;i++){
            for(int k=0;k<b[i];k++){
                nums[ind++]=i;
            }
        }
    }
}
