package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem  {

    private List<Figura> figuras;

    public void adicionar(Figura figura){

        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){

        Double somaDasAreas = 0.0;

        for(Figura figura: figuras){
            somaDasAreas += figura.calcularArea();
        }

        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){

        List<Figura> areasMaiorQue20 = new ArrayList<>();

        for (Figura figura: figuras){
            if (figura.calcularArea() > 20){
                areasMaiorQue20.add(figura);
            }
        }

        return areasMaiorQue20;
    }

    public List<Figura> buscarQuadrados(){

        List<Figura> figurasQuadradas = new ArrayList<>();

        for (Figura figura: figuras){
            if (figura instanceof Quadrado){
                figurasQuadradas.add(figura);
            }
        }

        return figurasQuadradas;
    }
}
