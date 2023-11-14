import java.util.Scanner;

public class Circulo extends Figura{

    public Circulo() {
    }

    void ingresarPuntos(){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<2; i++){
            System.out.println("Ingrese la componente X del punto: "+i);
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto: "+i);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.listaPuntos.add(punto);
        }
    }

    double calcularPerimetro(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        double r = p1.calculoDistancia(p2); //método de la clase Punto

        this.perimetro = 2*r*Math.PI;
        return this.perimetro;

    }

    double calcularArea(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);

        double r = p1.calculoDistancia(p2); //método de la clase Punto

        this.area = Math.PI*Math.pow(r,2);
        return this.area;

    }

}
