package java_programming;

import java.util.Arrays;
import java.util.BitSet;

public class Program_Num_3 {

    //print 1 to 100 without using any loop or recursion
    public static void main(String[] args)
    {
//        Object num[] = new Object[100];
//        Arrays.fill(num , new Object());
//        {
//            int count = 0;
//            @Override
//
//            public String toString()
//            {
//               return Integer.toString(++count);
//            }
//        }

        String s = new BitSet()  {{set(1,101);}}.toString();
        System.out.append(s, 1, s.length());
    }

}
