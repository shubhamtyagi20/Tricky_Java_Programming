package java_programming;

import java.util.stream.IntStream;

public class Program_Num_2 {
    public static void main(String[] args) {
        //print 1-100 without using any loops
        printNum(1);
        // IntStream.range(1,101).forEach(e -> System.out.println(e));  //java streams concept
    }

    public static void printNum(int num)
    {
        if (num<=100)
        {
            System.out.println(num);
            num++;
            printNum(num);  //recursive function

        }
    }
}
