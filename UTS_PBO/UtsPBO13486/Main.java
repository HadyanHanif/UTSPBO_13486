package UtsPBO13486;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int totalNilai;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        boolean isRunning = true;
        
        while (isRunning) 
        {
            System.out.println("\n Program Status Mahasiswa:");
            System.out.println("[1] Tambah Mahasiswa");
            System.out.println("[2] Lihat Daftar Mahasiswa");
            System.out.println("[3] Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (menu) 
            {
                case 1:
                    System.out.print("Jumlah mahasiswa yang akan diinput = ");
                    int jumlahMahasiswa = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < jumlahMahasiswa; i++) 
                    {
                        System.out.println("\nData Mahasiswa ke -" + (i+1));

                        System.out.print("NIM Mahasisawa       = ");
                        String nim = scanner.nextLine();

                        System.out.print("Nama Mahasiswa       = ");
                        String nama = scanner.nextLine();

                        System.out.print("Semester Mahasiswa   = ");
                        int semester = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Usia Mahasiswa       = ");
                        int usia = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jumlah Mata Kuliah   = ");
                        int jumlahMatkul = scanner.nextInt();
                        scanner.nextLine();

                        String[] krs = new String[jumlahMatkul];
                        int[] nilai = new int[jumlahMatkul];
                        for (int j = 0; j < jumlahMatkul; j++) 
                        {
                            
                            System.out.print("Mata kuliah " + (j+1) + " = ");
                            krs[j] = scanner.nextLine();

                            System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                            nilai[j] = scanner.nextInt();
                            scanner.nextLine();
                    
                        }

                        System.out.println("Pilih Golongan Mahasiswa ");
                        System.out.println("[1] Mahasiswa Baru");
                        System.out.println("[2] Mahasiswa Lulus");
                        System.out.println("[3] Mahasiswa Transfer");
                        System.out.println("[4] Mahasiswa Aktif");
                        int GolonganMahasiswa = scanner.nextInt();
                        scanner.nextLine();

                        if (GolonganMahasiswa == 1) {
                            System.out.print("Asal Sekolah Mahasiswa = ");
                            String asalSekolah = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaBaru(nim, nama, semester, usia, krs, null, asalSekolah));
                        } else if (GolonganMahasiswa == 2) {
                            System.out.print("Tahun Wisuda Mahasiswa = ");
                            int tahunWisuda = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("IPK Mahasiswa          = ");
                            float ipk = scanner.nextFloat();
                            scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaLulus(nim, nama, semester, usia, krs, null, tahunWisuda, ipk));
                        } else if (GolonganMahasiswa == 3) {
                            System.out.print("Asal Sekolah      = ");
                            String asalSekolah = scanner.nextLine();

                            System.out.print("Asal Universitas  = ");
                            String asalUniversitas = scanner.nextLine();

                            daftarMahasiswa.add(new MahasiswaTransfer(nim, nama, semester, usia, krs, null, asalSekolah, asalUniversitas));
                        }else if (GolonganMahasiswa == 4)
                        {
                            // Inputan status SPP Mahasiswa
                            System.out.print("Masukkan jumlah SPP Mahasiswa = ");
                            int jumlahSPP = scanner.nextInt();
                            System.out.print("Masukkan jumlah pembayaran    = ");
                            int jumlahPembayaran = scanner.nextInt();

                            // Menghitung sisa saldo dan memeriksa status pembayaran
                            int sisaSaldo = jumlahSPP - jumlahPembayaran;
                            boolean lunas = (sisaSaldo == 0);

                            System.out.println("Jumlah SPP Mahasiswa   = " + jumlahSPP);
                            System.out.println("Jumlah pembayaran      = " + jumlahPembayaran);
                            System.out.println("Sisa saldo Mahasiswa   = " + sisaSaldo);
                            
                            // Status SPP Mahasiswa lunas atau belum
                            if (lunas) 
                            {
                                System.out.println("Pembayaran sudah lunas.");
                            } else if (sisaSaldo < 0) {
                                System.out.println("Kelebihan pembayaran.");
                            } else {
                                System.out.println("Pembayaran belum lunas.");
                            }
    
                        } 
                        
                        else {
                            System.out.println("Tipe mahasiswa tidak valid.");
                        }
                    }
                    break;
                case 2:
                    // Output data mahasiswa
                    System.out.println("\nDaftar Mahasiswa = ");

                    for (Mahasiswa mhs : daftarMahasiswa) 
                    {
                        mhs.infoMahasiswa();
                        mhs.infoKrsMahasiswa();

                        int[] nilai = mhs.getNilai();
                        double rataRataNilai = 0.0;

                        System.out.print("Nilai: ");
                        for (int i = 0; i < nilai.length; i++) {
                        System.out.print(nilai[i] + " ");
                        rataRataNilai += nilai[i];
                      }

                      if (nilai.length > 0) 
                      {
                      rataRataNilai /= nilai.length;
                      }

                     System.out.println("\nRata-rata Nilai: " + rataRataNilai);

                     }
                    
                    break;

                case 3:
                    // Keluar dari program
                    isRunning = false;
                    break;

                    default:
                        System.out.println("Menu Tidak Ada Dalam Pilihan.");
                                }
                            }
                            
                            System.out.println("Terima kasih");
                        }
            }
                    