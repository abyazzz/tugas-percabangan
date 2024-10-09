import java.util.Scanner;

public class TugasPercabangan {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari user
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int masaKerja, totalJamKerja;
        double gajiPokok = 5000000, gajiAkhir, tambahanGaji = 0, uangLembur = 0;
        int jamKerjaPerHari = 8;  // Jam kerja normal per hari
        int jamKerjaPerMinggu = 40;  // Jam kerja normal per minggu
        int uangLemburPerJam = 50000;  // Uang lembur per jam

        // Input masa kerja dan jumlah jam kerja dari user
        System.out.print("Masukkan masa kerja (dalam tahun): ");
        masaKerja = scanner.nextInt();

        System.out.print("Masukkan total jam kerja dalam 1 bulan: ");
        totalJamKerja = scanner.nextInt();

        // Hitung tambahan gaji berdasarkan masa kerja
        if (masaKerja >= 5 && masaKerja <= 10) {
            tambahanGaji = 0.05 * gajiPokok;  // Tambahan 5% jika masa kerja antara 5-10 tahun
        } else if (masaKerja > 10) {
            tambahanGaji = 0.10 * gajiPokok;  // Tambahan 10% jika masa kerja di atas 10 tahun
        }

        // Hitung jumlah jam lembur dalam 1 bulan 
        int jamNormalSebulan = jamKerjaPerMinggu * 4;  // 40 jam kerja per minggu x 4 minggu
        int jamLembur = totalJamKerja - jamNormalSebulan;

        // Hitung uang lembur
        if (jamLembur > 0) {
            uangLembur = jamLembur * uangLemburPerJam;
        }

        // Hitung gaji akhir
        gajiAkhir = gajiPokok + tambahanGaji + uangLembur;

        // Tampilkan hasil perhitungan
        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Tambahan gaji: Rp " + tambahanGaji);
        System.out.println("Uang lembur: Rp " + uangLembur);
        System.out.println("Gaji total yang diterima: Rp " + gajiAkhir);
        
        scanner.close();
    }
}

//pseudocode

//deklarasi

    var masa_kerja, jumlah_jam_kerja, gaji_pokok, uang_lembur_per_jam, total_jam_kerja, uang_lembur, tambahan, total_gaji integer;
//algoritma

    int masa_kerja = (input)
    int jumlah_jam_kerja = (input)

    if gaji_pokok = (total_jam_kerja * jumlah_jam_kerja):
    endif 

    if uang_lembur = (total_jam_kerja * uang_lembur_per_jam)
    endif

    if masa_kerja = (< 5
            tambahan = 0)
    else if masa_kerja = (<= 10 then
            tambahan = gaji_pokok * 0.05)
    else masa_kerja = (>= 10 then 
            tambahan = gaji_pokok * 0.10)
    endif


    output ("gaji_pokok")
    output ("tambahan")
    output ("uang_lembur")
    output ("Gaji total yang diterima adalah:  Rp" + total_gaji)

//end



