public class MatematikaCanggih extends Matematika {
        String nama;
        String nim;

        public MatematikaCanggih(String nama,String nim){
        this.nama=nama;
        this.nim=nim;
        }
        
        public double perkalian(double x, double y){
            return x * y;
        }
        public double pembagian(double x, double y){
            return x % y;
        }
        public double modulus(double x, double y){
            return x % y;
        }
    
}