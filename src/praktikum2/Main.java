package praktikum2;
public class Main {
    public static void main(String[] args) {
        //membuat objek output dari kelas Bola
        Bola output = new Bola();
        
        //memanggil method setJariJari, setDiameter, showLuasPermukaan dan showVolume
        output.setJariJari(7); //menyetel jarijari menjadi 7
        output.showDiameter();
        output.showLuasPermukaan();
        output.showVolume();
        
        //memberi jarak
        System.out.println();
        
        //memanggil method setJariJari, setDiameter, showLuasPermukaan dan showVolume
        output.setJariJari(14); //menyetel jarijari menjadi 14
        output.showDiameter();
        output.showLuasPermukaan();
        output.showVolume();
    }
}