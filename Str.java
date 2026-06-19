import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Str {
    public static void main(String[] str) throws IOException {
        System.out.println("Enter the input for the function : ");

        Dstr dt = new Dstr();
        dt.run();

        // BufferedReader bf = null;
        // int num = 0;
        // try {

        // bf = new BufferedReader(new InputStreamReader(System.in));
        // // Scanner sc = new Scanner(System.in);
        // num = Integer.parseInt(bf.readLine());
        // }

        // int num = System.in.read();
        // int num = sc.nextInt();
        // finally {

        // System.out.println(num);
        // bf.close();
        // sc.close();
        // }
    }
}

class Dstr {
    public void run() throws IOException {
        int num = 0;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }

    }
}
