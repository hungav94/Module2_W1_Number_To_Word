import java.util.Scanner;

public class NumberIntoWord {

    public static String num1ToNum9(int number) {
        String read = "";
        switch (number) {
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
            default:
                read = "";
        }
        return read;
    }

    public static String num10ToNum19(int number) {
        String read = "";
        int unit = number % 10;
        switch (unit) {
            case 0:
                read = "ten";
                break;
            case 1:
                read = "eleven";
                break;
            case 2:
                read = "twelve";
                break;
            case 3:
                read = "thirteen";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                read = num1ToNum9(unit) + "teen";
                break;
            default:
                read = "";
        }
        return read;
    }

    public static String num20ToNum99(int number) {
        String read = "";
        int dozen = number / 10;
        int unit = number % 10;
        switch (dozen) {
            case 2:
                if (unit == 0) {
                    read = "twenty";
                } else {
                    read = "twenty-" + num1ToNum9(unit);
                }
                break;
            case 3:
                if (unit == 0) {
                    read = "thirty";
                } else {
                    read = "thirty-" + num1ToNum9(unit);
                }
                break;
            case 4:
                if (unit == 0) {
                    read = "forty";
                } else {
                    read = "forty-" + num1ToNum9(unit);
                }
                break;
            case 5:
                if (unit == 0) {
                    read = "fifty";
                } else {
                    read = "fifty-" + num1ToNum9(unit);
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                if (unit == 0) {
                    read = num1ToNum9(dozen) + "ty";
                } else {
                    read = num1ToNum9(dozen) + "ty-" + num1ToNum9(unit);
                }
                break;
            default:
                read = "";
        }
        return read;
    }

    public static String num100ToNum999(int number) {
        String read = "";
        int dozen = number % 100;
        int hundred = number / 100;
        switch (hundred) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (dozen == 0) {
                    read = num1ToNum9(hundred) + " hundred";
                } else {
                    read = num1ToNum9(hundred) + " hundred " + num20ToNum99(dozen);
                }
                break;
            default:
                read = "";
        }
        return read;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number > 0 && number < 10) {
            System.out.println(num1ToNum9(number));
        } else if (number >= 10 && number < 20) {
            System.out.println(num10ToNum19(number));
        } else if (number >= 20 && number < 100) {
            System.out.println(num20ToNum99(number));
        } else if (number >= 100 && number < 1000) {
            System.out.println(num100ToNum999(number));
        }
    }
}
