import java.util.*;

public class insertInterval{
    public ArrayList<Interval>  insert(ArrayList<Interval> intervals, Interval newInterval){
        boolean hInRange,tInRange;
        int hIndex,tIndex;
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
        if(hInRange && tInRange){
            start = intervals.get(hIndex).start;
            end = intervals.get(tIndex).end;
            intervals.removeRange(hIndex,tIndex+1);
            intervals.add(new Interval(start,end));
        }
        else if(hInRange && tInRange == false ){
            start = intervals.get(hIndex).start;
            intervals.removeRange(hIndex,tIndex+1);
            intervals.add(new Interval(start,newInterval.end));
        }

        else if(hInRange == false && tInRange){
            end = intervals.get(tIndex).end;
            intervals.removeRange(hIndex+1,tIndex+1);
            intervals.add(new Interval(newInterval.start,end));
        }
        else{
            intervals.removeRange(hIndex+1,tIndex+1);
            intervals.add(new Interval(newInterval.start,newInterval.end));
        }

        return intervals;

    }





}
