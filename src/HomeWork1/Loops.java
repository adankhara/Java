package HomeWork1;

import java.util.Scanner;

/**
 * Created by Jagdish on 02/03/2017.
 */
public class Loops {
    //20.Sum of natural numbers
    public static void SumOfNaturalNumbers(int num)
    {

        int sum = 0;
        for (int i=1; i<=num; i++){
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("The first n natural numbers are:" + num );
        System.out.println("The sum of natural numbers upto n limit is:" + sum);

    }
//23. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
    public static void FibonacciNumbers(int num)
    {
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        String out = "1 ,1";
        for (int i=2; i<=num; i++){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            out  = out + ", " + n3;
        }

        System.out.println(out);
    }


    //22. Display right angle triangle of @ using nested for loops
    public static void DisplayRightAngleTriangle(int rows)
    {

        int count =1;
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(count++ + " " );
            }
            System.out.println();
        }

    }
    //29. Write a program in Java to display the multiplication table of a given integer.
    public static void MultiplicationTable(int num)
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println(num + "X" + i + "=" + (num*i));
        }

    }
    //30. Display left angle triangle of @ using nested for loops
    public static void LeftAngleTriangle(int numOfRaws)
    {
        for (int raws =1; raws<=numOfRaws; raws++)
        {
            for (int space =numOfRaws; space>=raws; space--)
            {
                System.out.print(" ");
            }
            for (int stars =1; stars<=raws; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //2. Write a program in Java to display the pattern like a diamond.
    public static void PrintDiamond()
    {
        DiamondTop();
        PrintReverseDiamond();
    }

    public static void DiamondTop()
    {
        int midpoint = 6;
        int middleLine = 7;

        for (int lineNumber = 1; lineNumber <= middleLine; lineNumber++)
        {
            for (int space=lineNumber; space <= midpoint+1; space++)
            {
                System.out.print(" " );
            }

            //printing left side of diamond
            for (int stars = 1; stars<= lineNumber; stars++)
            {
                System.out.print("*");
            }

            //printing right side of diamond
            for (int stars = 1; stars<= lineNumber-1; stars++)
            {
                System.out.print("*");
            }

            //print new line
            System.out.println();
        }
    }

    public static void PrintReverseDiamond()
    {
        int midpoint = 5;
        int lastLine = 6;

        for (int lineNumber = 1; lineNumber<=lastLine; lineNumber++)
        {
            for (int space = lineNumber+2; space>=midpoint-3; space--)
            {
                System.out.print(" ");
            }
            for (int stars = 1; stars>= lineNumber-lastLine+1; stars--)
            {
                System.out.print("*");
            }
            for (int stars = midpoint; stars>= lineNumber; stars--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void NumericDiamond(int middlerow)
    {
        Loops.NumericDiamondTop(middlerow);
        Loops.NumericDiamondBase(middlerow);
    }
    public static void NumericDiamondTop(int middleLine) {
        int midpoint = middleLine -1;

        for (int lineNumber = 1; lineNumber <= middleLine; lineNumber++) {
            for (int space = lineNumber; space <= midpoint + 1; space++) {
                System.out.print(" ");
            }

            //printing left side of diamond
            for (int i= lineNumber; i>= 1; i--){
                System.out.print(i);
            }

            //printing right side of diamond
            for (int i = 1; i <= lineNumber - 1; i++){
                System.out.print(i+1);
            }
            System.out.println();

        }
    }
    public static void NumericDiamondBase(int middleLine)
    {
        int midpoint = middleLine-2;
        int lastline = middleLine -1;

        for (int linenumber =lastline; linenumber>=1; linenumber--){
            for (int space = linenumber; space<=midpoint+2; space++)
            {
                System.out.print("");
            }
            for (int j =linenumber; j>=1; j--)
            {
                System.out.print(j);
            }
            for (int j = 2; j<= linenumber; )
            {
                System.out.print(j++);
            }

            System.out.println();

        }
    }

    public static void TrianglePyramid()
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How Many Rows You Want In Your Pyramid?");

    int noOfRows = scanner.nextInt();


    int rowCount = 1;

        System.out.println("Here Is Your Pyramid");


        for (int i = noOfRows; i > 0; i--)
    {

        for (int j = 1; j <= i; j++)
        {
            System.out.print(" ");
        }


        for (int j = 1; j <= rowCount; j++)
        {
            System.out.print(rowCount+" ");
        }

        System.out.println();


        rowCount++;
    }
}

// 3.  Write a Java program to display Pascal's triangle.
    public static void PascalTriangle(int rowCount)
    {
        int num, r;

        for (int lineNumber =0; lineNumber<=rowCount; lineNumber++){
            String outputLine = "";

            num = 1;
            r = lineNumber + 1;
            for (int space = rowCount - lineNumber; space > 0; space--) {
                System.out.print(" ");
            }
            for(int count =0; count<=lineNumber;count++)
            {
                if (count > 0) {
                    num = num * (r - count) / count;
                }
                System.out.print(num + " ");
            }

            System.out.println(outputLine);
        }
    }
    public static void CharacterTriangle(int middleRaws)
    {
        Loops.CharacterTriangleTop(middleRaws);
        Loops.CharacterTriangleBase(middleRaws);
    }

    public static void CharacterTriangleTop(int middleRaws)
    {
        int midPoint = 6;
        for (int lineNum = 1; lineNum<= middleRaws; lineNum++) {
            for (int space = lineNum; space <= midPoint + 1; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i < lineNum; i++) {
                int a = 'A';
                System.out.print((char) (i + a));
            }
            for (int j = lineNum - 1; j >= 1; j--) {
                int a = 'A';
                System.out.print((char) (j + a - 1));
            }

            System.out.println();
        }
    }
    public static void CharacterTriangleBase(int middleRaw)
    {
        int midPoint = middleRaw -2;
        int lastRaw = middleRaw -1;
         for (int lineNum = lastRaw; lineNum>=1;lineNum--){
             for (int space = lineNum; space<=midPoint+2; space++)
             {
                 System.out.print(" ");
             }
             for (int i = 1; i<=lineNum;  i++ )
             {
                int a = 'A';
                 System.out.print((char)(i+a-1));
             }
             for (int  j = lineNum-1; j>=1; j--)
             {
                 int a = 'A';
                 System.out.print((char)(j+a-1));
             }

             System.out.println();
         }
    }

}

