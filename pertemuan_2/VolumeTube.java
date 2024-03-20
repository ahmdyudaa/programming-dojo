import java.util.Scanner;

class VolumeTube{
    public static void main(String[] args){

        float pi = 3.14f;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        int r = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = input.nextInt();

        double volumeTube = pi * r * r * t;

        System.out.println("Volumen Tabung : " + volumeTube);
    }
}