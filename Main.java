package com.konversiSuhu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String suhuAwal, suhuKonversi;
        double jmlSuhu, hasil;



            System.out.println("=========================================");
            System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI SUHU");
            System.out.println("=========================================");

            System.out.println(" ");

            System.out.print("Untuk satuan suhunya adalah berikut : \n1.Celcius\n2.Kelvin\n3.Fahrenheit\n4.Reamur\n");

            System.out.println(" ");

            System.out.print("Silahkan Masukan Nama Suhu awal =");
            suhuAwal = inputUser.nextLine().toUpperCase();
            System.out.print("Silahkan Masukan Nama Suhu Yang ingin di konversikan =");
            suhuKonversi = inputUser.nextLine().toUpperCase();
            System.out.print("Silahkan Masukan jumlah suhunya =");
            jmlSuhu = inputUser.nextDouble();


            if (suhuAwal.equals("CELCIUS")) {
                if (suhuKonversi.equals("KELVIN")) {
                    hasil = celciusKelvin(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("FAHRENHEIT")) {
                    hasil = celciusFahrenheit(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("REAMUR")) {
                    hasil = celciusReamur(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else {
                    System.out.println("Anda Salah Memasukan nama Suhu Konversi");
                }
            } else if (suhuAwal.equals("KELVIN")) {
                if (suhuKonversi.equals("CELCIUS")) {
                    hasil = kelvinCelcius(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("FAHRENHEIT")) {
                    hasil = kelvinFahrenheit(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("REAMUR")) {
                    hasil = kelvinReamur(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else {
                    System.out.println("Anda Salah Memasukan nama Suhu Konversi");
                }
            } else if (suhuAwal.equals("FAHRENHEIT")) {
                if (suhuKonversi.equals("CELCIUS")) {
                    hasil = fahrenheitCelcius(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("KELVIN")) {
                    hasil = fahrenheitKelvin(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("REAMUR")) {
                    hasil = fahrenheitReamur(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else {
                    System.out.println("Anda Salah Memasukan nama Suhu Konversi");
                }
            } else if (suhuAwal.equals("REAMUR")) {
                if (suhuKonversi.equals("CELCIUS")) {
                    hasil = reamurCelcius(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("KELVIN")) {
                    hasil = reamurKelvin(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else if (suhuKonversi.equals("FAHRENHEIT")) {
                    hasil = reamurFahrenheit(jmlSuhu);
                    System.out.println("Hasil Konversi dari " + suhuAwal + " Ke" + suhuKonversi + " Adalah = " + hasil + suhuKonversi);
                } else {
                    System.out.println("Anda Salah Memasukan nama Suhu Konversi");
                }
            } else {
                System.out.println("Anda Salah Memasukan nama suhu awal");
            }







    }





    //function untuk celcius
    static double celciusKelvin(double c){
        return c + 273.15;
    }

    static double celciusFahrenheit(double c){
        return c * 1.8 + 32;
    }

    static double celciusReamur(double c){
        return c * 0.8;
    }

    // function untuk kelvin

    static double kelvinCelcius(double k){
        return  k - 273.15;
    }

    static double kelvinFahrenheit(double k){
        return k * 1.8 - 459.67;
    }

    static  double kelvinReamur(double k){
        return (k - 273.15) * 0.8;
    }

    // function untuk fahrenheit

    static double fahrenheitKelvin(double f){
        return (f + 459.67) / 1.8;
    }

    static  double fahrenheitCelcius(double f){
        return (f - 32) / 1.8;
    }

    static  double fahrenheitReamur(double f){
        return (f - 32) / 2.25;
    }

    //function untuk reamur

    static double reamurKelvin(double r){
        return r / 0.8 + 273.15;
    }

    static  double reamurCelcius(double r){
        return r / 0.8;
    }

    static double reamurFahrenheit(double r){
        return r * 2.25 + 32;
    }
}
