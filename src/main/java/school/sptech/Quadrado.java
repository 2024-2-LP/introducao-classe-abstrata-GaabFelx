package school.sptech;

public class Quadrado extends Figura {

    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea(){

        Double areaQuadrado = 0.0;

        areaQuadrado = lado * lado;

        return areaQuadrado;
    };

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
