    import java.util.ArrayList;
    import java.util.List;

    public class Figura {

        double perimetro, area, volumen;

        List<Punto> listaPuntos = new ArrayList<>();

        public Figura() {
        }

        public Figura(double perimetro, double area, List<Punto> listaPuntos) {
            this.perimetro = perimetro;
            this.area = area;
            this.listaPuntos = listaPuntos;
        }

        public void imprimirArea(String figura){

            System.out.println("El area del "+figura+" es: "+area);

        }

        public void imprimirPerimetro(String figura){

            System.out.println("El perimetro del "+figura+" es: "+perimetro);

        }

        public void imprimirVolumen(String figura){

            System.out.println("El volumen de la "+figura+" es: "+volumen);

        }

        public Figura(double perimetro, double area) {
            this.perimetro = perimetro;
            this.area = area;
        }

        double calculoDistancia(Punto punto1, Punto punto2){
            double dist = Math.sqrt(Math.pow(punto1.getX()- punto2.getX(),2)+Math.pow(punto1.getY() - punto2.getY(),2));
            return dist;
        }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(List<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    }
