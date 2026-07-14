class Solution {
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0])
            return a[0]-b[0];
            else
            return a[1]-b[1];
        });
        List<int[]>res=new ArrayList<>();
        int[]temp=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[]compare=intervals[i];
            if(temp[1]>=compare[0])
            {
                temp[1]=Math.max(temp[1],compare[1]);
            }
            else
            {
                res.add(temp);
                temp=compare;
            }
        }
        res.add(temp);
        return res.toArray(new int[0][]);
    }
}
