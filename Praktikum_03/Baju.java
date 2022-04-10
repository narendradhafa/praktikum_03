package Praktikum_03;

import java.util.Scanner;

class MainBaju {
     static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Baju yang tersedia:");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print  ("Baju yang akan anda beli bertipe : ");
        String jenis = input.nextLine();
        System.out.print  ("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = input.nextInt();
        Baju baju = new Baju(jenis, jumlah);
        baju.display();

    }
}

public class Baju {
    String jenis;
    int harga;
    int jumlah;

    public Baju (String a, int b) {
        this.jenis = a;
        this.jumlah = b;
    }

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA() {
        if (jumlah >= 100) {
            this.harga = 95000;
        } else this.harga = bajuA;
    }
    void hargaB() {
        if (jumlah >= 100) {
            this.harga = 120000;
        } else this.harga = bajuB;
    }
    void hargaC() {
        if (jumlah >= 100) {
            this.harga = 160000;
        } else this.harga = bajuC;
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaA();
        else if (jenis.equalsIgnoreCase("b"))
            hargaB();
        else if (jenis.equalsIgnoreCase("c"))
            hargaC();
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total Harga          : " + harga * jumlah);
    }
}
