package com.company;

import java.util.Scanner;

public class Main {
    static void plus() {
        int number, i = 1, result = 0, number2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        number2 = scan.nextInt();
        for (i = 1; i <= number2; i++) {
            System.out.print(+i + ". sayı:");
            number = scan.nextInt();
            result = result + number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        int number, number2, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        number2 = scan.nextInt();
        for (int i = 1; i <= number2; i++) {
            System.out.print(+i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
            } else {
                result = result - number;
            }
        }

        System.out.println("Sonuç: " + result);

    }

    static void times() {
        int number, number2, i = 1, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        number2 = scan.nextInt();
        while (i <= number2) {
            System.out.print(+i + ". sayı: ");
            number = scan.nextInt();
            i++;
            result = result * number;
        }
        System.out.println("Sonuç: " + result);

    }

    static void diveded() {
        int number, number2, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? :");
        number2 = scan.nextInt();
        for (int i = 1; i <= number2; i++) {
            System.out.print(+i + ". sayı: ");
            number = scan.nextInt();
            if (i != 1 && number == 0) {
                System.out.println("Hiçbir sayı sıfıra bölünemez.Lütfen yeniden deneyiniz.");
            }
            if (i == 1) {
                result = number;
            } else {
                result = result / number;
            }
        }
        System.out.println("Sonuç: " + result);

    }

    static void power() {
        int number, number2;
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        number = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = scan.nextInt();
        System.out.println("Sonuç: " + Math.pow(number, number2));

    }

    static void factorial() {
        int number, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = scan.nextInt();
        while (true) {
            if (number < 0) {
                result *= number;
                number++;
                if (number == -1) {
                    break;
                }
            } else {
                result *= number;
                number--;

                if (number == 1) {
                    break;
                }
            }
        }
        System.out.println(+result);
    }

    static void modding() {
        int number, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        number = scan.nextInt();
        result = number % 10;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        int n1, n2, cevre, alan;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dikdörtgenin ilk kenarını giriniz: ");
        n1 = scan.nextInt();
        System.out.print("Dikdörtgenin ikinci kenarını giriniz: ");
        n2 = scan.nextInt();
        cevre = (n1 + n2) * 2;
        alan = n1 * n2;
        System.out.println("Dikdörtgenin çevresi: " + cevre);
        System.out.println("Dikdörtgenin alanı: " + alan);

    }

    public static void main(String[] args) {
        int islem;
        String secim = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(secim);
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
        islem = input.nextInt();
        switch (islem) {
            case 1:
                plus();
                break;
            case 2:
                minus();
                break;
            case 3:
                times();
                break;
            case 4:
                diveded();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                modding();
                break;
            case 8:
                rectangle();
                break;
            case 0:
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
