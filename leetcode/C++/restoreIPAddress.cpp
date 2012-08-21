public class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        vector<string> list;
        int l = s.size()+4;
        //reduce unnecessary calucalation,works for judge large since it produces a lot of long strings
        if(s.size() > 12)
            return list;
        restoreHelper(list,s,"",l);
        return list;


    }

    void restoreHelper(vector<string> list,string restStr,string cur,int l){
        int n = restStr.size();
        if(restStr.size() == 0){
            if(cur.size() == l){ 
                list.push_back(cur.substr(0,cur.length()-1));
                
            }
            return;
        }

       for(int i = 1; i <= n;++i){
           if((i == 3 && Integer.parseInt(restStr.substr(0,3)) > 255) || (i > 3))
               break;
           if(i > 1 && restStr.substr(0,i)[0] == '0')
               break;
           string added = restStr.substr(0,i)+".";
           
           restoreHelper(list,restStr.substr(i,n-i),cur+added,l);
        }
    }

}