package baekjoon.level4;

import java.util.Scanner;

public class _10871 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            if (num<x) {
                System.out.print(num+" ");
            }
        }
    }
}
