package matrices.conception;

import java.util.Scanner;

public class ReadingWritting {

    public int showDimension() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the matrix dimension");
        int dim = scanner.nextInt();


        return dim;
    }

    public int[][] createMatrix(int dimensiune)  {
        int[][] a = new int[dimensiune][dimensiune];
        if(dimensiune<=1){
            System.out.println("Eroare de creare");
            System.out.println("Terminating");
            System.exit(0);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the matrix elements");
        for (int i = 0; i < dimensiune; i++) {
            for (int j = 0; j < dimensiune; j++) {
                System.out.printf("Elementul [%d][%d] este ", i, j);
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }

    public void showMatrix(int[][] matrice) {
        System.out.println("Matricea introdusa este");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                System.out.print(matrice[i][j] + "  ");
            }
            System.out.println();
        }
    }



}
