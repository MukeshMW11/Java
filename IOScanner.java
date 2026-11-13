import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOScanner  {
    public static void main(String[] args) throws IOException {
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//      String name =   bufferedReader.readLine();
//        System.out.println(name);


        Scanner scanner = new Scanner(System.in);

        Integer name = scanner.nextInt();
        System.out.println(name);


    }

}
