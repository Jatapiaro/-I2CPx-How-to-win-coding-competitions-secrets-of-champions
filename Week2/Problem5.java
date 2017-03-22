import java.io.*;
import java.util.*;

public class Problem5{
    static Scanner newInput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new Scanner(new File("input.txt"));
        } else {
            return new Scanner(System.in);
        }
    }
    static PrintWriter newOutput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new PrintWriter("output.txt");
        } else {
            return new PrintWriter(System.out);
        }
    }

    public static void main(String[] args) throws IOException {
        try (Scanner sc = newInput(); PrintWriter out = newOutput()) {

            int n = sc.nextInt();
            sc.nextLine();

            Stack<Integer> st = new Stack<Integer>();

            for(int i = 0;i<n;i++){
                String s = sc.next();
                if(s.equals("+") || s.equals("-") || s.equals("*")){
                    int a = st.pop();
                    int b = st.pop();
                    if(s.equals("+")){
                        st.push((b+a));
                    }
                    if(s.equals("-")){
                        st.push((b-a));
                    }
                    if(s.equals("*")){
                        st.push((b*a));
                    }
                }else{
                    st.push(Integer.parseInt(s));
                }
            }

            out.println(st.pop());

        }
    }
}
