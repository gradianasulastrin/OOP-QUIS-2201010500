package karyawan;

public class KaryawanApp {
    public static void main(String[] args) {
        // Membuat objek karyawan dan manajer
        Karyawan karyawan1 = new Karyawan("Budi", 5000000);
        Manajer manajer1 = new Manajer("Susi", 10000000, 2000000);

        // Menampilkan informasi karyawan dan manajer
        System.out.println(karyawan1.getInfo());
        System.out.println(manajer1.getInfo());
        
        // Demonstrasi polymorphism
        Karyawan karyawan2 = new Manajer("Andi", 8000000, 3000000);
        System.out.println(karyawan2.getInfo());
    }
}

// Encapsulation menggunakan private access modifier
class Karyawan {
    private final String nama;
    private final double gaji;

    public Karyawan(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    // Getter untuk mengakses variabel private
    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    // Method yang akan di-overridden oleh subclass
    public String getInfo() {
        return "Nama: " + nama + ", Gaji: " + gaji;
    }
}

// Inheritance: Manajer adalah subclass dari Karyawan
class Manajer extends Karyawan {
    private final double bonus;

    public Manajer(String nama, double gaji, double bonus) {
        super(nama, gaji); // Memanggil constructor superclass
        this.bonus = bonus;
    }

    // Overriding method getInfo untuk Manajer
    @Override
    public String getInfo() {
        return "Nama: " + getNama() + ", Gaji: " + getGaji() + ", Bonus: " + bonus;
    }
}
