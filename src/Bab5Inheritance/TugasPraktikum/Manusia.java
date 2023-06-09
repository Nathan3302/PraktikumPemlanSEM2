package Bab5Inheritance.TugasPraktikum;
public class Manusia {
    private String nama, nik;
    private boolean jenisKelamin, menikah;

    public Manusia(String nama, String nik, boolean isLakiLaki, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin=isLakiLaki;
        this.menikah=menikah;
    }


    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setJenisKelamin(boolean isLakiLaki){
        this.jenisKelamin = isLakiLaki;
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public String getNama(){
        return this.nama;
    }
    public String getNik(){
        return this.nik;
    }
    public String getJenisKelamin(){
        String kelamin;
        if(this.jenisKelamin){
            kelamin = "L";
        }
        else {
            kelamin = "P";
        }
        return kelamin;
    }
    public boolean getMenikah(){
        return this.menikah;
    }
    public double getTunjagan(){
        if(menikah){
            if (jenisKelamin){
                return 25;
            }
            else{
                return 20;
            }
        }
        else {
            return 15;
        }
    }

    public double getPendapatan(){
        return getTunjagan();
    }

    public String toString(){
        return "Nama: " + this.nama +
                "\nNIK: "+ this.nik+
                "\nJenis Kelamin: "+getJenisKelamin()+
                "\nPendapatan: "+getPendapatan();
    }
}
