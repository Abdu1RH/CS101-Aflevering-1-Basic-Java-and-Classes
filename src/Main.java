import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Method1();
        Method2();
        Method3();

//Classes and Objects

    // Car & Driver

    Car vwGolf = new Car();
        System.out.println(vwGolf);


    Driver John = new Driver();
        System.out.println(John);


//Employee
        Employee Casper = new Employee("Casper", "Lee", 25.756);
        System.out.println(Casper);

        Casper.salaryRaise(10);
        System.out.println("New Salary = " + Casper.monthlySalary);


    Employee James = new Employee("James", "Harper", 22.981);
        System.out.println(James);

        James.salaryRaise(10);
        System.out.println("New Salary = " + James.monthlySalary);

}

    /*
    Methods 1
    A person is eligible to vote if his/her age is greater than or equal to 18.
    Define a method to find out if he/she is eligible to vote. Let the user input their age.
    Get inspiration in the terminal output below:
    Please enter your age
    6
    You are not eligible to vote
     */
    public static void Method1() {
        Scanner scannerForAge = new Scanner(System.in);
        System.out.println("Please enter your age");

        int userAge = scannerForAge.nextInt();

        if (userAge < 18)
            System.out.println("You are not eligible to vote");

        else
            System.out.println("You are eligible to vote");

    }


/*
Methods 2
Define two methods to print the maximum and the minimum number respectively among three numbers
int max = getMax(1, 18, 8);
System.out.println(max); // 18

int min = getMin(1, 18, -8);
System.out.println(min); // -8
 */

    public static void Method2() {

        Scanner scannerForMin = new Scanner(System.in);
        System.out.println("Please enter three numbers");

        int num1;
        int num2;
        int num3;

        num1 = scannerForMin.nextInt();
        num2 = scannerForMin.nextInt();
        num3 = scannerForMin.nextInt();

        if (num1 < num2 && num1 < num3)
            System.out.println("The minimum number is " + num1);

        else if (num2 < num1 && num2 < num3)
            System.out.println("The minimum number is " + num2);

        else if (num3 < num1 && num3 < num2)
            System.out.println("The minimum number is " + num3);

        else
            System.out.println("error '404' minimum not found :(");



        Scanner scannerForMax = new Scanner(System.in);
        System.out.println("Please enter three numbers");

        int firstNum;
        int secondNum;
        int thirdNum;

        firstNum = scannerForMax.nextInt();
        secondNum = scannerForMax.nextInt();
        thirdNum = scannerForMax.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum)
            System.out.println("The maximum number is " + firstNum);

        else if (secondNum > firstNum && secondNum > thirdNum)
            System.out.println("The maximum number is " + secondNum);

        else if (thirdNum > firstNum && thirdNum > secondNum)
            System.out.println("The maximum number is " + thirdNum);

        else
            System.out.println("error '404' maximum not found :(");


    }

/*
Methods 3
Define a program to find out whether a given number is even or odd
boolean isThreeOdd = isOdd(3);
System.out.println(isThreeOdd); // true

boolean isEightOdd = isOdd(8);
System.out.println(isEightOdd); // false
Now let the user input the number that should be checked
if it is odd or even
 */

    public static void Method3() {

        Scanner isNumEven = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = isNumEven.nextInt();

        boolean result = numIsEven(num);
        System.out.println("Is the number " + num + " an even number? " + result);

    }
    public static boolean numIsEven (int num) {

        if (num % 2 == 0)
         return true;

        else
           return false;
    }


/*
Classes and objects

Car & driver
There is a car, which has attributes model and price, and the car has functionalities start, stop and move.
Also, there is a driver, having attributes name and age, and the behaviour drive.
Create the classes Car and Driver. The functionality of the methods does not matter.
Just print something to the console
*/

//Check Car.java & Driver.java


/*
Employee
Create a class called Employee that includes three pieces of information as instance variables
A first name
A last name
A monthly salary
Your class should have a constructor that initializes the three instance variables.
If the monthly salary is not positive, set it to 0.0.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

// Check Employee.java

}