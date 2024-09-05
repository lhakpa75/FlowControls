public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The maximum number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The maximum number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The maximum number is: " + num3);
        } else {
            System.out.println("All numbers are equal");
        }
    }
}
