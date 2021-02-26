package praktikum2;
public class Bola {
    //membuat variabel instance
    private double jarijari;
    private double diameter;
    private double lp;
    private double volume;
    
    //membuat method setJarijjari untuk menyetel variabel jarijari
    public void setJariJari(double jarijari){
        this.jarijari = jarijari;
        System.out.println("1. Ukuran Jari-Jari : "+jarijari); //menghasilkan hasil output
    }
    //membuat method showDiameter untuk membuat diameter
    public void showDiameter(){
        this.diameter = 2*jarijari; //diameter adalah 2 kali jarijari
        System.out.println("2. Ukuran Diameter  : "+diameter); //menghasilkan output
    }
    //membuat method showLuasPermukaan untuk menghitung Luas Permukaan bola
    public void showLuasPermukaan(){
        this.lp = 4 * Math.PI * jarijari * jarijari; //rumus luas permukaan Bola
        System.out.println("3. Luas Permukaan   : "+lp); //menghasilkan output
    }
    //membuat method showVolume untuk menghitung volume bola
    public void showVolume(){
        this.volume = 4 * Math.PI * jarijari * jarijari * jarijari / 3; //rumus volume bola
        System.out.println("4. Volume           : "+volume); //menghasilkan output
    }
}