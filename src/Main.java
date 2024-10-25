import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaDeCarros = new ArrayList<>();


        listaDeCarros.add(new Carro("Toyota", "Corolla", 2020));
        listaDeCarros.add(new CarroEsportivo("Ferrari", "488 Spider", 2021, 670));
        listaDeCarros.add(new CarroSUV("Ford", "Ecosport", 2019, 356));


        for (Carro carro : listaDeCarros) {
            System.out.println(carro.exibirInfo());
        }
    }
}