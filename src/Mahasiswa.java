public class Mahasiswa { //Class

    //Atribute
    String nama;
    String universitas;
    String fakultas;
    String prodi;
    int semester;

    public Mahasiswa(){ //Objek

    }

    //Behavior
    void intro (){
        System.out.println("Assalamualaikum ngaran ulun "+ nama);
        System.out.println("Ulun dari kampus "+ universitas);
        System.out.println("Fakultas "+ fakultas);
        System.out.println("Program Studi "+ prodi);
        System.out.println("Semester "+ semester);
        System.out.println(" ");
    }

    void sks(){
        System.out.println("Semester ini ulun meambil 24 SKS");
    }
    void matakuliah(){
        System.out.println("Mata kuliah yang ulun ambil WEB 2, VISUAL 2, PBO 1, PDBASE, dll...");
    }
    void praktikum(){
        System.out.println("Semester ini ulun meambil praktikum WEB 2");
    }

}
