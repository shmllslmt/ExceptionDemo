public class Main {
    public static double calcAverage(int[] numbers) throws ArithmeticException {
        int total = 0;
        double average = 0.0;

        if(numbers == null || numbers.length == 0) {
            throw new ArithmeticException("The array is empty! Please send an array with elements in it.");
        } else {
            for(int number: numbers) {
                total += number;
            }

            average = total / numbers.length;
        }
        return average;
    }

    public static int findMax(int[] numbers) {
        int maximum = 0;

        if(numbers == null || numbers.length == 0) {
            throw new NullPointerException("The array is empty! Please send an array with elements in it.");
        } else {
            maximum = numbers[0];

            for (int number: numbers) {
                if(number > maximum) {
                    maximum = number;
                }
            }
        }

        return maximum;
    }
    public static int findMin(int[] numbers) {
        int minimum = 0;

        if(numbers == null || numbers.length == 0) {
            throw new NullPointerException("The array is empty! Please send an array with elements in it.");
        } else {
            minimum = numbers[0];

            for (int number: numbers) {
                if(number < minimum) {
                    minimum = number;
                }
            }
        }

        return minimum;
    }

    public static void displayNumbers(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            throw new NullPointerException("The array is empty! Please send an array with elements in it.");
        } else {
            for(int number: numbers) {
                System.out.print(number + "   ");
            }
            System.out.println();
        }
    }

    public static void displayElement(int[] numbers, int find) {
        if(find < 0 || find >= numbers.length) {
            throw new IndexOutOfBoundsException("The element that you're looking for doesn't exist!");
        } else {
            System.out.println("The element that you're looking for is "+numbers[find]);
        }
    }
    public static double division (int x, int y) {
        double division = 0.0;

        if(y <= 0) {
            throw new IllegalArgumentException("The divisor must not be less than 0!");
        } else {
            division = x / y;
        }
        return division;
    }
    public static int multiplication(int x, int y) {
        int multiply = 0;

        if(x == 0 || y == 0) {
            throw new IllegalArgumentException("The numbers must not be 0!");
        } else {
            multiply = x * y;
        }
        return multiply;
    }
    public static void main(String[] args) {
        int[] numbers = {100, 90, 80, 70, 60};
        int[] empty = {};

        try {
            double aveResult = calcAverage(numbers);
            System.out.println("The average of a set of numbers is " + aveResult);

            int max = findMax(numbers);
            System.out.println("The maximum number in the array is "+max);

            int min = findMin(numbers);
            System.out.println("The minimum number in the array is "+min);

            displayNumbers(numbers);

            displayElement(numbers, 1);

            System.out.println("The result of the division is "+division(5,5));

            System.out.println("The result of the multiplication is "+multiplication(10,10));

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Null Pointer Exception is handled: "+ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index Out Of Bounds Exception is handled: "+ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}