public class Kampus {
    public static void main(String[] args) {

        Mahasiswa Maulina;

        Maulina = new Mahasiswa();
        Maulina.nama= "Maulina";
        Maulina.universitas="UNISKA";
        Maulina.fakultas="Teknologi Informasi";
        Maulina.prodi="Teknik Informatika";
        Maulina.semester= 4;

        Maulina.intro();
        Maulina.sks();
        Maulina.matakuliah();
        Maulina.praktikum();

    }
}
