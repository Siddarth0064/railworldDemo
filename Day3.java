import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        System.out.println("testing day 3 ");
        float height = 155.14159f;
        System.out.printf("%.2f\n", height);
        double lengthOfTrain = 155.14159333333;
        System.out.printf("%.2f\n", lengthOfTrain);

        //---------------------------Arrays----------------------------------------
       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the Size of array");
//        int size = scan.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            System.out.printf("Enter the %dth of the array:",i);
//            arr[i] = scan.nextInt();
//        }
//        int highest = arr[0];
//        int secondHighest = Integer.MIN_VALUE;
//        for (int num : arr) {
//            if (num > highest) {
//                secondHighest = highest;
//                highest = num;
//            } else if (num > secondHighest && num < highest) {
//                secondHighest = num;
//            }
//        }
//        System.out.println("Arr: " + Arrays.toString(arr));
//        System.out.println(secondHighest+" is the Second highest number");

    //----------------------Swaping Two Numer------------------------------
        System.out.println("Using Arithmetic Operator ");
        System.out.print("Enter num1 :");
        int num1 = scan.nextInt();
        System.out.print("Enter num2 :");
        int num2 = scan.nextInt();
        System.out.printf("befor swap : num1= %d    num2= %d\n",num1,num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.printf("after swap : num1= %d    num2= %d\n",num1,num2);

        System.out.println("Using BitWise Operator ");
        System.out.print("Enter num3 :");
        int num3 = scan.nextInt();
        System.out.print("Enter num4 :");
        int num4 = scan.nextInt();
        System.out.printf("befor swap : num3= %d    num4= %d\n",num3,num4);
        num3=num3^num4;
        num4=num3^num4;
        num3=num3^num4;
        System.out.printf("after swap : num3= %d    num4= %d",num3,num4);



    }
}
