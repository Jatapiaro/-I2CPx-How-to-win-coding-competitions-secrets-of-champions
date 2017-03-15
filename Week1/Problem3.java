import java.io.*;
import java.util.*;

public class Problem3{
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
            while(sc.hasNext()){
                int days = sc.nextInt();
                int[] arr = new int[days];
                int[] arr2 = new int[days];
                int i;

                for(i=0;i<days;i++){
                    arr[i] = sc.nextInt();
                }
                for(i=0;i<days;i++){
                    arr2[i] = sc.nextInt();
                }

                int total = 0;
                boolean practice = true;
                boolean theor = true;
                for(i=0;i<days;i++){
                    if(arr[i]>arr2[i]){
                        theor = false;
                        total+=arr[i];
                    }else{
                        practice = false;
                        total+=arr2[i];
                    }
                }

                int totalMax = -1;
                if(practice && !theor){
                    for(i=0;i<days;i++){
                        int aux = total;
                        aux-=arr[i];
                        aux+=arr2[i];
                        totalMax = Math.max(totalMax,aux);
                    }
                    total = totalMax;
                }else if(theor && !practice){
                    for(i=0;i<days;i++){
                        int aux = total;
                        aux-=arr2[i];
                        aux+=arr[i];
                        totalMax = Math.max(totalMax,aux);
                    }
                    total = totalMax;
                }

                out.println(total);
            }
        }
    }
}
