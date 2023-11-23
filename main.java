import java.util.Scanner;

public class Main {

    static void myMethod(String param) {
        System.out.println("Hello world!");
    }

    static void printMyName() {
        System.out.println("ilia pomeranets");
    }

    //calculate sum
    static void calculateSum(int x, int y) {
        int z = 13;
        System.out.println("The sum is " + (x+y));
    }


//    עובד במפעלי ישראלקטריק חתום על הסכם השכר הבא:
//    אם הוותק מעל 10 שנים – תוספת של 10% משכר היסוד.
//    עבור כל ילד מהרביעי עד השישי (כולל) – תוספת של 400 ש"ח.
//    עבור כל ילד מהשביעי (כולל) – תוספת של 700 ש"ח.
//    כל שעה מעבר ל- 160 שעות  נחשבת "שעה נוספת".
//    עבור כל שעה נוספת מ- 16 הראשונות – 80 ש"ח.
//    עבור כל שעה נוספת מעבר לכך – 120 ש"ח.
//    קלוט משכורת יסוד, ותק, מספר ילדים ומספר שעות עבודה.

    static double calculateSalary(double baseSalary, double yearsInJob, int numberOfChildren, int hoursOfWork) {
        double totalSalary = baseSalary;
        //if more than 10 years add 10%
        if (yearsInJob > 10) {
            totalSalary *= 1.1;
        }
        //checking the children
     /*   if (numberOfChildren>6)
            totalSalary = totalSalary + (numberOfChildren-6) * 300 + (numberOfChildren-3) *400;
        else if (numberOfChildren > 3) {
            totalSalary = totalSalary + (numberOfChildren-3) *400;
        }*/
        if (numberOfChildren >= 4) { //10
            for (int i = 4; i <= numberOfChildren; i++) {
                if (i <= 6) {
                    totalSalary += 400;
                }
                if (i >= 7) {
                    totalSalary += 700;
                }
            }
        }
        //checking the hours
        if (hoursOfWork > 160) {
            for (int i = 161; i <= hoursOfWork; i++) {
                if (i <= (160 + 16)) {
                    totalSalary += 80;
                }
                if (i > (160 + 16)) {
                    totalSalary += 120;
                }
            }
        }
        return totalSalary;
    }

    static boolean checkId(int id) {
        //321565654;
        int toCheck = id/10; //number of 8 digits
        int expectedResult = id%10;
        int sumOfDigits = 0;
        for (int i = 1; i <= 8; i++) {
            int digit = toCheck % 10;
            if (i % 2 != 0) {//checking if i is even (we want to multiply the digit by 2 if I is odd
                digit = digit * 2;
                if (digit >= 10) {
                    sumOfDigits = sumOfDigits + (digit % 10) + (digit/10);
                } else {
                    sumOfDigits += digit;
                }
            } else {
                sumOfDigits += digit;
            }
            //to reduce and throw the last digit
            toCheck/=10;
        }
        int checkingDigit = (100 - sumOfDigits) % 10;
        return checkingDigit == expectedResult;//if checking digits is like expected the line will return true
    }




    public static void main(String[] args) {
       // myMethod();
//        printMyName();
//        printMyName();
//        printMyName();
      //  String name = "Aria";
        //myMethod("Ilia");
//        calculateSum(2,5);
//        calculateSum(10,-9);
//        double totalSalary = calculateSalary(8888, 15.5, 8, 230);
//        System.out.println(totalSalary);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the name ");
//        String name = scanner.nextLine();
//        System.out.println("Please enter the ID");
//        int id = scanner.nextInt();//assumption that the input is correct
//        boolean isIdCorrect = checkId(id);
//        System.out.println("your ID " + id + " is correct? :" + isIdCorrect);

        double result = plusMethod(8.5,5.2);
        System.out.println(result);
    }


    static int plusMethod(int x, int y) {
        return x + y;
    }


    static double plusMethod(double num1, double num2) {
        return num1 + num2;
    }


    static double plusMethod(String num1, String num2) {
        return  plusMethod(Double.valueOf(num1), Double.valueOf(num2));
    }

    static void saveToDB(int x){
        System.out.println("saving x");
    }

    static void saveToDB(int[] arrX) {
        for (int i = 0; i < arrX.length; i++) {
            saveToDB(arrX[i]);
        }
    }

    static void saveToDB(int[] arrX, int[] arrY) {
        saveToDB(arrX);
        saveToDB(arrY);
    }


    /*Create two methods calculateTimeDiff which accepts two formats.
    Method 1 accepting two arrays:
    startTime, endTime - arrays of 3 cells
    In index 0 - hours
    In index 1 - minutes
    In index 2 - seconds
    Method 2 	accepting 6 integers :
    startHour,startMinute,startSecond,endHour,endMinute,endSecond
    Both methods should calculate time diffs in the following format : hh:mm:ss
    Example:
    Input : 23,59,58,0,0,2 -> calculateTimeDiff method should return 00:00:04
    Input [21;02;05],[22;02;06] -> calculateTimeDiff method should return 01:00:01
    Run those methods with different inputs.
*/



}
