package domain.barcos;

public class BarcoCrucero implements Barco{

    public double metrosEslora;
    public int numeroCamasOcupadas;

    public BarcoCrucero (double metrosEslora, int numeroCamasOcupadas) {

        this.metrosEslora = metrosEslora;
        this.numeroCamasOcupadas = numeroCamasOcupadas;
    }
    @Override
    public void alarma() {
        System.out.println("ALARMA DESDE BARCO CRUCERO!!!");
    }

    @Override
    public void mensajeSocorro(String mensajeSocorro) {
        alarma();
        System.out.println(mensajeSocorro);
    }
}
