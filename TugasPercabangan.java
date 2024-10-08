import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji;
        

        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();c 

        /* Tuliskan proses perhitungan gaji di sini 
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

    total_gaji = (gaji_pokok + tambahan + uang_lembur)
    
    output ("Gaji total yang diterima adalah:  Rp" + total_gaji)

//end
        
        
        System.out.println(totalGaji);
    }
}
