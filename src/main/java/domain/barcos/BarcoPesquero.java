package domain.barcos;

public class BarcoPesquero implements Barco{

    public double metrosEslora;
    public double potenciaBarco;
    public int numeroPescadores;

    public BarcoPesquero (double metrosEslora, double potenciaBarco, int numeroPescadores) {

        this.metrosEslora = metrosEslora;
        this.potenciaBarco = potenciaBarco;
        this.numeroPescadores = numeroPescadores;
    }

    @Override
    public void alarma() {
        System.out.println("ALARMA DESDE BARCO PESQUERO!!!");
    }

    @Override
    public void mensajeSocorro(String mensajeSocorro) {

        alarma();
        System.out.println(mensajeSocorro);
    }
}
