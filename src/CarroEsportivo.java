public class CarroEsportivo extends Carro {
    private int potencia;

    public CarroEsportivo(String marca, String modelo, int ano, int potencia) {
        super(marca, modelo, ano);
        this.potencia = potencia;
    }

    @Override
    public String exibirInfo() {
        return super.exibirInfo() + ", Potência: " + potencia + " CV";
    }
}