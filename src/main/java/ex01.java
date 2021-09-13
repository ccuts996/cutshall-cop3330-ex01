import java.util.Scanner;

public class ex01 {

        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);

            String name;
            System.out.print(" Enter your Name:");

            name = user_input.next();

            System.out.println("Hello," + name +",nice to meet you!");
        }
    }

