import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);

      while(scanner.hasNextInt()) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);
      }
      scanner.close();
    }
}
