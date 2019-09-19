package arrays.conception;

import java.util.Scanner;

public class ReadAndWrite {

    public int arrayDimension(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please give an array dimension");
        int dimension = scanner.nextInt();
        return dimension;
    }

    public int [] myArray(int dimension){
        Scanner scanner = new Scanner(System.in);
        int [] myArray = new int[dimension];
        for(int i = 0;i<myArray.length;i++){
            System.out.print("Elementul " +i+ " este ");
            myArray[i] = scanner.nextInt();

        }
        return myArray;
    }

    public void showArray(int [] vector){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+ " ");
        }
    }

}
