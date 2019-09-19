package arrays.Main;

import arrays.conception.ReadAndWrite;
import arrays.method.ArrayMethods;

import java.sql.SQLOutput;

public class Main {
    public static void main (String [] args){
        ReadAndWrite readAndWrite = new ReadAndWrite();
        ArrayMethods arrayMethods = new ArrayMethods();
        int [] array = readAndWrite.myArray(readAndWrite.arrayDimension());
        readAndWrite.showArray(array);
//        System.out.println();
//        //sorteaza vectorul si nu mai functioneaza acuma
//        arrayMethods.minimMaxim(array);
//        System.out.println();
//        System.out.println(arrayMethods.secondMinOneTraverse(array));
//        System.out.println();
//        System.out.println(arrayMethods.secondMaxOneTraverse(array));
//        System.out.println();
//        arrayMethods.secondLargestAndsecondSmallestBigComplexity(array);
//        System.out.println();
//        System.out.println("Vectorul acuma este ordonat crescator");
//        readAndWrite.showArray(array);
//        arrayMethods.arrayBackwards(array);
//        arrayMethods.frequencyOfElements(array);
//        System.out.println();
 //       System.out.println(arrayMethods.largestDifference(array));
  //      System.out.println(arrayMethods.smallestDifference(array));
       arrayMethods.deleteDuplicates(array);


}
}
