class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        
        Arrays.sort(intervals,Comparator.comparingDouble(o -> o[1]));
        int maxAct = 1;
        int lastEnd = intervals[0][1];

        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] >= lastEnd){
                maxAct++;
                lastEnd = intervals[i][1];
            }
        }
        return intervals.length-maxAct;
    }
}