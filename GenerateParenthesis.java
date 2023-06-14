import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        //call a recursive func
        parenthesis(list , 0 , 0, n ,"");
        return list;
    }

    void parenthesis(List<String> list , int open , int close , int n, String str){
        if(str.length() == 2*n){
            list.add(str);
            return;
        }
        if( open < n){
            parenthesis(list , open+1 ,close ,n,str+"(" );
        }
        if(close < open){
            parenthesis(list , open , close + 1,n, str+")");
        }
    }
}