import java.util.Scanner;
import java.util.Random;

public class JavaPracticePrograms {

    // ==================== 1. HELLO WORLD ====================
    public static void helloWorld() {
        System.out.println("1. Hello World Program");
        System.out.println("Hello, World!");
        System.out.println("----------------------------------");
    }

    // ==================== 2. SIMPLE CALCULATOR ====================
    public static void simpleCalculator() {
        System.out.println("\n2. Simple Calculator");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result;
        switch(operation) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);
        System.out.println("----------------------------------");
    }

    // ==================== 3. EVEN OR ODD CHECKER ====================
    public static void evenOddChecker() {
        System.out.println("\n3. Even or Odd Checker");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        System.out.println("----------------------------------");
    }

    // ==================== 4. LEAP YEAR CHECKER ====================
    public static void leapYearChecker() {
        System.out.println("\n4. Leap Year Checker");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if(isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        System.out.println("----------------------------------");
    }

    // ==================== 5. MULTIPLICATION TABLE ====================
    public static void multiplicationTable() {
        System.out.println("\n5. Multiplication Table");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("----------------------------------");
    }

    // ==================== 6. DATA TYPE DEMONSTRATION ====================
    public static void dataTypeDemo() {
        System.out.println("\n6. Data Type Demonstration");
        
        int intVar = 10;
        float floatVar = 10.5f;
        double doubleVar = 20.99;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("int: " + intVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("----------------------------------");
    }

    // ==================== 7. TYPE CASTING EXAMPLE ====================
    public static void typeCastingDemo() {
        System.out.println("\n7. Type Casting Example");
        
        double doubleNum = 9.78;
        int intNum = (int) doubleNum; // Explicit casting
        
        System.out.println("Original double: " + doubleNum);
        System.out.println("Casted to int: " + intNum);
        
        int intNum2 = 100;
        double doubleNum2 = intNum2; // Implicit casting
        
        System.out.println("Original int: " + intNum2);
        System.out.println("Casted to double: " + doubleNum2);
        System.out.println("----------------------------------");
    }

    // ==================== 8. OPERATOR PRECEDENCE ====================
    public static void operatorPrecedence() {
        System.out.println("\n8. Operator Precedence");
        
        int result1 = 10 + 5 * 2;  // Multiplication before addition
        int result2 = (10 + 5) * 2; // Parentheses change order
        
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("----------------------------------");
    }

    // ==================== 9. GRADE CALCULATOR ====================
    public static void gradeCalculator() {
        System.out.println("\n9. Grade Calculator");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        
        char grade;
        if(marks >= 90) grade = 'A';
        else if(marks >= 80) grade = 'B';
        else if(marks >= 70) grade = 'C';
        else if(marks >= 60) grade = 'D';
        else grade = 'F';
        
        System.out.println("Grade: " + grade);
        System.out.println("----------------------------------");
    }

    // ==================== 10. NUMBER GUESSING GAME ====================
    public static void numberGuessingGame() {
        System.out.println("\n10. Number Guessing Game");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        System.out.println("Guess a number between 1 and 100");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if(guess < secretNumber) {
                System.out.println("Too low!");
            } else if(guess > secretNumber) {
                System.out.println("Too high!");
            }
        } while(guess != secretNumber);
        
        System.out.println("Correct! You guessed it in " + attempts + " attempts");
        System.out.println("----------------------------------");
    }

    // ==================== 11. FACTORIAL CALCULATOR ====================
    public static void factorialCalculator() {
        System.out.println("\n11. Factorial Calculator");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        long factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println(number + "! = " + factorial);
        System.out.println("----------------------------------");
    }

    // ==================== 12. METHOD OVERLOADING ====================
    public static void methodOverloadingDemo() {
        System.out.println("\n12. Method Overloading");
        
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 3.5 and 2.7: " + add(3.5, 2.7));
        System.out.println("Sum of 2, 4, and 6: " + add(2, 4, 6));
        System.out.println("----------------------------------");
    }
    
    // Overloaded methods
    private static int add(int a, int b) {
        return a + b;
    }
    
    private static double add(double a, double b) {
        return a + b;
    }
    
    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    // ==================== 13. RECURSIVE FIBONACCI ====================
    public static void recursiveFibonacci() {
        System.out.println("\n13. Recursive Fibonacci");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        System.out.println("----------------------------------");
    }
    
    private static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // ==================== 14. ARRAY SUM AND AVERAGE ====================
    public static void arraySumAverage() {
        System.out.println("\n14. Array Sum and Average");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        
        for(int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        
        double average = (double) sum / size;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("----------------------------------");
    }

    // ==================== 15. STRING REVERSAL ====================
    public static void stringReversal() {
        System.out.println("\n15. String Reversal");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Reversed string: " + reversed);
        System.out.println("----------------------------------");
    }

    // ==================== 16. PALINDROME CHECKER ====================
    public static void palindromeChecker() {
        System.out.println("\n16. Palindrome Checker");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        
        boolean isPalindrome = clean.equals(reversed);
        
        System.out.println("Is \"" + input + "\" a palindrome? " + isPalindrome);
        System.out.println("----------------------------------");
    }

    // ==================== 17. CLASS AND OBJECT CREATION ====================
    public static void classAndObjectDemo() {
        System.out.println("\n17. Class and Object Creation");
        
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);
        
        car1.displayDetails();
        car2.displayDetails();
        System.out.println("----------------------------------");
    }

    // ==================== 18. INHERITANCE EXAMPLE ====================
    public static void inheritanceDemo() {
        System.out.println("\n18. Inheritance Example");
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.makeSound();
        dog.makeSound();
        System.out.println("----------------------------------");
    }

    // ==================== 19. INTERFACE IMPLEMENTATION ====================
    public static void interfaceDemo() {
        System.out.println("\n19. Interface Implementation");
        
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        
        guitar.play();
        piano.play();
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        helloWorld();
        simpleCalculator();
        evenOddChecker();
        leapYearChecker();
        multiplicationTable();
        dataTypeDemo();
        typeCastingDemo();
        operatorPrecedence();
        gradeCalculator();
        numberGuessingGame();
        factorialCalculator();
        methodOverloadingDemo();
        recursiveFibonacci();
        arraySumAverage();
        stringReversal();
        palindromeChecker();
        classAndObjectDemo();
        inheritanceDemo();
        interfaceDemo();
    }
}

// ==================== CLASS DEFINITIONS ====================

// For Class and Object Creation
class Car {
    String make;
    String model;
    int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }
}

// For Inheritance Example
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}

// For Interface Implementation
interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar: Strum strum");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano: Plink plonk");
    }
}