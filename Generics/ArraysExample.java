public class ArraysExample {
    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        GenericMethodTest.printArray(intArray); // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        GenericMethodTest.printArray(doubleArray); // pass a Double array

        System.out.println("\nArray characterArray contains:");
        GenericMethodTest.printArray(charArray); // pass a Character array
    }
}
