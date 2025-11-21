/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasteori;

/**
 *
 * @author Maullovers
 */
public class Pengarang {
    private String nama;
    private String negara;

    public Pengarang(String nama, String negara) {
        this.nama = nama;
        this.negara = negara;
    }

    public void infoPengarang() {
        System.out.println("Pengarang: " + nama + " (" + negara + ")");
    }
}
