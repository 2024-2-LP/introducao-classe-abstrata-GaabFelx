package school.sptech;

public class Circulo extends Figura {

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea(){
        Double areaCirculo = 0.0;

        areaCirculo = Math.PI * (raio * raio);

        return areaCirculo;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
