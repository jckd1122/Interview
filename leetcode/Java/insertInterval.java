import java.util.*;
public class Solution {
     public ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval){
        int lo = newInterval.start;
        int hi = newInterval.end;
        int x = -1;
        int y = -1;
        boolean found = false;
        
        for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).end > lo){
                    x = i+1;
                
            }
                
            if(intervals.get(i).start <= lo && lo <= intervals.get(i).end){
                lo = intervals.get(i).start;
                x = i;
                found = true;
                break;
            }
        }
        
         for(int i = 0; i < intervals.size();++i){
            if(intervals.get(i).end < hi )
                y = i+1;
            if(intervals.get(i).start <= hi && hi <= intervals.get(i).end){
                hi = intervals.get(i).end;
                y = i;
                found = true;
                break;
            }
        }
        
        if( x >= 0 && y >= 0 ){
            for(int i = 1; i <= y-x+1;++i){
                intervals.remove(x);
            }        
        
        }
            
        else if(y >= 0 && found == true)
            intervals.remove(y);
        else if(x >= 0 && found == true)
            intervals.remove(x);
        else {
            
            for(int i = 0; i < intervals.size();++i){
                if(intervals.get(i).end < lo){
                    x = i+1;
                }   
            }
        }
        if(intervals.size() == 0)
            x = 0;
        intervals.add(x, new Interval(lo,hi));

        return intervals;

    }
}