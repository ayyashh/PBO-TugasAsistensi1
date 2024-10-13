import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> itemMap;
    private int totalItem;

    public Inventory() {
        itemMap = new HashMap<>();
        totalItem = 0;
    }

    public void melihatItem() {
        if (itemMap.isEmpty()) {
            System.out.println("Inventory kosong.");
        }
        else {
            System.out.println("Daftar item di inventory:");
            for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        System.out.println("Total Item di Inventory: " + totalItem);
    }

    public void menambahItem(String namaItem, int jumlah) {
        if(itemMap.containsKey(namaItem)) {
            int currentItem = itemMap.get(namaItem);
            itemMap.put(namaItem, currentItem + jumlah);
        } else {
            itemMap.put(namaItem, jumlah);
        }
        totalItem += jumlah;
        System.out.println(jumlah + " " + namaItem + " berhasil ditambhakan.");
    }

    public void menghapusItem(String namaItem) {
        if(itemMap.containsKey(namaItem)) {
            int currentItem = itemMap.get(namaItem);
            totalItem -= currentItem;
            itemMap.remove(namaItem);
            System.out.println(namaItem + " Nama item berhasil dihapus");
        } else {
            System.out.println("Tidak ditemukan di dalam inventory");
        }
    }

    public int getTotalItem() {
        return totalItem;

    }
}
