import java.util.ArrayList;

public class StringUsingrecursion {
    static String targetOccurence(String s,int index){
        if(index == s.length())return "";
        String smallAnswer = targetOccurence(s,index+1);
        if(s.charAt(index)=='e'){return smallAnswer;}
        else {
            return s.charAt(index)+smallAnswer;
        }
    }
//    revision of targetOccurence

    static String targetreturn(String s,int index){
        if(index == s.length())return "";
        String smallAnswer = targetreturn(s,index+1);
        if(s.charAt(index) == 'r'){
            return smallAnswer;
        }
        else {
            return s.charAt(index)+smallAnswer;
        }
    }
static String reverseString(String s,int index){
        if(s.length() == index)return "";
//        String smallAns = reverseString(s,index+1);
//        return smallAns+s.charAt(index); ALT
   return reverseString(s,index+1)+s.charAt(index);
}

//revision

//    static String reverseString1(String s,int index){
//        if(s.length() == index)return "";
//        return reverseString1(s,index+1)+s.charAt(index);
//    }

//    palindrome using 2 pointer approach

//    static boolean palindrome2Pointer(String s,int left,int right){
//        if(left>=right)return true;
//        if(s.charAt(left)==s.charAt(right) && palindrome2Pointer(s,left+1,right-1)){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

//    return an arraylist of all subsequence of a given string

//    static ArrayList<String> getSSQ(String s,int index) {
//        ArrayList<String> ans = new ArrayList<>();
//        if (s.length() == index) {
//            ans.add("");
//            return ans;
//        }
//        ArrayList<String> smallAns = getSSQ(s, index + 1);
//        for (String x : smallAns) {
//            ans.add(x);
//            ans.add(s.charAt(index) + x);
//        }
//            return ans;
//    }

//    revision

//    static ArrayList<String> subSequence(String s,int index){
//        ArrayList<String> ans = new ArrayList<>();
//        if (index == s.length()) {
//          ans.add("");
//          return ans;
//        }
//      ArrayList<String> smallAnswer = subSequence(s,index+1);
//       for(String x : smallAnswer){
//           ans.add(x);
//           ans.add(s.charAt(index)+x);
//       }
//           return ans;
//    }

//    print all subsequence

//    static void printSubsequence(String s, String currAns){
//        if(s.length() == 0){
//            System.out.println(currAns);
//            return;
//        }
//        char curr = s.charAt(0);
//        String remString =  s.substring(1);
//        printSubsequence(remString,currAns+curr);
//        printSubsequence(remString,currAns);
//    }

//    revision-1

//    static void printSubsequence1(String s,String currAns){
//        if(s.length() == 0){
//            System.out.println(currAns);
//            return;
//        }
//        String remString = s.substring(1);
//        char curr = s.charAt(0);
//        printSubsequence1(remString,currAns+curr);
//        printSubsequence1(remString,currAns);
//    }

    //    revision-2

//static void printSubsequence2(String s,String currAns){
//        if(s.length() == 0){
//            System.out.println(currAns);
//            return;
//        }
//        char curr = s.charAt(0);
//        String remString = s.substring(1);
//        printSubsequence2(remString,currAns+curr);
//        printSubsequence2(remString,currAns);
//}

//static void sumOfSubset(int [] array, int index,int sum){
//        if(index >= array.length){
//            System.out.println(sum);
//            return;
//        }
//        sumOfSubset(array,index+1,sum+array[index]);
//        sumOfSubset(array,index+1,sum);
//}

//    static void sumOfSubset1(int [] array,int index,int sum){
//        if(index == array.length){
//            System.out.println(sum);
//            return;
//        }
//        sumOfSubset1(array,index+1,sum+array[index]);
//        sumOfSubset1(array,index+1,sum);
//    }

//frog_Jump_Problem

    static int minimumCost(int[] array,int index){
        if(index == array.length-1)return 0;
        int op1 = Math.abs(array[index]-array[index+1])+minimumCost(array,index+1);
        if(index == array.length-2)return op1;
        int op2 = Math.abs(array[index]-array[index+2])+minimumCost(array,index+2);
        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
//String s ="Salman";
//for(int i=0;i<s.length();i++){
//        System.out.print(s.charAt(i)+"@");
//}
//String ans = "";
//for(int i=0;i<s.length();i++){
//    if(s.charAt(i) != 'a'){
//        ans += s.charAt(i);
//    }
//}
//        System.out.println();
//        System.out.println(ans);
//        System.out.println(s+s.charAt(4)+'w');
String s ="car";
//        System.out.println(targetOccurence(s,0));
//        System.out.println(targetreturn(s,0));
//        System.out.println(reverseString(s,0));
//        System.out.println(reverseString1(s,0));

//        check whether given string is palindrome or not
//        if(reverseString(s,0).equals(s)){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not palindrome");
//        }
//        System.out.println(palindrome2Pointer(s,0,s.length()-1));
//        System.out.println(getSSQ(s,0));
//        printSubsequence(s,"");
//        printSubsequence1(s,"");
//        printSubsequence2(s,"");
//        int [] array = {2,3,5};
//sumOfSubset(array,0,0);
//        sumOfSubset1(array,0,0);
int [] array = {10,30,40,20,30};
        System.out.println(minimumCost(array,0));

//        ascii character to integer conversion

        char ch = '2';
        int char_val = ch - '0';
        System.out.println(char_val);
//
    }
}
