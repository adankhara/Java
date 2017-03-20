/**
 * Created by Jagdish on 08/03/2017.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void MyArray1(){
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456,500};

        Point [] points = new Point[3];
        points[0]= new Point(5,5);
        points[1]= new Point(10,10);
        points[2] = new Point(15,15);
        for (Point point: points)
        {
            System.out.println("X:" + point.X + " Y:" + point.Y);
        }
        System.out.println(my_array1.length);
        System.out.println(my_array1[0]);
        System.out.println(my_array1[1]);


        for (int index=0; index< my_array1.length-1; index++)
        {
            for (int i = 0; i < my_array1.length - 1; i++) {
                int item1 = my_array1[i];
                int item2 = my_array1[i + 1];
                if (item1 > item2) {
                    my_array1[i + 1] = item1;
                    my_array1[i] = item2;
                }
            }

        }
        System.out.println(Arrays.toString(my_array1));

        for (int item : my_array1) {
            if (item == 2035)
            {
                System.out.println("item exists");
                return;
            }
        }

        System.out.println(Arrays.toString(my_array1));

       // System.out.println("Original numeric array : "+Arrays.toString(my_array1));
       // Arrays.sort(my_array1);
       // System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

      //  System.out.println("Original string array : "+Arrays.toString(my_array2));
       // Arrays.sort(my_array2);
       // System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
    public static void GridArray() {
        String[][] grid1 = {{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        System.out.println(Arrays.toString(grid1));
    }
}
