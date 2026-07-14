class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        
        int[][]combined=new int[intervals.length+1][];
        for(int i=0;i<intervals.length;i++)
        {
            combined[i]=intervals[i];
        }
        combined[intervals.length]=newInterval;
        Arrays.sort(combined,(a,b)->{
            if(a[0]!=b[0])
            return a[0]-b[0];
            else
            return a[1]-b[1];
        });
        int[]temp=combined[0];
        List<int[]>result=new ArrayList<>();
        for(int i=1;i<combined.length;i++)
        {
            int[]compare=combined[i];
            if(temp[1]>=compare[0])
            {
                temp[1]=Math.max(temp[1],compare[1]);
            }
           else
           {
            result.add(temp);
            temp=compare;
           }
        }
        result.add(temp);
        return result.toArray(new int[0][]);
    }
}
