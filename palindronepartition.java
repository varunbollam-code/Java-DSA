import java.util.ArrayList;
import java.util.List;

public class palindronepartition {

    public static List<List<String>> solve(String s)
    {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        condition(0,s,res,ds);
        return res;
    }
    public static void condition(int index,String s, List<List<String>> res,List<String> ds)
    {
        if(index==s.length()) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=index;i<s.length();++i) {
            if(palindrome(s,index,i)) {
                ds.add(s.substring(index, i+1));
                condition(i+1, s, res, ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static boolean palindrome(String s,int start,int end)
    {   
        if(s.charAt(start++)!=s.charAt(end--)) {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        String s="aabb";
        System.out.println(solve(s));
    }
}
