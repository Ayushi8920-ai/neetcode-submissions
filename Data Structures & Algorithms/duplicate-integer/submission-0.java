class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer>arr=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(arr.containsKey(nums[i]))
            {
                return true;
            }
            else
            {
                arr.put(nums[i],1);
            }
        }
        return false;
        
    }
}