public class DivisibleByEleven {
    public static void main(String[] args) {
        int a = 22;
        int b = 24;

        if( (a % 11 == 0) && (b % 11 == 0) ){
            System.out.println("Both a & b are divisible by eleven");
        } else if ((a % 11 == 0) && (b % 11 != 0)) {
            System.out.println("a is divisible by eleven but B is not");
        } else if ((a % 11 != 0) && (b % 11 == 0)) {
            System.out.println("b is divisible by eleven but A is not");
        } else {
            System.out.println("a & b are not divisible by eleven");
        }
    }
}
