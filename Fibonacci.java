import java.awt.*;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int elemanSayisi,firstNumber=0,secondNumber=0,number;
        Scanner in=new Scanner(System.in);
        int temp;
        System.out.print("Fibonacci serisi kac elemanli?-->");
        elemanSayisi=in.nextInt();

        for(int i=1;i<=elemanSayisi;i++)
        {
           if(i==1) {
               firstNumber = 0;
               System.out.println(firstNumber);
           }
            else if(i==2) {
            secondNumber = 1;
            System.out.println(secondNumber);
        }
            else
           {
              number=firstNumber+secondNumber;
              temp=secondNumber;
              secondNumber=number;
              firstNumber=temp;
               System.out.println(number);

           }




        }

    }
}
