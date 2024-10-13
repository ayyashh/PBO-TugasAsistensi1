import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory tokoPC = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=============== Menu ===============");
            System.out.println("1. Melihat semua Item");
            System.out.println("2. Menambahkan Item Baru");
            System.out.println("3. Menghapus Item");
            System.out.println("4. Keluar");

            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tokoPC.melihatItem();
                    break;

                case "2":
                    System.out.println("Masukkan nama item: ");
                    String tambahItem = scanner.nextLine();
                    System.out.println("Masukkan jumlah item: ");
                    String jumlah = scanner.nextLine();
                    tokoPC.menambahItem(tambahItem, Integer.parseInt(jumlah));
                    break;

                case "3":
                    System.out.println("Masukkan nama item yang ingin dihapus: ");
                    String hapusItem = scanner.nextLine();
                    tokoPC.menghapusItem(hapusItem);
                    break;

                case "4":
                    System.out.println("Keluar dari program.");
                    return;

                default:
                    System.out.println("\nAnda memasukkan pilihan yang salah.");
            }
        }
    }
}
