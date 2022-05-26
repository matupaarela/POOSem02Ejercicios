package ejercicios.extra001;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Silla> sillas;

    public Tienda() {
        sillas = new ArrayList<>();
    }

    public void addSilla(Silla silla){
        sillas.add(silla);
    }

    public void printSillas(){
        for(Silla silla : sillas) {
            System.out.println(silla);
        }
    }
}
