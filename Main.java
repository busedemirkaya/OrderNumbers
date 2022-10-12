import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        a = input.nextInt();


        System.out.print("Number 2: ");
        b = input.nextInt();

        System.out.print("Number 3: ");
        c = input.nextInt();


        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if ((b > c) && (b > a)) {
            if (c > a) {
                System.out.print("b>c>a");
            } else {
                System.out.print("b>a>c");
            }
        } else {
            if (b > a) {
                System.out.print("c>b>a");
            } else {
                System.out.print("c>a>b");
            }
        }
    }
}