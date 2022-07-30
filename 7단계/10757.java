//BigInteger 사용
import java.util.*;
import java.io.*;
import java.math.*;  //BigInteger 사용을 위해

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();        
        System.out.println(a.add(b));  //BigInteger에서는 더하기 연산자 사용 못함 -> add 
    }
    
}
