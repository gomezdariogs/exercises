package gfg.indianMobileNumber;

import java.util.*;

import static java.lang.String.*;

class IndianValidNumber {

    private static boolean numberPrefixIsValid(String number){
        return valueOf(number).startsWith("7") || valueOf(number).startsWith("8") || valueOf(number).startsWith("9");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of mobile numbers you will try, followed by the numbers themselves:");
        int amountOfNumbers = sc.nextInt();
        while (amountOfNumbers > 0 && amountOfNumbers <= 20) {
            for (int i = 0; i <= amountOfNumbers;i++){
                String number = sc.nextLine();
                int length = valueOf(number).length();
                while (length >= 10 && length <= 12) {
                    if (length == 10) {
                        if (numberPrefixIsValid(number)) {
                            System.out.println("Valid");
                            break;
                        }
                    } else if (length == 11) {
                        String restOfNumber = number.substring(1,10);
                        if (valueOf(number).startsWith("0") && numberPrefixIsValid(restOfNumber)) {
                            System.out.println("Valid");
                            break;
                        }
                    } else if (length == 12) {
                        String restOfNumber = number.substring(2,11);
                        if (valueOf(number).startsWith("91") && numberPrefixIsValid(restOfNumber)) {
                            System.out.println("Valid");
                            break;
                        }
                    } else {
                        System.out.println("Invalid");
                        break;
                    }
                }
            }
        }
    }
}