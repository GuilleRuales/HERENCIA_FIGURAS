import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cubo extends Cuadrado {

    double calcularVolumen(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        double profundidad = p1.calculoDistancia(p2);

        double volumen = Math.pow(profundidad,3);
        this.volumen = volumen;
        return volumen;
    }

}

