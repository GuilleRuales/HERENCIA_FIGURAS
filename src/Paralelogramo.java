import java.util.Scanner;

public class Paralelogramo extends Rectangulo{

    double profundidad;

    double calcularVolumen(){

        Scanner sc = new Scanner(System.in);
        System.out.println("=======PROFUNDIDAD======");
        System.out.println("Ingrese la componente X del punto: ");
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto: ");
        double y = sc.nextDouble();
        Punto punto = new Punto(x,y);
        this.listaPuntos.add(punto);

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        Punto profundidad = this.listaPuntos.get(3);

        double l1 = p1.calculoDistancia(p2); //método de la clase Punto
        double l2 = this.calculoDistancia(p1,p3); //método de la clase Figura
        double l3 = p1.calculoDistancia(profundidad);

        double volumen = l1*l2*l3;
        this.volumen = volumen;
        return volumen;
    }

}
