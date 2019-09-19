package arrays.arrayOptions;

import arrays.conception.ReadAndWrite;
import arrays.method.ArrayMethods;

import java.util.Scanner;

public class ArrayClientOptions {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    ArrayMethods arrayMethods = new ArrayMethods();

    public void arrayOptions() {

        System.out.println("--------Welcome the the array methods program----------- ");
        int[] vector = readAndWrite.myArray(readAndWrite.arrayDimension());
        readAndWrite.showArray(vector);
        System.out.println();

        boolean works = true;
        while (works) {
            System.out.println("Please choose the option for the displayed array");
            System.out.println();
            System.out.println("1.Max and min element of the array");
            System.out.println("2.Second min and max of array -big complexity");
            System.out.println("3.Second max with one traverse");
            System.out.println("4.Second min with one traverse");
            System.out.println("5.Reverse the array");
            System.out.println("6.The frequency of elements which are in the array");
            System.out.println("7.The max difference between the elements from array");
            System.out.println("8.The min difference between the elements from array");
            System.out.println("9.Delete array duplicates and see new array");
            System.out.println("10.Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    arrayMethods.minimMaxim(vector);
                    break;
                case 2:
                    arrayMethods.secondLargestAndsecondSmallestBigComplexity(vector);
                    break;
                case 3:
                    System.out.println(arrayMethods.secondMaxOneTraverse(vector));
                    break;
                case 4:
                    System.out.println(arrayMethods.secondMinOneTraverse(vector));
                    break;
                case 5:
                    arrayMethods.arrayBackwards(vector);
                    break;
                case 6:
                    arrayMethods.frequencyOfElements(vector);
                    break;
                case 7:
                    System.out.println(arrayMethods.largestDifference(vector));
                    break;
                case 8:
                    System.out.println(arrayMethods.smallestDifference(vector));
                    break;
                case 9:
                    arrayMethods.deleteDuplicates(vector);
                    break;
                case 10:
                    works=false;
                    break;
                default:
                    System.out.println("No valid option");
                    break;


            }

        }
    }
}
