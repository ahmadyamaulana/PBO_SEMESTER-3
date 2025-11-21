/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

/**
 *
 * @author Maullovers
 */
public class main {
    public static void main(String[] args) {

        Pengarang p1 = new Pengarang("Tere Liye", "Indonesia");
        Pengarang p2 = new Pengarang("J.K. Rowling", "Inggris");

        Buku b1 = new Buku("Bumi", p1);
        Buku b2 = new Buku("Harry Potter", p2);

        Perpustakaan perpus = new Perpustakaan("Perpus Kota");

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);

        perpus.infoPerpus();
    }
}
