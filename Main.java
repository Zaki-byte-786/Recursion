import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        StringBuilder sb = new StringBuilder("salman");
        sb.append("s");
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        String s = sb + "";
        System.out.println(s);
        s = s + s.charAt(1);
    }
}