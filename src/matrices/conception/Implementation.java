package matrices.conception;

import java.util.ArrayList;
import java.util.List;

public class Implementation {
    ReadingWritting readingWritting;

    public Implementation() {
        readingWritting = new ReadingWritting();
    }
/**
maxim
 **/
    public List<Integer> maxAndPosMaxMatrix(int matrix[][]) {
        List<Integer> maxims = new ArrayList<>();
        int max = matrix[0][0];
        int posLinie = 0;
        int posColoana = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    posLinie = i;
                    posColoana = j;
                }
            }
        }
        maxims.add(max);
        maxims.add(posLinie);
        maxims.add(posColoana);
        System.out.println("Elementul maxim este " + max + " si se afla pe pozitia" + "[" + posLinie + "]" + "" + "[" + posColoana + "]");
        return maxims;
    }

    /**
     minim
     **/
    public List<Integer> minAndPosMinMatrix(int matrix[][]) {
        List<Integer> minims = new ArrayList<>();
        int min = matrix[0][0];
        int linMin = 0;
        int colMin = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    linMin = i;
                    colMin = j;

                }
            }
        }
        minims.add(min);
        minims.add(linMin);
        minims.add(colMin);
        System.out.println("Elementul minim este " + min + " si se afla pe pozitia " + "[" + linMin + "]" + "" + "[" + colMin + "]");
        return minims;
    }

    /**
     * switch
     **/
    public void switchMinMax(int matrix[][]) {

        List<Integer> a = maxAndPosMaxMatrix(matrix);
        List<Integer> b = minAndPosMinMatrix(matrix);

        int a0 = a.get(0);
        int a1 = a.get(1);
        int a2 = a.get(2);

        int b0 = b.get(0);
        int b1 = b.get(1);
        int b2 = b.get(2);


        if (matrix[a1][a2] != matrix[b1][b2]) {
            matrix[a1][a2] = matrix[a1][a2] + matrix[b1][b2];
            matrix[b1][b2] = matrix[a1][a2] - matrix[b1][b2];
            matrix[a1][a2] = matrix[a1][a2] - matrix[b1][b2];
        }
        System.out.println("Noua matrice este");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


    }

    /**
     *conversion to vector
     * sorted array
     * **/
    public int[] matrixToVector(int matrix[][]) {
        int[] v = new int[matrix.length * matrix.length];
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                v[k] = matrix[i][j];
                k++;
            }
        }

        for (int x = 0; x < v.length; x++) {
            System.out.print(v[x] + " ");
        }
        return v;
    }

    public void sortedArray(int[][] matrix) {
        System.out.println("Vector original");
        int[] newArray = matrixToVector(matrix);

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[i] < newArray[j]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("Vectorul ordonat este ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
    }

    /**
     Sum and elements main Diagonal
     */
    public List<Integer> SumAndElementsMainDiagonal(int[][] matrix) {
        int suma = 0;
        List<Integer> main = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    suma += matrix[i][j];
                    main.add(matrix[i][j]);
                }
            }
        }
        main.add(suma);
        System.out.println("Elementele si suma de pe diag principala sunt");
        return main;
    }

    /**
     * Product and Elements Second Diagonal
     * **/


    public List<Integer> ProductAndElementsSecondDiagonal(int[][] matrix) {
        int product = 1;
        List<Integer> second = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j == matrix.length - 1) {
                    product *= matrix[i][j];
                    second.add(matrix[i][j]);
                }
            }
        }
        second.add(product);
        System.out.println("Elementele si produsul de pe diag secundara sunt");
        return second;
    }

    /**
     * power/product

     */
    public List<Integer> PowerperProductAndElementsAboveMainDiag(int[][] matrix) {
        int power = 0;int power2 =0;
        int produs = 1;
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < j) {
                    powers.add(matrix[i][j]);
                    produs *= matrix[i][j];
                }

            }
        }
        for (int i = 0; i < powers.size() - 1; i++) {
            power = (int) Math.pow(powers.get(i), powers.get(i + 1)) / produs;
            powers.add(power);
            break;

        }
        for (int i = 0; i < powers.size() - 1; i++) {
            power2 = (int) Math.pow(powers.get(i), powers.get(i + 1)) / produs;
        }
        powers.add(power2);

        System.out.println("Elementele si puterea totala/produs a elementelor de deasupra diag principale sunt");
        return powers;
    }

    /**
     OrBitsElementsUnderSecondaryDiag
     */
    public List<Integer> OrBitsAndElementsUnderSecondaryDiag(int[][] matrix) {
        int bits=0;int bits2=0;
        List<Integer> divides = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i + j >= matrix.length) {
                    divides.add(matrix[i][j]);
                }

            }
        }
        for(int i =0;i<divides.size()-1;i++){
            bits = divides.get(i)|divides.get(i+1);
            divides.add(bits);
            break;
        }
        for(int i =0;i<divides.size()-1;i++) {
            bits2 = divides.get(i) | divides.get(i + 1);
        }
        divides.add(bits2);

        return divides;

    }
    public void productElementElementfrom2Matrices(int [][] matrice){
        System.out.println("Introduce second matrix");
        int [][] matrix2 = readingWritting.createMatrix(matrice.length);
        readingWritting.showMatrix(matrix2);
        int [][] matrix3 = new int [matrice.length][matrice.length];

        for(int i =0;i<matrice.length;i++){
            for(int j =0;j<matrice.length;j++){
                matrix3[i][j] = matrice[i][j]*matrix2[i][j];
            }
        }
        System.out.println("Resulting matrix\n");
      readingWritting.showMatrix(matrix3);
    }
}