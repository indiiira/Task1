import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

     System.out.println("Введите n");
        Scanner str=new Scanner(System.in);
        int n=str.nextInt();
        int[] num;
        int max,min;
        max=0;
        min=1000;
        num=new int[10];
        for (int i=0;i<10;i++)
        {
            num[i]= (int) ((Math.random() * ((100 - 0) + 1)) + 0);
        }
        for (int i=0;i<num.length; i++)
        {
            if (num[i]>max)
            {
                max=num[i];

            } else if (num[i]<min)
            { min=num[i];

            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}