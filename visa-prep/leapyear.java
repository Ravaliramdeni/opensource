import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        if (x%400==0)
            System.out.println("YES");
        else if(x%4==0 && x%100!=0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
