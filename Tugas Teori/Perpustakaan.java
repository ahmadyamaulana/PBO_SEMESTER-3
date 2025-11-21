/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

/**
 *
 * @author Maullovers
 */
import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> daftarBuku = new ArrayList<>(); // Composition

    public Perpustakaan(String nama) {
        this.nama = nama;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpus() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Daftar Buku:");
        for (Buku b : daftarBuku) {
            b.infoBuku();
            System.out.println("----------------");
        }
    }
}
