package pages;
// Write a method which accepts two arrays as input parameters.
//         The method compares corresponding elements in both arrays and
//         counts the maximal sequence of equal elements and prints this number.
public class Q2 {
    public static void main(String[] args) {
        Character[] charArray1 = {'a', 'A', 'b', 'B', 's', 'C', 'd', 'D', 'b', 'B', 'b', 'B'};
        Character[] charArray2 = {'a', 'D', 'b', 'B', 'c', 'C', 'a', 'A', 'b', 'B', 'b', 'B'};

        Integer[] intArray1 = {1, 2, 3, 4, 5, 6, 7, 7, 9, 0};
        Integer[] intArray2 = {1, 7, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println("Char Array");
        compare(charArray1, charArray2);

        System.out.println("Int Array");
        compare(intArray1, intArray2);
    }

    public static void compare(Object[] a1, Object[] a2) {
        int loop = Math.min(a1.length, a2.length);
        int counter = 0, maxSequence = 0;
        for (int i = 0; i < loop; i++) {
            if (a1[i] == a2[i]) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > maxSequence) maxSequence = counter;
        }
        System.out.println("maxSequence: " + maxSequence);
    }

}
