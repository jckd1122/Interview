public class Solution{
    public String intToRoman(int num){
        String[] letter = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] number ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ret = "";
        int l;
        for(int i = 0;i < 13;++i){
            l = num/number[i];        //if l == 0,will skip inner loop
            for(int j = 1;j <= l;++j)
                ret += letter[i];
            num -= l*number[i];
        }
        return ret;
    }
}