/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 import java.util.*;
public class Solution {
     public ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval){
        boolean hInRange = false;
        boolean tInRange = false;
        int hIndex = 0;
        int tIndex = 0;
        for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.start){
                hInRange = true;
                hIndex = i;
                break;
            }
            else if(intervals.get(i).end <= newInterval.start && intervals.get(i+1).start >= newInterval.start){
                hInRange = false;
                hIndex = i;
                break;
            }
        }


        for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).start <= newInterval.end && intervals.get(i).end >= newInterval.end){
                tInRange = true;
                tIndex = i;
                break;
            }
            else if(intervals.get(i).end <= newInterval.end && intervals.get(i+1).start >= newInterval.end){
                tInRange = false;
                tIndex = i;
                break;
            }
        
        }

        int start,end;
        if(hInRange == true && tInRange == true){
            intervals.subList(hIndex,tIndex+1).clear();
            intervals.add(hIndex,new Interval(newInterval.start,newInterval.end));
        }
        else if(hInRange == true && tInRange == false ){
            start = intervals.get(hIndex).start;
            intervals.subList(hIndex,tIndex+1).clear();
            intervals.add(hIndex,new Interval(start,newInterval.end));
        }

        else if(hInRange == false && tInRange == true){
            end = intervals.get(tIndex).end;
            intervals.subList(hIndex+1,tIndex+1).clear();
            intervals.add(hIndex+1,new Interval(newInterval.start,end));
        }
        else{
            intervals.subList(hIndex+1,tIndex+1).clear();
            if(hIndex == 0)
                hIndex = -1;              
            intervals.add(hIndex+1,new Interval(newInterval.start,newInterval.end));
        }

        return intervals;

    }
}
