package HomeWork1;


import java.util.Scanner;

/**
 * Created by Asha on 26/02/2017.
 */

public class HomeWork {
    //Find out even or odd number using ternary operator

    public static void EvenOdd1(int number) {

        String output = null;

        output = number % 2 == 0 ? (number + "is even number") : (number + " is odd number");

        System.out.println(output);
    }

    //2. Find leap year
    public static void FindLeapYear(int year) {
        System.out.println("User entered year:" + year);
        if (year % 4 == 0) {
            System.out.println(year + "is leap year");
        } else {
            System.out.println(year + "is not leap year");
        }
    }

    //3. Find Students Grade
    public static void StudentsGrade(String Name, int RollNo, int Maths, int Science, int English) {
        System.out.println("User entered Name:" + Name + " Rollno:" + RollNo + " Maths:" + Maths + " Science: " + Science + " English: " + English);
        int Total = Maths + Science + English;
        System.out.println(" Total Score: " + Total);
        float Percentage = Total / 3;
        System.out.println("Percentage:" + Percentage);
        String Result = Percentage >= 35 ? ("Pass") : ("Fail");
        System.out.println("Result:" + Result);
        String Grade = null;
        if (Percentage >= 80) {
            Grade = "A+";
        } else if (Percentage >= 60) {
            Grade = "A";
        } else if (Percentage >= 50) {
            Grade = "B";
        } else if (Percentage >= 35) {
            Grade = "C";
        }
        System.out.println("Grade:" + Grade);
    }

    //4. Find Students PassOrFail
    public static void StudentsPassFail(String Name, int RollNo, int Maths, int Science, int English) {
        System.out.println("User entered Name:" + Name + " Rollno:" + RollNo + " Maths:" + Maths + " Science: " + Science + " English: " + English);
        int Total = Maths + Science + English;
        System.out.println(" Total Score: " + Total);
        float Percentage = Total / 3;
        System.out.println("Percentage:" + Percentage);
        String Result = Maths >= 35 && Science >= 35 && English >= 35 ? ("Pass") : ("Fail");
        if (Result == "Fail")
            return;
        System.out.println("Result:" + Result);
        String Grade = null;
        if (Percentage >= 80) {
            Grade = "A+";
        } else if (Percentage >= 60) {
            Grade = "A";
        } else if (Percentage >= 50) {
            Grade = "B";
        } else if (Percentage >= 35) {
            Grade = "C";
        }
        System.out.println("Grade:" + Grade);
    }

    //5.InterchangeValue
    public static void PrintInterChangeValue(int Value1, int Value2) {
        System.out.println("User Entered Value1: " + Value1 + " Value2: " + Value2);
        int Value3 = Value1;
        Value1 = Value2;
        Value2 = Value3;
        System.out.println("After Interchanged: Value1:" + Value1 + " Value2:" + Value2);

    }

    //6.EmployeeGrossSalary
    public static void EmployeeGrossSalary(String EmployeeID, String Name, int BasicSalary) {
        float HRA = BasicSalary * 10 / 100;
        float DA = BasicSalary * 8 / 100;
        float TA = BasicSalary * 9 / 100;
        float PF = BasicSalary * 20 / 100;
        float GrossSalary = BasicSalary + HRA + DA + TA - PF;
        System.out.println("EmployeeID:" + EmployeeID + "\n Name:" + Name
                + "\n BasicSalary:" + BasicSalary
                + "\n HRA:" + HRA + "\n DA:" + DA + "\n TA:" + TA + "\n PF:" + PF + "\n GrossSalary:" + GrossSalary);

    }

    //7.AverageOfFive
    public static void Average5(int num1, int num2, int num3, int num4, int num5) {
        float average = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println(average);
    }

    //9.SalesCommission
    public static void SalesCommission(String SalesID, String Name, int Amount) {
        float commission = 0;
        if (Amount >= 50000) {
            commission = Amount * 35 / 100;
        } else if (Amount >= 30000) {
            commission = Amount * 20 / 100;
        } else if (Amount >= 20000) {
            commission = Amount * 10 / 100;
        } else if (Amount >= 10000) {
            commission = Amount * 5 / 100;
        } else if (Amount < 10000) {
            commission = Amount * 2 / 100;
        }
        System.out.println("Commission:" + commission);

    }

    //10.CityNamesByAlphabets
    public static void CityNames(char cityInitial) {
        String citiname = null;

        if (cityInitial == 'a' || cityInitial == 'A') {
            citiname = "Ahmedabad";
        } else if (cityInitial == 'b' || cityInitial == 'B') {
            citiname = "Baroda";
        } else if (cityInitial == 'c' || cityInitial == 'C') {
            citiname = "Culcutta";
        } else if (cityInitial == 'd' || cityInitial == 'D') {
            citiname = "Dehradun";
        } else if (cityInitial == 'e' || cityInitial == 'E') {
            citiname = "Eluru";
        } else if (cityInitial == 'f' || cityInitial == 'F') {
            citiname = "Fari8dabad";
        } else {
            System.out.println("Invalid Entry");
            return;
        }
        System.out.println(citiname);
    }

    //11.CityNamesByAlphabets using Switch
    public static void CityNamesUsingSwitch(char cityInitial) {
        String citiname = null;

        switch (cityInitial) {
            case 'A':
            case 'a':
                citiname = "Ahmedabad";
                break;
            case 'b':
            case 'B':
                citiname = "Baroda";
                break;
            case 'c':
            case 'C':
                citiname = "Culcutta";
                break;
            case 'd':
            case 'D':
                citiname = "Dehradun";
                break;
            case 'e':
            case 'E':
                citiname = "Eluru";
                break;
            case 'f':
            case 'F':
                citiname = "Faridabad";
                break;
            default:
                citiname = "Invalid Entry";
                break;
        }
        System.out.println(citiname);
    }

    //12.CaseChange
    public static void CaseChange(char UpperCase) {
        System.out.println("User entered:" +  UpperCase);
        int asciiValue = (int) UpperCase;
        if(asciiValue >= 65 && asciiValue<=90 ){
            asciiValue = asciiValue + 32;
        }
        System.out.println((char) asciiValue);
    }
    //13.+-/* 2 numbers
    public static void Calculator(int value1, int value2, String symbol) {
        System.out.println("User enterd: Value1:" + value1 + " Value2:" + value2);
        float result = 0;
        if (symbol.equalsIgnoreCase("+")) {
            result = value1 + value2;

        } else if (symbol.equalsIgnoreCase("-")) {
            result = value1 - value2;

        } else if (symbol.equalsIgnoreCase("*")) {
            result = value1 * value2;

        } else if (symbol.equalsIgnoreCase("/")) {
            result = value1 / value2;

        }
        System.out.println(result);

    }

    //14 +-*/ 2 numbers using switch
    public static void CalculatorWi8thSwitch(int value1, int value2, char symbol){
        System.out.println("User enterd: Value1:" + value1 + " Value2:" + value2);
        double result = 0;
        switch (symbol){
            case '+':

                result = value1 + value2;
                break;
            case '-':

                result = value1 - value2;
                break;
            case '*':

                result = value1 * value2;
                break;
            case '/':

                result = value1 / value2;
                break;


        }
        System.out.println(result);
    }



    //15 1 to 100 numbers which can divide by 3 and 5
    public static void divisibleBy3and5()
    {
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i <=100; i++)
        {
            if (i % 3==0){
                divisibleBy3 = divisibleBy3 + i + ",";
            }
            if (i % 5==0){
                divisibleBy5 = divisibleBy5 + i + ",";
            }
        }
        System.out.println("DivisibleBy 3:" + divisibleBy3.substring(0, divisibleBy3.length() -1));
        System.out.println("DivisibleBy 5:" + divisibleBy5.substring(0, divisibleBy5.length() -1));
    }
    //16.
    public static void FindKeyWords(char value){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        value = scanner.next().charAt(0);
        if ((value >= 'a' && value <='z') || (value >='A' && value <='Z'))
        {
            System.out.println(value + " is a character");
        }
        else if ((value >= '0' && value <= '9'))
        {
            System.out.println(value + " is a number");
        }
        else
        {
            System.out.println(value + " is a special character");
        }


    }
    //17.Find out Day names of the weel
    public static void Daynames(int day){
        String days = null;
        switch (day){
            case 1:
                days = "Monday";
                break;
            case 2:
                days = "Tuesday";
                break;
            case 3:
                days = "Wednesday";
                break;
            case 4:
                days = "Thursday";
                break;
            case 5:
                days = "Friday";
                break;
            case 6:
                days = "Saturday";
                break;
            case 7:
                days = "Sunday";
                break;
            default:days = "Invalid Day";
                break;

        }
        System.out.println(days);
    }
    //18 find how many days in Month
    public static void FindDaysinMonth(int month){
        System.out.println("Entered month is:" + month);
        if (month< 1 || month >12)
        {
            System.out.println("Invalid Monh");
            return;
        }
        int days = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            }
        System.out.println(days + " days");

        }
    //19.FindEnteredLetterIsVowelOrConsonant
    public static void FindVowelConsonant(String input){
        if (input.length()!= 1){
            System.err.println("Invalid Entry...");
            return;
        }

        char ch = input.charAt(0);
        if(! ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
        {
            System.err.println("Invalid Entry...");
            return;
        }
        if (ch == 'a'|| ch == 'A' || ch == 'i' || ch == 'I' || ch == 'e' || ch == 'E' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.println("Entered character is vowel.");
        }
        else {
            System.out.println("Entered character is consonant.");
        }

    }
    //20.


    }





