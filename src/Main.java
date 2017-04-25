/*
 * Given numbers x and n, where n is a power of 2, print out the smallest 
 * multiple of n which is greater than or equal to x. Do not use division or
 * modulo operator.
 */

/**
 *
 * @author Scott
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            multiples(line);
        }
    }
    
    public static void multiples(String line) {
        String[] tokens = line.split(",");
        int x = Integer.parseInt(tokens[0]);
        int n = Integer.parseInt(tokens[1]);
        
        while(x > n) {
            n += n;
        }
        
        System.out.println(n);
    }
}