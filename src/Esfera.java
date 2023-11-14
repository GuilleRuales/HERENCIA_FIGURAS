public class Esfera extends  Circulo{

    double calcularVolumen(){

        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        double r = p1.calculoDistancia(p2);

        double volumen = (1.3333)*Math.PI*Math.pow(r,3);
        this.volumen = volumen;
        return volumen;
    }

}
