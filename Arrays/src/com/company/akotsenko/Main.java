package com.company.akotsenko;

public class Main {

    public static void main(String[] args) {
        ////////////////////////////////
        int[] i = new int[5];

        for(int k = 0; k < 5; k++){
            System.out.println(i[k]);
        }

        i[0] = 10;
        i[4] = 8;

        for(int k = 0; k < 5; k++){
            System.out.println(i[k]);
        }
        ///////////////////////////////


        ////////////////////////////////
        int[][] mass = new int[3][5];
        mass[0] = i;

        for(int a = 0; a < mass.length; a++) {
            System.out.println();
            for(int b = 0; b < mass[a].length; b++){
                System.out.print(mass[a][b] + " ");
            }
        }
        //////////////////////////////////


        //////////////////////////////
        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for(int k = 0; k < test.length; k++){
            System.out.println(test[k]);
        }

        printArray(test);
        ////////////////////////////////


        int[][] test2 = { {1,2}, {3,4}, {5,6} };

    }

    static void printArray(int[] i){

        System.out.println("Print array: ");
        for(int k = 0; k < i.length; k++){
            System.out.println(i[k]);
        }
    }
}
