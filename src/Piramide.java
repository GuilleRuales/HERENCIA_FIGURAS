import java.util.Scanner;

public class Piramide extends Triangulo {

    double calcularVolumen(){

        Scanner sc = new Scanner(System.in);
        System.out.println("==========ALTURA=========");
        System.out.println("Ingrese la componente X del punto: ");
        double x = sc.nextDouble();
        System.out.println("Ingrese la componente Y del punto: ");
        double y = sc.nextDouble();
        Punto punto = new Punto(x,y);
        this.listaPuntos.add(punto);

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        Punto altura = this.listaPuntos.get(3);

        double l1 = p1.calculoDistancia(p2); //método de la clase Punto
        double l2 = this.calculoDistancia(p1,p3); //método de la clase Figura
        double h = p1.calculoDistancia(altura);
        double area = l1*l2;

        double volumen = (area*h)/3;
        this.volumen = volumen;
        return volumen;
    }

}
