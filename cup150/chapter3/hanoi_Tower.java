import java.util.*;

public class hanoi_Tower{
    static class Tower{
        Stack<Integer> s;
        String name;

        Tower(Stack<Integer> s, String name){
            this.s = s;
            this.name = name;
        }
    }

    static void init(Stack<Integer> src,int num){
        for(int i = num; i >= 1; --i)
            src.push(i);
    }

    static void move(int num,Tower src, Tower buf,Tower dst){
        int ele = 0;
       // if(num == 1){
       //     ele = src.s.pop();
       //     System.out.println("move "+ele+" to "+dst.name);
       //     dst.s.push(ele);
       //     return;
       // }
       // else
       if(num > 0){
            move(num-1,src,dst,buf);
            ele = src.s.pop();
            dst.s.push(ele);
            System.out.println("move "+ele+" to "+dst.name);
            move(num-1,buf,src,dst);
        }
        //}

    }

    public static void main(String[] agrs){
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        
        Tower t1 = new Tower(s1,"A");
        Tower t2 = new Tower(s2,"B");
        Tower t3 = new Tower(s3,"C");
        init(t1.s,3);
        
        move(3,t1,t2,t3);

    }


}
