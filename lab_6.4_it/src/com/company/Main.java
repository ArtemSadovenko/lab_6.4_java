package com.company;

import java.util.Scanner;

public class Main {

    public static void create(double a[], int n, int l, int h){
        for (int i = 0; i < n; i++) {
            a[i] = l + Math.random() * (h - l);
        }
    }

    public static int less_c(double a[], int n, double c) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < c) {
                j++;
            }
        }
        return j;
    }

    public static double sum(double a[], int n) {
        int j = -1;
        double s = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 0) {
                j = i + 1;
                break;
            }
        }
        for (int k = j; k < n; k++) {
            s += a[j];
        }
        return s;
    }

    public static void max_recover(double a[], int n) {
        double t;
        double a_max = a[0];
        int i_max = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > a_max) {
                a_max = a[i];
                i_max = i;
            }
        }
        t = a[0];
        a[0] = a[i_max];
        a[i_max] = t;
        for (int i = 1; i < n; i++) {
            if ((100 - 100 * (a[i] / a_max) <= 20) && (100 - 100 * (a[i] / a_max) >= 0)) {
                k++;
            }
        }

        System.out.println(k);
        for (int j = 1; j < n; j++) {
            for (int i = 1; i < n; i++) {
                if (a[j] / a_max >= 0.8) {
                    j++;
                }
                else if (a[j] / a_max < 0.8 && a[i] / a_max >= 0.8 && j <= k) {
                    t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                    j++;
                }
            }
        }

    }

    public static void print(double a[], int n) {
         System.out.print("| a |");
        for (int i = 0; i < n; i++) {
            //cout << setw(7) << setprecision(6) << a[i] << " |";
            System.out.printf("%1$+07.5f", a[i] );
            System.out.print("|");
        }
    }


    public static void main(String[] args) {


        int l = -10;
        int h = 10;
        int k;
        double s;

        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        double c = scan2.nextDouble();

        double[] a = new double[n];

        create(a, n, l, h);

        print(a, n);
        System.out.println();


        k = less_c(a, n, c);
        s = sum(a, n);

        max_recover(a, n);

        print(a, n);
        System.out.println();

        System.out.println("| s = " + s + " |");
        System.out.println("| k = " + k + " |");
    }
}
