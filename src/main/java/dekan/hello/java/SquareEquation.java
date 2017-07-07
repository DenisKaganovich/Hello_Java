package dekan.hello.java;
import java.util.Scanner;
/**
 * Created by Denis_Kaganovich on 7/4/2017.
 */
public class SquareEquation {
//    double a,b,c;
//    a=1;
//    b=3;
//    c=5;
    public static void main(String[] args) {
        System.out.println("..:: SQUARE EQUATION ::..");
//        double a,b,c;
//    a=1;
//    b=3;
//    c=5;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = in.nextDouble();
        System.out.print("Введите значение b: ");
        double b = in.nextDouble();
        System.out.print("Введите значение c: ");
        double c = in.nextDouble();

        System.out.println("a=" + a + "\n" +"b=" + b + "\n" +"c=" + c);

        double d;
        double x;
        double x1;
        double x2;

//        d = Math.pow(b, 2) - (4*a*c);\
        d = (b*b) - (4*a*c);

        if (d < 0)
        {
            System.out.print("Вещественных корней нет, т.к. D = " + d);
                    }
        else {
          if (d == 0)
          {
              x = -b/(2*a);
              System.out.print("Один корень, т.к. D = 0" + "\n"+ "X = " + x);
                      }
          else
          {
              double SqrtD;
              double IncrA;
              SqrtD = Math.sqrt(d);
              IncrA = 2*a;

              x1=(-b-SqrtD)/IncrA;
              x2=(-b+SqrtD)/IncrA;
              System.out.print("Два корня, т.к. D = " + d + "\n"+ "Первый вещественный корень X1 = " + x1 + "\n" + "Второй вещественный корень X2 = " + x2);
          }
        }
        }
    }
