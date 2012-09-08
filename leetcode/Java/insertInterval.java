/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean sInRange = false;
        int sIndex = 0;
        int eIndex = 0;
        boolean eInRange = false;
        int l = intervals.size();
        for(int i = 0; i < l;++i){
            if(newInteval.start < intervals.get(0).start){
                sIndex = 0;
                break;
            }
            if(newInteval.start > intervals.get(l-1).end){
                sIndex = l;
                break;
            }
            if(i < l-1 && newInteval.start > intervals.get(i).end && newInteval.start < intervaks.get(i+1).start){
                sIndex = i+1;
                break;
            }
            if(newInteval.start < intervals.get(i).end && newInteval.start > intervaks.get(i).start){
                sInRange = true;
                sIndex = i;
                break;
            }
        }
        
         for(int i = 0; i < l;++i){
            if(newInteval.end < intervals.get(0).start){
                eIndex = 0;
                break;
            }
            if(newInteval.end > intervals.get(l-1).end){
                eIndex = l;
                break;
            }
            if(i < l-1 && newInteval.end > intervals.get(i).end && newInteval.end < intervaks.get(i+1).start){
                eIndex = i+1;
                break;
            }
            if(newInteval.end < intervals.get(i).end && newInteval.end > intervaks.get(i).start){
                eInRange = true;
                eIndex = i;
                break;
            }
        }
        
        if(sInRange && eInRange){
            if(sIndex = eIndex)
                return intervals;
            else{
                
            }
            
        }
    }
}
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
