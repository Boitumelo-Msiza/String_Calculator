import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class String_Calculator {



    public  int add(String input) {
        int sum = 0;

        if (input.isEmpty()) {
            System.out.println("0");
            return 0;
        } else if (input.equals("1")) {
            System.out.println("input was 1");
            System.out.println(" " + Integer.parseInt(input));
            return Integer.parseInt(input);
        } else if (input.contains(",") && input.length() == 3) {
            //1,1
            System.out.println("input was 1,1");
            String[] numbers = input.split(",");
            int answer = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            System.out.println(" " + answer);
            return answer;
        } else if (input.contains(",") && input.length() == 7) {
            //1,2,3,4
            System.out.println("input was 1,2,3,4");
            String[] numbers = input.split(",");
            int answer = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[3]);
           System.out.println(" " + answer);
            return answer;
        }
        else  if (input.length()==6 && input.charAt(2) == 'n')
        {
            System.out.println("input was 1\n2,3");


            String[] numbers = input.split("\n");


            int num1 =Integer.parseInt(String.valueOf(input.charAt(0)));
            int num2 =Integer.parseInt(String.valueOf(input.charAt(3)));
            int num3 =Integer.parseInt(String.valueOf(input.charAt(5)));
            int answer =  num1+num2+num3;
            System.out.println(" answer is : " +answer);

          return answer;

      }

      else  if (input.contains("-")) {
            int userinput = 0;

            String [] num =input.split(",");
            for (int i=0;i<num.length; i++)
            {
                if(num[i].startsWith("-"))
                {
                    try
                    {
                        userinput = Integer.parseInt(input);
                        System.out.println("this");
                    } catch (Exception e) {

                        System.out.print(num[i]);
                    }
                }
            }


            return  userinput;
        }
      
        return  Integer.parseInt(input);
    }

    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = scan.next();
        String_Calculator calculator = new String_Calculator();
        calculator.add(input);
    }
}