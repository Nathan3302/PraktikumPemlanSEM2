package Bab5Inheritance.TugasPraktikum;
public class MahasiswaFIILKOM extends Manusia{
    private String nim;
    private double ipk;
    public MahasiswaFIILKOM(String nama, String nik, boolean isLakiLaki, boolean menikah, String nim, double ipk){
        super(nama,nik,isLakiLaki,menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    public String getNim(){
        return this.nim;
    }
    public double getIpk(){
        return this.ipk;
    }

    public double getBeasiswa(){
        if (3.0 <= this.ipk && this.ipk<=3.5){
            return 50;
        }
        else if(3.5<=this.ipk && this.ipk<=4.0){
            return 75;
        } else {
            return 0;
        }
    }

    public String getStatus(){
        String angkatan = "20" +this.nim.substring(0,2);
        int temp = Integer.parseInt(this.nim.substring(6,7));
        String prodi="";
        switch (temp){
            case 2:
                prodi = "Teknik Informatika";
                break;

            case 3:
                prodi = "Teknik Komputer";
                break;

            case 4:
                prodi = "Sistem Informasi";
                break;

            case 6:
                prodi="Pendidikan Teknologi Informasi";
                break;

            case 7:
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", "+angkatan;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan()+this.getBeasiswa();
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() +
                "\nNIK: "+ getNik()+
                "\nJenis Kelamin: "+super.getJenisKelamin()+
                "\nPendapatan: "+this.getPendapatan() +
                "\nNIM: "+getNim()
                +"\nIPK: "+getIpk()+
                "\nStatus: "+getStatus();
    }
}
