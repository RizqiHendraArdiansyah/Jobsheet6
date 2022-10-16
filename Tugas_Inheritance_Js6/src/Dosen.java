public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat, int TARIF_SKS){
        super(nip, nama, alamat);
        this.TARIF_SKS = TARIF_SKS;
    }
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getGaji(){
        return jumlahSKS*TARIF_SKS;
    }
}
