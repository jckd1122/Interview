import java.util.*;

public class sort_Stack{
    
    static void sort(Stack<Integer> s1,Stack<Integer> s2){
        int ele = 0;
        while(!s1.empty()){
            ele = s1.pop();
            while(!s2.empty() && s2.peek() > ele)
                    s1.push(s2.pop());
            s2.push(ele);
            
        }
    }

    static Stack<Integer> generate_Stack(int size){
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 1; i <= size; ++i)
            s.push(new Random().nextInt(size));
        return s;


    }

    public static void main(String[] args){
        Stack<Integer> s2 = new Stack<Integer>();
        sort(generate_Stack(100),s2);
        //for(int ele:s2)
        //    System.out.println(ele);
        String a = "123";
        //if(a.substring(3) == " ")
            System.out.println(a.charAt(3));


    }





}
