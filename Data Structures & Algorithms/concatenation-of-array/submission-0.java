class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int length=2*nums.length;
        int[]ans=new int[length];
        int j=0;
        for(int i=0;i<ans.length;i++)
        {
            if(i>=nums.length)
            {
                ans[i]=nums[j];
                j++;
            }
            else
            {
                ans[i]=nums[i];
            }
        }
        return ans;
    }
}