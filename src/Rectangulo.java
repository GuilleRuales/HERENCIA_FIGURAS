import java.util.List;
import java.util.Scanner;

public class Rectangulo extends Figura{

       public Rectangulo() {

    }

    void ingresarPuntos(){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<4; i++){
            System.out.println("Ingrese la componente X del punto: "+i+1);
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente X del punto: "+i+1);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.listaPuntos.add(punto);
        }
    }

    double calcularPerimetro(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        Punto p4 = this.listaPuntos.get(3);

        double l1 = p1.calculoDistancia(p2); //método de la clase Punto
        double l2 = this.calculoDistancia(p1,p3); //método de la clase Figura

        this.perimetro = (l1*2) + (l2*2);
        return this.perimetro;

    }

    double calcularArea(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        Punto p4 = this.listaPuntos.get(3);

        double l1 = p1.calculoDistancia(p2); //método de la clase Punto
        double l2 = this.calculoDistancia(p1,p3); //método de la clase Figura

        this.area = l1*l2;
        return this.area;
    }

}

