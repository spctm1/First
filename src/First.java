//Importing libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public void finding(int n) {
        int C[] = new int[n+1];//Creating array
        C[0] = 1;//First element in array is 1
        for (int m = 1; m <= n; ++m)   // Calculate C [m] for m = 1..n
        {
            C[m] = 0;
            for (int k = 0; k < m; ++k)
                C[m] += C[k] * C[m - 1 - k];
        }
        System.out.println(C[n]);
    }

    public static void main(String[] args) {
        int n=0;
        // Creating thread for inputting n and processing IOexception
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        First u = new First();
        u.finding(n);
    }
}