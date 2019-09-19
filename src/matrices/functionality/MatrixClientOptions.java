package matrices.functionality;



import matrices.conception.Implementation;
import matrices.conception.ReadingWritting;

import java.util.Scanner;

public class MatrixClientOptions {

    ReadingWritting readingWritting = new ReadingWritting();
    Implementation implementation = new Implementation();


    public void chooseOptions() {
        System.out.println("Welcome the the MATRIX program\n\n");

        int[][] matrice = readingWritting.createMatrix(readingWritting.showDimension());
        readingWritting.showMatrix(matrice);
        System.out.println();

        boolean works = true;
        while (works) {
            System.out.println("Please choose the option for the displayed matrix");
            System.out.println();
            System.out.println("1.Max element and position of max element");
            System.out.println("2.Min element and position of min element");
            System.out.println("3.Switch the min and max in the matrix");
            System.out.println("4.Convert matrix to vector and sort the vector");
            System.out.println("5.Display elements and sum from the main diagonal");
            System.out.println("6.Display elements and product from the secondary diagonal");
            System.out.println("7.Display elements and Power/product from the elements above the main diagonal - fct corecta ptr dimensiune 3");
            System.out.println("8.Display elements and Bitwise Or from the elements under the secondary diagonal - fct corecta ptr dimensiune 3");
            System.out.println("9.Display matrix result of the product elements of 2 matrices");
            System.out.println("10.Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.println(implementation.maxAndPosMaxMatrix(matrice));
                    readingWritting.showMatrix(matrice);
                    break;

                case 2:
                    System.out.println(implementation.minAndPosMinMatrix(matrice));
                    readingWritting.showMatrix(matrice);
                    break;
                case 3:
                    implementation.switchMinMax(matrice);
                    break;
                case 4:
                    implementation.matrixToVector(matrice);
                    implementation.sortedArray(matrice);
                    readingWritting.showMatrix(matrice);
                    break;
                case 5:
                    System.out.println(implementation.SumAndElementsMainDiagonal(matrice));
                    readingWritting.showMatrix(matrice);
                    break;
                case 6:
                    System.out.println(implementation.ProductAndElementsSecondDiagonal(matrice));
                    readingWritting.showMatrix(matrice);
                    break;
                case 7:
                    System.out.println(implementation.PowerperProductAndElementsAboveMainDiag(matrice));
                    readingWritting.showMatrix(matrice);
                    break;
                case 8:
                    System.out.println(implementation.OrBitsAndElementsUnderSecondaryDiag(matrice));
                    readingWritting.showMatrix(matrice);
                    break;
                case 9:
                    implementation.productElementElementfrom2Matrices(matrice);
                    break;

                case 10:
                    works = false;
                    break;
                default:
                    System.out.println("No valid option");
                    break;
            }


        }
    }
}
