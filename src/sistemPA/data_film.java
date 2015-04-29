/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanantiket;

import java.sql.ResultSet;

public class data_film {
    private String judul;
    private int nTiket;
    
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public int getnTiket() {
        return nTiket;
    }
    public void setnTiket(int nTiket) {
        this.nTiket = nTiket;
    }
    
    public void simpandata_film(){
        Database db = new Database();
        String ambil_film = "insert into film values ('"
                +this.judul+ "')";
        db.query(ambil_film);
    }
    
    public ResultSet getfilm(){
        ResultSet res = null;
        Database db = new Database();
        String ambilres = "insert into film values ('"
                +this.judul+ "')";
        db.query(ambilres);
        return res;
    }
    
}
