package pertemuan4inherit2;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih ID=new MatematikaCanggih ();
        System.out.println("pertambahan: "+ID.tambah(10,20));
        System.out.println("pengurangan: "+ID.kurang(23,34));
        System.out.println("perkalian: "+ID.kali(28,14));
        System.out.println("pembagian: "+ID.bagi(18,9));
        System.out.println("modulus: "+ID.modulus(10,28));
    } 
}