class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length-1;
        int i=0;
        int j=0;
        while(i<=n && j<=n){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
           else if(nums[j]==0){
                j++;
            }
        }
    }
}
