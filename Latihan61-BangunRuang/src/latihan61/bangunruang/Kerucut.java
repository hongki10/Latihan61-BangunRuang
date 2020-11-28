/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan61.bangunruang;

/**
 * Nama  : M Hongki Alfikram
 * NIM   : 10119915
 * Kelas : IF-1OK
 */

public class Kerucut implements BangunRuang
{
    private int jariJari, tinggi;
    
    public Kerucut()
    {
        System.out.println("Kerucut");
    }

    public int getJariJari() 
    {
        return jariJari;
    }

    public void setJariJari(int jariJari) 
    {
        this.jariJari = jariJari;
    }

    public int getTinggi() 
    {
        return tinggi;
    }

    public void setTinggi(int tinggi) 
    {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() 
    {
        return (3.14 * jariJari * jariJari * tinggi) / 3;
    }
}
