class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (int []o1, int []o2) -> {
            return Integer.compare(o1[1], o2[1]);
        });
        int removed = 0;
        int right = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<right){
                removed++;
            }else{
                right = intervals[i][1];
            }
        }
        return removed;
    }
}