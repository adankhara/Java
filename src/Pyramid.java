import java.util.Scanner;

/**
 * Created by Jagdish on 28/02/2017.
 */
public class Pyramid  {
        public static  void Pyramid1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter  the numbers of raw");
            int noOfRows = scanner.nextInt();
            int rowCount = 1;

            System.out.println("Here Is Your Pyramid");

            //Implementing the logic

            for (int i = noOfRows; i >=1; i--)
            {

                for (int j = 1; j <= i-1; j++)
                {
                    System.out.print(" ");
                }


                for (int j = 1; j <= rowCount ; j++)
                {
                    System.out.print(" "+j);
                }

                System.out.println();


                rowCount++;
            }
        }
}
