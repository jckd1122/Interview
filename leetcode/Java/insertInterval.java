import java.util.*;
public class Solution {
     public ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval){
        int lo = newInterval.start;
        int hi = newInterval.end;
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).start <= lo && lo >= newInterval.start){
                lo = intervals.get(i).start;
                x = i;
                break;
            }
        }
        
         for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).start <= hi && hi >= newInterval.start){
                hi = intervals.get(i).end;
                y = i;
                break;
            }
        }
        
        if( x != 0 && y != 0){
            for(int i = x; i <= y;++i){
                intervals.remove(i);
            }        
        
        }
            
        else if(x == 0 && y != 0)
            intervals.remove(y);
        else if(y == 0 && x != 0)
            intervals.remove(x);
        else {
            for(int i = 0; i < intervals.size();++i){
                if(intervals.get(i).start > lo){
                    x = i;
                }   
            }
        }
        intervals.add(x, new Interval(lo,hi));

        return intervals;

    }
}