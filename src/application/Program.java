package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("How many values ?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
          ps.addValue(sc.nextInt());
        }

        ps.print();

        System.out.println();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
