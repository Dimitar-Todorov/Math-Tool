import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Which tool would you like to use? (Type just the number) ");
        System.out.println(
                "1.Basic Calculator" +
                        "\n2.Solve a quadratic equation" +
                        "\n3.Find a side in a right triangle" +
                        "\n4.Find the distance between two points in a coordinate system" +
                        "\n5.Exit"
        );
        int pick = scanner.nextInt();

        if(pick==1) {
            System.out.println("Which operation would you like to perform? (+ - * /) ");
            String operation = scanner.next();
            if(Objects.equals(operation, "+")) {
                System.out.println("What is the first number you would like to add? ");
                double num1_add = scanner.nextDouble();
                System.out.println("What is the second number you would like to add? ");
                double num2_add = scanner.nextDouble();
                double result_add = Math.round((num1_add+num2_add)*100)/100.0;
                System.out.println("The result is " + result_add);
            }
            else if (Objects.equals(operation, "-")) {
                System.out.println("What is the first number you would like to subtract? ");
                double num1_sub = scanner.nextDouble();
                System.out.println("What is the second number you would like to subtract? ");
                double num2_sub = scanner.nextDouble();
                double result_sub = Math.round((num1_sub-num2_sub)*100)/100.0;
                System.out.println("The result is " + result_sub);
            }
            else if (Objects.equals(operation, "*")) {
                System.out.println("What is the first number you would like to multiply? ");
                double num1_mul = scanner.nextDouble();
                System.out.println("What is the second number you would like to multiply? ");
                double num2_mul = scanner.nextDouble();
                double result_mul = Math.round((num1_mul*num2_mul)*100)/100.0;
                System.out.println("The result is " + result_mul);
            }
            else if (Objects.equals(operation, "/")) {
                System.out.println("What is the first number you would like to divide? ");
                double num1_div = scanner.nextDouble();
                System.out.println("What is the second number you would like to divide? ");
                double num2_div = scanner.nextDouble();
                double result_div = Math.round((num1_div/num2_div)*100)/100.0;
                System.out.println("The result is " + result_div);
            }
        }
        else if (pick==2) {
                System.out.println("How much is a? (a should not be 0) ");
                double a = scanner.nextDouble();
                System.out.println("How much is b? ");
                double b = scanner.nextDouble();
                System.out.println("How much is c? ");
                double c = scanner.nextDouble();

                double D = (((b)*(b))-(4*(a)*(c)));

                if (D>0){
                    double x1_DG0 = (((-b)+Math.sqrt(D))/(2*(a)));
                    double x2_DG0 = (((-b)-Math.sqrt(D))/(2*(a)));
                    
                    if(x1_DG0<0 && x2_DG0>0) {
                        System.out.println("D>0 Therefore, the roots of the equation are x1: " + x1_DG0 + " x2: " + x2_DG0 + " or factored " + (int) a + "(x+" + (-x1_DG0) + ")(x-" + x2_DG0 + ")");
                    }
                    else if (x2_DG0<0 && x1_DG0>0) {
                        System.out.println("D>0 Therefore, the roots of the equation are x1: " + x1_DG0 + " x2: " + x2_DG0 + " or factored " + (int) a + "(x-" + x1_DG0 + ")(x+" + (-x2_DG0) + ")");
                    }
                    if (x1_DG0<0 && x2_DG0<0) {
                        System.out.println("D>0 Therefore, the roots of the equation are x1: " + x1_DG0 + " x2: " + x2_DG0 + " or factored " + (int) a + "(x+" + (-x1_DG0) + ")(x+" + (-x2_DG0) + ")");
                    }
                    else if (x1_DG0>0 && x2_DG0>0) {    
                        System.out.println("D>0 Therefore, the roots of the equation are x1: " + x1_DG0 + " x2: " + x2_DG0 + " or factored " + (int) a + "(x-" + x1_DG0 + ")(x-" + x2_DG0 + ")");
                    }
                }
                else if (D==0) {
                    double x1_DE0 = (-((b)/(2*(a))));
                    System.out.println("D=0 so the roots of the equation are equal x1=x2: " + x1_DE0);
                }
                else {
                    System.out.println("D<0 Therefore, the equation has no real roots!");
                }
        }

        else if (pick==3) {
            System.out.println("Which side is missing? (Type just the number)" +
                "\n1.Leg a\n" +
                "2.Leg b\n" +
                "3.Hypotenuse c"
            );
            int pick_side = scanner.nextInt();
            if (pick_side==1) {
                System.out.println("How much is the side b? ");
                double b_side = scanner.nextDouble();
                System.out.println("How much is the side c? (Hypotenuse)");
                double c_side = scanner.nextDouble();

                double result_a = Math.sqrt((c_side*c_side)-(b_side*b_side));
                System.out.println("Leg a is equal to " + result_a);
            }
            if (pick_side==2) {
                System.out.println("How much is the side a? ");
                double a_side = scanner.nextDouble();
                System.out.println("How much is the side c? (Hypotenuse)");
                double c_side = scanner.nextDouble();

                double result_b = Math.sqrt((c_side*c_side)-(a_side*a_side));
                System.out.println("Leg b is equal to " + result_b);
            }
            if (pick_side==3) {
                System.out.println("How much is the side a? ");
                double a_side = scanner.nextDouble();
                System.out.println("How much is the side b? ");
                double b_side = scanner.nextDouble();

                double result_c = Math.sqrt((a_side*a_side)-(b_side*b_side));
                System.out.println("The Hypotenuse c is equal to " + result_c);
            }
        }
        else if (pick==4) {
            System.out.println("What is the first coordinate of point A?");
            double x1 = scanner.nextDouble();
            System.out.println("What is the second coordinate of point A?");
            double y1 = scanner.nextDouble();
            System.out.println("What is the first coordinate of point B?");
            double x2 = scanner.nextDouble();
            System.out.println("What is the second coordinate of point B?");
            double y2 = scanner.nextDouble();

            double AB = Math.sqrt((Math.pow(((x1)-(x2)),2))+(Math.pow(((y1)-(y2)),2)));
            System.out.println("The distance from point A to point B in a coordinate system is " + AB);
        }
        else if (pick==5) {
            System.exit(0);
        }
    }

}