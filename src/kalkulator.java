import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        fitur();
    }

    public static void fitur() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("----------------");
        System.out.println("Menu");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volume");
        System.out.println("0. Tutup Aplikasi");
        System.out.println("----------------");
        int fitur = input.nextInt();
        if (fitur == 1) {
            LuasBidang();
        } else if (fitur == 2) {
            Volume();
        } else if (fitur == 0){
            input.close();
        } else {
            System.out.println("!! Input Error. Pilih Lagi !!");
            fitur();
        }
    }

    public static void LuasBidang() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("----------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke menu sebelumnya");
        System.out.println("----------------");
        int bidang = input.nextInt();

        switch (bidang) {
            case 1 :
                Persegi();
                break;
            case 2 :
                Lingkaran();
                break;
            case 3 :
                Segitiga();
                break;
            case 4 :
                PersegiPanjang();
                break;
            case 0 :
                fitur();
                break;
            default:
                System.out.println("!! Input Error. Pilih Lagi !!");
                LuasBidang();
                break;
        }
    }

    public static void Persegi() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih persegi");
        System.out.println("----------------");
        System.out.println("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        int lebar = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari persegi adalah " + panjang*lebar);
        backToMain();
    }

    public static void Lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih lingkaran");
        System.out.println("----------------");
        System.out.println("Masukkan Jari-jari: ");
        int jarijari = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari lingkaran adalah " + 3.14*Math.cbrt(jarijari));
        backToMain();
    }

    public static void Segitiga() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih segitiga");
        System.out.println("----------------");
        System.out.println("Masukkan alas: ");
        int alas = input.nextInt();
        System.out.println("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari lingkaran adalah " + alas*tinggi);
        backToMain();
    }

    public static void PersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih persegi panjang");
        System.out.println("----------------");
        System.out.println("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        int lebar = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari persegi panjang adalah " + panjang*lebar);
        backToMain();
    }
    public static void Volume() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Pilih bidang yang akan dihitung");
        System.out.println("----------------");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali ke menu sebelumnya");
        System.out.println("----------------");
        int bidang = input.nextInt();

        switch (bidang) {
            case 1 :
                Kubus();
                break;
            case 2 :
                Balok();
                break;
            case 3 :
                Tabung();
                break;
            case 0 :
                fitur();
                break;
            default:
                System.out.println("Pilih lagi");
                Volume();
                break;
        }
    }

    public static void Kubus() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih kubus");
        System.out.println("----------------");
        System.out.println("Masukkan Sisi: ");
        int sisi = input.nextInt();
        int pangkat = 3;
        System.out.println("Processing..");
        System.out.println("Luas dari persegi panjang adalah " + Math.pow(sisi, pangkat));
        backToMain();
    }

    public static void Balok() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih balok");
        System.out.println("----------------");
        System.out.println("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        int lebar = input.nextInt();
        System.out.println("Masukkan Tinggi: ");
        int tinggi = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari persegi panjang adalah " + panjang*lebar*tinggi);
        backToMain();
    }

    public static void Tabung() {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Anda memilih tabung");
        System.out.println("----------------");
        System.out.println("Masukkan Jari-jari: ");
        int jarijari = input.nextInt();
        System.out.println("Masukkan Tinggi: ");
        int tinggi = input.nextInt();
        System.out.println("Processing..");
        System.out.println("Luas dari persegi panjang adalah " + 3.14*tinggi*Math.cbrt(jarijari));
        backToMain();
    }

    public static void backToMain() {
        Scanner input = new Scanner(System.in);
        System.out.println("input apa saja untuk kembali ke menu utama");
        // diajarin Husni pakai input.next()
        input.next();
        fitur();
    }

}
