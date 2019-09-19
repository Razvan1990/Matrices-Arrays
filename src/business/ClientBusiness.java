package business;

import arrays.arrayOptions.ArrayClientOptions;
import matrices.functionality.MatrixClientOptions;

import java.util.Scanner;

public class ClientBusiness {

    public void businessOptions() {

        ArrayClientOptions arrayClientOptions = new ArrayClientOptions();
        MatrixClientOptions matrixClientOptions = new MatrixClientOptions();

        boolean choose = true;
        while (choose) {
            System.out.println("Please choose the type of data");
            System.out.println("1.Arrays");
            System.out.println("2.Matrices");
            System.out.println("3.Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    arrayClientOptions.arrayOptions();
                    break;
                case 2:
                    matrixClientOptions.chooseOptions();
                    break;
                case 3:
                    choose = false;
                    break;
                default:
                    System.out.println("No valid option");
                    break;
            }


        }

    }
}
