package UtsPBO13486;
import java.util.ArrayList;
import java.util.Scanner;

// Class Mahasiswa sebagai Parent Class
class Mahasiswa 
{
    // Atribut
    String nim;
    String nama;
    int semester;
    int usia;
    String krs[];
    int[] nilai;

    // Constructor
    public Mahasiswa(String nim, String nama, int semester, int usia, String krs[],int[] nilai)
    {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs; 
        this.nilai = nilai;
    }

    public int[] getNilai() 
    {
        return nilai;
    }

    public void setNilai(int[] nilai) 
    {
        this.nilai = nilai;
    }

    // Method menghitung nilai rata - rata
    public float hitungRataNilai(int[] nilai)
    {
        int total = 0;
        for(int i = 0; i < nilai.length; i++)
        {
            total += nilai[i];
        }
        return(float) total/nilai.length;
    }

    // Method info Mahasiswa
    public void infoMahasiswa()
    {
        System.out.println("NIM Mahasiswa       = "+nim);
        System.out.println("Nama Mahasiswa      = "+nama);
        System.out.println("Semester Mahasiswa  = "+semester);
        System.out.println("Usia Mahasiswa      = "+usia);
    }

    // Method info KRS Mahasiswa
    public void infoKrsMahasiswa()
    {
        System.out.println("KRS : ");
        for(int i = 0; i < krs.length; i++)
        {
            System.out.println("- "+krs[i]);
        }
    }
}

// Subclass Mahasiswa Baru
class MahasiswaBaru extends Mahasiswa
{
    // Atribut
    String asalSekolah;

    // Constructor
    public MahasiswaBaru(String nim, String nama, int semester, int usia, String[] krs, int[] nilai, String asalSekolah)
    {
        super(nim, nama, semester, usia, krs, nilai);
        this.asalSekolah = asalSekolah;
    }

    // Method mengikuti ospek
    public boolean ikutOspek()
        {
            return true;
        }

    // Method info Mahasiswa
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asal Sekolah = "+asalSekolah);
    }
}

// Subclass Mahasiswa Transfer
class MahasiswaTransfer extends MahasiswaBaru
{
    // Atribut
    String asalUniversitas;

    // Constructor
    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, int[] nilai, String asalSekolah, String asalUniversitas)
    {
        super(nim, nama, semester, usia, krs, nilai, asalSekolah);
        this.asalUniversitas = asalUniversitas;
    }

    // Method mengikuti ospek
    public boolean ikutOspek()
    {
        return false;
    }
    
    // Method info Mahasiswa
    public void infoMahasiswa()
    {
        super.infoMahasiswa();
        System.out.println("Asal Universitas = "+asalUniversitas);
    }
}

// Subclass Mahasiswa Lulus
class MahasiswaLulus extends Mahasiswa
{
    // Atribut
    int tahunWisuda;
    float ipk;

    // Constructor
    public MahasiswaLulus(String nim, String nama, int semester, int usia, String[] krs, int[] nilai, int tahunWisuda, float ipk) 
    {
        super(nim, nama, semester, usia, krs, nilai);
        this.tahunWisuda = tahunWisuda;
        this.ipk = ipk;
    }

    // Method mengikuti Wisuda
    public boolean ikutWisuda() 
    {
        return true;
    }

    // Method info Mahasiswa
    public void infoMahasiswa() 
    {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda   = "+ tahunWisuda);
        System.out.println("IPK Mahasiswa  = "+ ipk);
    }
}

class MahasiswaAktif extends Mahasiswa
{
    int jumlahSPP;
    int jumlahPembayaran;
    int sisaSaldo;
    boolean lunas;

    public MahasiswaAktif(String nim, String nama, int semester, int usia, String[] krs, int[] nilai, int jumlahSPP, int jumlahPembayaran, int sisaSaldo, boolean lunas) 
    {
        super(nim, nama, semester, usia, krs, nilai);
        this.jumlahSPP = jumlahSPP;
        this.jumlahPembayaran = jumlahPembayaran;
        this.sisaSaldo = sisaSaldo;
    }



}

