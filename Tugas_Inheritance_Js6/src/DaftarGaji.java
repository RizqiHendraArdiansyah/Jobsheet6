public class DaftarGaji {
    private Pegawai[] listPegawai;

    public DaftarGaji(int Totalgaji){
        listPegawai = new Pegawai[Totalgaji];
    }
    public void addPegawai(Pegawai pegawai){
       for(int i = 0; i < listPegawai.length; i++){
            if(listPegawai[i] == null){
                this.listPegawai[i] = pegawai;
                break;
            }
       }
    }
    public void printSemuaGaji(){
        for(int i = 0; i < listPegawai.length; i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("           DAFTAR NAMA GAJI PEGAWAI              ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Nama Pegawai        :" + listPegawai[i].getNama());
            System.out.println("NIP Pegawai         : " + listPegawai[i].nip);
            System.out.println("Alamat Pegawai      : " + listPegawai[i].alamat);
            System.out.println("Total Gaji Pegawai  : " + listPegawai[i].getGaji());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            
        }
    }
}
