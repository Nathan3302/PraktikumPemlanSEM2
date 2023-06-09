package Bab6ArrayList;

class Mahasiswa {
    private String nama;
    private String jurusan;
    private boolean status; // true=Menikah ; false=Lajang

    public Mahasiswa(){

    }
    public Mahasiswa(String nama, String jurusan, boolean status){
        this.nama=nama;
        this.jurusan=jurusan;
        this.status=status;
    }
    // Tambahkan constructor disini ...

    // Tambahkan method setter & getter disini ...

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public boolean getStatus(){
        return status;
    }
}