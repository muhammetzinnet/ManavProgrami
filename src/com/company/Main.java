package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Manav kasa hesaplama");
        System.out.println("**********************************");
        System.out.println("Manavda bulunan meyve ve sebze fiyatları = "+
                "\nArmut = 2.14 TL"+
                "\nElma = 3.67 TL"+
                "\nDomates = 1.11 TL"+
                "\nMuz = 0.95 TL"+
                "Patlıcan = 5.00 TL");
        System.out.println("**********************************");

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double elmaKg,armutKg,domatesKg,muzKg,patlicanKg, toplamTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut kaç kg = ");
        armutKg = scanner.nextDouble();
        System.out.print("Elma kaç kg = ");
        elmaKg = scanner.nextDouble();
        System.out.print("Domates kaç kg = ");
        domatesKg = scanner.nextDouble();
        System.out.print("Muz kaç kg = ");
        muzKg = scanner.nextDouble();
        System.out.print("Patlıcan kaç kg = ");
        patlicanKg = scanner.nextDouble();

        toplamTutar = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.println("Alış veriş toplamı = "+toplamTutar);
    }
}
