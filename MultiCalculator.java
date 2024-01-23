package Projects;

import java.util.Scanner;

public class MultiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // for options
            System.out.println("Select an option:");
            System.out.println("1. Simple Calculator");
            System.out.println("2. Currency Converter");
            System.out.println("3. Unit Converter");
            System.out.println("4. BMI Calculator");
            System.out.println("5. Loan Calculator");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    simpleCalculator();
                    break;
                case 2:
                    currencyConverter();
                    break;
                case 3:
                    unitConverter();
                    break;
                case 4:
                    bmiCalculator();
                    break;
                case 5:
                    loanCalculator();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
//Simple calculator where you can add mul sub div of 2 numbers
    private static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                return;
        }

        System.out.println("Result: " + result);
        
    }
// currency converter is convert indian rupees into usd,eur,gbp,jpy,cny,aud.
    private static void currencyConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in INR:");
        double inrAmount = scanner.nextDouble();

        System.out.println("Select a currency to convert to:");
        System.out.println("1. USD");//united state dollar
        System.out.println("2. EUR");//euro
        System.out.println("3. GBP");//Pound sterling British pound
        System.out.println("4. JPY");//Japanese Yen
        System.out.println("5. CNY");//Chinese Yuan
        System.out.println("6. AUD");//Australian Dollar

        int currencyChoice = scanner.nextInt();
        double exchangeRate;

        switch (currencyChoice) {
            case 1:
                exchangeRate = 0.012; //value of current united state dollar
                break;
            case 2:
                exchangeRate = 0.011; //value of current euro
                break;
            case 3:
                exchangeRate = 0.0095; // value of british pound
                break;
            case 4:
                exchangeRate = 1.78; // value of japanese yen
                break;
            case 5:
                exchangeRate = 0.086; // value of Chinese Yuan
                break;
            case 6:
                exchangeRate = 0.018; //value of Australian Dollar
                break;
            default:
                System.out.println("Invalid currency choice. Please try again.");
                return;
                
        }

        double convertedAmount = inrAmount * exchangeRate;
        System.out.println("Converted amount: " + convertedAmount);
        
        
    }
//unit converter 
    private static void unitConverter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a unit to convert:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.println("3. Inches to Centimeters");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Pounds to Kilograms");
       

        int unitChoice = scanner.nextInt();
        double inputValue;

        switch (unitChoice) {
            case 1:
                System.out.println("Enter length in meters:");
                inputValue = scanner.nextDouble();
                double feet = inputValue * 3.28084;
                System.out.println("Converted length: " + feet + " feet");
                break;
            case 2:
                System.out.println("Enter length in feet:");
                inputValue = scanner.nextDouble();
                double meters = inputValue * 0.3048;
                System.out.println("Converted length: " + meters + " meters");
                break;
            case 3:
                System.out.println("Enter length in inches:");
                inputValue = scanner.nextDouble();
                double centimeters = inputValue * 2.54;
                System.out.println("Converted length: " + centimeters + " centimeters");
                break;
            case 4:
                System.out.println("Enter weight in kilograms:");
                inputValue = scanner.nextDouble();
                double pounds = inputValue * 2.20462;
                System.out.println("Converted weight: " + pounds + " pounds");
                break;
            case 5:
                System.out.println("Enter weight in pounds:");
                inputValue = scanner.nextDouble();
                double kilograms = inputValue * 0.453592;
                System.out.println("Converted weight: " + kilograms + " kilograms");
                break;
            
            default:
                System.out.println("Invalid unit choice. Please try again.");
                scanner.close();
        }
    }
//  Body Mass Index (BMI) bmi calculator
    private static void bmiCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        scanner.close();
    }
// basic loan calculator
    private static void loanCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter loan amount:");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate:");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter loan term in years:");
        int loanTermInYears = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;

        double monthlyPayment =
                (loanAmount * monthlyInterestRate) /
                        (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Monthly payment: " + monthlyPayment);
        scanner.close();
        }
}
