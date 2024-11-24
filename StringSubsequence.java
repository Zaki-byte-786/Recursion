import java.util.*;
public class StringSubsequence {

//    1st method
public static List<String> generateSubsequences(String str) {
    ArrayList<String> result = new ArrayList<>();
    generateHelper(str, 0, "", result);
    result.remove("");
    return result;
}

    private static void generateHelper(String str, int index, String current, List<String> result) {
        // Base case: If we've processed all characters
        if (index == str.length()) {
            result.add(current);
            return;
        }

        // Recursive case 1: Exclude the current character
        generateHelper(str, index + 1, current, result);

        // Recursive case 2: Include the current character
        generateHelper(str, index + 1, current + str.charAt(index), result);
    }


    // 2nd method

    static void recursion(String s,int i,StringBuilder temp,ArrayList<String> ans){
        if(i == s.length()){
            ans.add(new StringBuilder(temp)+"");
            return;
        }
        recursion(s,i+1,temp,ans);
        temp.append(s.charAt(i));
        recursion(s,i+1,temp,ans);
        temp.deleteCharAt(temp.length()-1);
    }
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        recursion(str,0,sb,ans);
        ans.remove("");
        return ans;
    }
    public static void main(String[] args) {
        String s =  "car";
        System.out.println(subsequences(s));
        System.out.println(generateSubsequences(s));
    }
}
