// Tugas laporan resmi

public class DemoOutput {
    public static void main(String[] args) {

        // ============================================================
        // print() - mencetak teks tanpa pindah baris di akhir
        // ============================================================
        System.out.print("Halo ");
        System.out.print("saya ");
        System.out.print("Java");
        System.out.print("\n"); // harus tambah \n sendiri kalau mau ganti baris

        // ============================================================
        // println() - mencetak teks lalu otomatis pindah baris
        // ============================================================
        System.out.println("Baris pertama");
        System.out.println("Baris kedua");
        System.out.println("Baris ketiga");

        // ============================================================
        // printf() - mencetak dengan format tertentu (seperti C)
        // Tidak otomatis pindah baris, harus pakai \n jika perlu
        // ============================================================
        String nama = "Budi";
        int umur = 20;
        double ipk = 3.75;

        System.out.printf("Nama  : %s\n", nama);
        System.out.printf("Umur  : %d tahun\n", umur);
        System.out.printf("IPK   : %.2f\n", ipk); // 2 angka desimal

        // Perbandingan langsung
        System.out.println("\n--- Perbandingan ---");
        System.out.print("print: tidak ada newline otomatis | ");
        System.out.println("println: ada newline otomatis");
        System.out.printf("printf: bisa format, nilai pi = %.4f%n", Math.PI);
    }
}
