package arrays.method;

import java.util.*;

public class ArrayMethods {

    public void minimMaxim(int[] array) {
        List<Integer> MinMax = new ArrayList();
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        MinMax.add(max);
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        MinMax.add(min);
        System.out.println("---------------------------------");
        System.out.println("Maximul si minimul sunt");
        for (int i : MinMax) {
            System.out.print(i + " ");
        }

    }

    public int secondMinOneTraverse(int[] array) {
        int min = array[0];
        int min2 = array[0];

        if (array.length == 2 && array[0] == array[1]) {
            System.out.println("Elementele sunt egale");
            return min2;
        }

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min2 = min;
                min = array[i];

            } else if (min2 >= array[i] && min2 != min) {
                min2 = array[i];
            }

        }
        System.out.println("Al doilea element minim este ");
        return min2;
    }


    public void secondLargestAndsecondSmallestBigComplexity(int[] array) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }

        System.out.print("Maximul si minimul al doilea sunt ");
        myList.add(0, array[array.length - 2]);
        myList.add(1, array[1]);

        for (int j : myList) {
            System.out.print(j + " ");
        }

    }

    public int secondMaxOneTraverse(int[] array) {
        int max = array[0];
        int max2 = array[0];

        if (array.length == 2 && array[0] == array[1]) {
            System.out.println("Elementele sunt egale");
            return max2;
        }

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max2 = max;
                max = array[i];

            } else if (max2 < array[i] && max2 != max) {
                max2 = array[i];
            } else {
                max2 = array[array.length - 2];
            }

        }
        System.out.println("Al doilea element maxim metoda mai eficace");
        return max2;
    }

    public void arrayBackwards(int[] array) {
//primul element este practic v[0] si ultimul este v[n-1]
        int first = 0;
        int last = array.length - 1;

        for (int i : array) {

            while (first < last) {
                int temp = array[first];
                array[first] = array[last];
                array[last] = temp;
                first++;
                last--;
            }
        }
        System.out.println();
        System.out.println("Vectorul inversat este");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void frequencyOfElements(int[] array) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer value = array[i];
            if (myMap.containsKey(value)) {
                myMap.put(array[i], myMap.get(array[i]) + 1);
            } else {
                myMap.put(array[i], 1);
            }
        }
        for (int i : myMap.keySet()) {
            System.out.println("Elementul " + i + " a aparut de " + myMap.get(i) + " ori");
        }

    }

    public int maxDimension(int a, int b) {
        int max = (int) Math.abs(b - a);
        return max;
    }

    public int largestDifference(int[] array) {
        int max = maxDimension(array[1], array[0]);
        for (int i = 1; i < array.length - 1; i++) {
            if (max < maxDimension(array[i + 1], array[i])) {
                max = maxDimension(array[i + 1], array[i]);
            }
        }
        System.out.println("Diferenta maxima intre elemente este");
        return max;
    }

    public int smallestDifference(int[] array) {
        int min = maxDimension(array[1], array[0]);
        for (int i = 0; i < array.length - 1; i++) {
            if (min > maxDimension(array[i + 1], array[i])) {
                min = maxDimension(array[i + 1], array[i]);
            }
        }
        System.out.println("Diferenta minima intre elemente este");
        return min;
    }


    public void deleteDuplicates(int[] array) {

        List<Integer> myList = new ArrayList<>();

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer value = array[i];
            if (hashMap.containsKey(value)) {
                hashMap.put(array[i], hashMap.get(array[i]) + 1);
            } else {
                hashMap.put(array[i], 1);
            }
        }

        for(int i:hashMap.keySet()){
            if(hashMap.get(i)==1){
                myList.add(i);
            }
        }

                //converting back to Array->necesita sa fie de tip Wrapper class


        Integer[] myArray = new Integer[myList.size()];
        myArray = myList.toArray(myArray);

        System.out.println("Vectorul fara duplicate este ");
        for (int i : myArray) {
            System.out.print(i + " ");
        }
    }


}

