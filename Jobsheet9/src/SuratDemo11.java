import java.util.Scanner;
public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5);
        int pilih;
        
        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();   
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat11 srt = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    break;

                case 2:
                    Surat11 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari: " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.println("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;
                case 0:
                    System.out.println("Keluar");
                break;

                default:
                    System.out.println("Pilihan tidak valid.");
                }

            } while (pilih != 0);
           
    }
}
