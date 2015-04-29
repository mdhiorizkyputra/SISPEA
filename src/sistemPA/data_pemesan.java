package pemesanantiket;
import java.sql.ResultSet;
public class data_pemesan extends Database{
    private String noktp;
    private String nama_pemesan;
    private String email_pemesan;
    private String gender;
    private String notelp_pemesan;
    private String tanggal;
    private String judulfilm;
    private String tayang;

    
    public data_pemesan(){}
    public String getNoktp() {
        return noktp;
    }
    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }
    public String getNama_pemesan() {
        return nama_pemesan;
    }
    public void setNama_pemesan(String nama_pemesan) {
        this.nama_pemesan = nama_pemesan;
    }
    public String getEmail_pemesan() {
        return email_pemesan;
    }
    public void setEmail_pemesan(String email_pemesan) {
        this.email_pemesan = email_pemesan;
    }
    public String getNotelp_pemesan() {
        return notelp_pemesan;
    }
    public void setNotelp_pemesan(String notelp_pemesan) {
        this.notelp_pemesan = notelp_pemesan;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getJudulfilm() {
        return judulfilm;
    }
    public void setJudulfilm(String judulfilm) {
        this.judulfilm = judulfilm;
    }
    public String getTayang() {
        return tayang;
    }
    public void setTayang(String tayang) {
        this.tayang = tayang;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
    public void simpandata_pemesan(){
        Database db = new Database();
        String ambil_pemesan = "insert into pemesan values ('"
                +this.noktp+ "','"
                +this.nama_pemesan+ "','"
                +this.email_pemesan+ "','"
                +this.gender+ "','"
                +this.notelp_pemesan+ "')";
        db.query(ambil_pemesan);
        
        
    }
    public ResultSet getPemesanan(){
        ResultSet res = null;
        Database db = new Database();
        String ambilres = "insert into pemesan values ('"
                +this.noktp+ "','"
                +this.nama_pemesan+ "','"
                +this.email_pemesan+ "','"
                +this.gender+ "','"
                +this.notelp_pemesan+ "')";
        db.query(ambilres);
        return res;
    }
    
    
    
}
