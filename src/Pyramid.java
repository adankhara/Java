import java.util.Scanner;

/**
 * Created by Jagdish on 28/02/2017.
 */
public class Pyramid  {
        public static  void Pyramid1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter  the numbers of raw");
            int numRaw = scanner.nextInt();
            int raw = 1;
            System.out.println();
            for (int  i = numRaw; i > 0; i--){
                for (int j = 1; j<= i; j++){
                    System.out.println("");
                }
                for (int j =1; j >=raw; j ++ ){
                    System.out.println("");
                }
                System.out.println();
                raw ++;
            }

        }
}
