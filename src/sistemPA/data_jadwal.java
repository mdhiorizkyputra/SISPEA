/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanantiket;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Locale;
//import java.util.Date;

public class data_jadwal {
    private String jam;
    private String tanggal;

    
    public String getJam() {
        return jam;
    }
    public void setJam(String jam) {
        this.jam = jam;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setJadwal(String jadwal) {
        this.tanggal = jadwal;
    }
    
    public void simpandata_jadwal(){
        Database db = new Database();
        String ambil_jadwal = "insert into jadwal values ('"
                +this.jam+ "','"
                +this.tanggal+ "')";
        db.query(ambil_jadwal);
    }
    
    public ResultSet getJadwal(){
        ResultSet res = null;
        Database db = new Database();
        String ambilres = "insert into jadwal values ('"
                +this.jam+ "','"
                +this.tanggal+ "')";
        db.query(ambilres);
        return res;
    }
}
