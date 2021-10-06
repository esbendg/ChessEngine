package com.company;

public class Main {

    public static void main(String[] args) {
        int i;
        int j;
        int spot = 0;
        int[][] arr = new int[8][8];

        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                spot=spot+1;
                arr[i][j]=spot;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
