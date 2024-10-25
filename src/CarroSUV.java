public class CarroSUV extends Carro {
    private int capacidadePortaMalas;

    public CarroSUV(String marca, String modelo, int ano, int capacidadePortaMalas) {
        super(marca, modelo, ano);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Capacidade do Porta-malas: " + capacidadePortaMalas + " litros";
    }
}