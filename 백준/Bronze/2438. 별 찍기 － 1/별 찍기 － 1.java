import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        for (int i = 0; i < a; i++) {
            s += "*";
            System.out.println(s);
        }
    }
}
