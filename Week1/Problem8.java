import java.io.*;
import java.util.*;

public class Problem8 {
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
            int maxTime = 300*60;
            while(sc.hasNext()){

                
                int problems = sc.nextInt();
                int[] problemsT = new int[problems];
                for(int i=0;i<problems;i++){
                    int s = sc.nextInt();
                    problemsT[i] = s;
                }

                Arrays.sort(problemsT);
                int sum = 0;
                int nsolved = 0;
                for(int i=0;i<problems && sum<=maxTime;i++){
                    int iter = problemsT[i];
                    if(sum+iter<=(maxTime)){
                        sum+=iter;
                        nsolved++;
                    }else{
                        break;
                    }
                }
                out.println(nsolved);
            }
        }
    }
}
