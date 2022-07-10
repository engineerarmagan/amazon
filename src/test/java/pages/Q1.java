package pages;

public class Q1 {
    /*
        Write a method which accepts number as input parameter.
      The method should print all numbers which could be divided to
      2 and 5 and are smaller or equal to inputted number.
   */
    public static void main(String[] args) {
        dividedTo(8);
    }

    public static void dividedTo(int number) {
        if (number > 1) {
            for (int i = 2; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                } else if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Your number must be greater than 1");
        }
    }
}
