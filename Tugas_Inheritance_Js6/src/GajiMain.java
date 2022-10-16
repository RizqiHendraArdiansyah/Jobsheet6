public class GajiMain {
    public static void main(String[] args){
        DaftarGaji dfg = new DaftarGaji(4);
        Dosen ds1 = new Dosen("1234", "Bambang Supaptro", "Jl.Cendrawasih no.2 Malang", 200000);
        Dosen ds2 = new Dosen("5678", "Diah Ayu", "Jl.Duren no.1 Malang", 300000);
        Dosen ds3 = new Dosen("9876", "Sugik Hariyadi", "Jl.Apel no.6 Malang", 400000);
        Dosen ds4 = new Dosen("5432", "Retno Sulis", "Jl.Anggrek no.8 Malang", 500000);
        ds1.setSKS(10);
        ds2.setSKS(20);
        ds3.setSKS(30);
        ds4.setSKS(40);
        dfg.addPegawai(ds1);
        dfg.addPegawai(ds2);
        dfg.addPegawai(ds3);
        dfg.addPegawai(ds4);
        dfg.printSemuaGaji();
    }
}
