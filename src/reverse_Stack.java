import java.util.Stack;

public class reverse_Stack {
   static Stack<Integer> temp = new Stack<>();
    static void reverse(Stack<Integer> st){
        if (st.isEmpty())return;
        int top = st.pop();
        reverse(st);
        while (!st.isEmpty())temp.push(st.pop());
        st.push(top);
        while (!temp.isEmpty())st.push(temp.pop());
    }
    static void insertAtBottom(Stack<Integer> st,int element){
        if (st.isEmpty()){
            st.push(element);
            return;
        }

        int top = st.pop();
        insertAtBottom(st,element);
        st.push(top);
    }
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
insertAtBottom(st,4);
        System.out.println(st);
    }
}
