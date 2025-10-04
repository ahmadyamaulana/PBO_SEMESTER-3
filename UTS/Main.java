/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author Maullovers
 */
public class Main {
    public static void main(String[] args) {
        Produk barang1 = new Elektronik("Ipone", 10000000, 2);
        Produk barang2 = new Makanan("RotiO", 20000, "2024-02-29");

        Pegawai member1 = new PegawaiTetap("Ahmada", 5000000, 1000000);
        Pegawai member2 = new PegawaiKontrak("udin", 4000000, 6);

        System.out.println("Output Produk");
        barang1.tampilkanInfo();
        System.out.println();
        barang2.tampilkanInfo();

        System.out.println("\nOutput Pegawai");
        member1.tampilkanInfo();
        System.out.println();
        member2.tampilkanInfo();
    }
}

