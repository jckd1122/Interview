import java.util.*;
public class Solution {
     public ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval){
        int lo = newInterval.start;
        int hi = newInterval.end;
        int x = -1;
        int y = -1;
        
        for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).start > lo )
                x = i;
            if(intervals.get(i).start <= lo && lo <= intervals.get(i).end){
                lo = intervals.get(i).start;
                x = i;
                break;
            }
        }
        
         for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).end < hi )
                y = i;
            if(intervals.get(i).start <= hi && hi <= intervals.get(i).end){
                hi = intervals.get(i).end;
                y = i;
                break;
            }
        }
        
        if( x >= 0 && y >= 0){
            for(int i = x; i <= y;++i){
                intervals.remove(i);
            }        
        
        }
            
        else if(y >= 0)
            intervals.remove(y);
        else if(x >= 0)
            intervals.remove(x);
        else {
            
            for(int i = 0; i < intervals.size();++i){
                if(intervals.get(i).start > lo){
                    x = i;
                }   
            }
        }
        if(intervals.size() == 0)
           x = 0;
        intervals.add(x, new Interval(lo,hi));

        return intervals;

    }
}