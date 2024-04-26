package domain.barcos;

public class BarcoPortaAviones implements Barco{

    public int numeroAviones;
    public int numeroMarinos;

    public BarcoPortaAviones (int numeroAviones, int numeroMarinos) {

        this.numeroAviones = numeroAviones;
        this.numeroMarinos = numeroMarinos;
    }

    @Override
    public void alarma() {

        System.out.println("ALARMA DESDE BARCO PORTAAVIONES!!!");
    }

    @Override
    public void mensajeSocorro(String mensajeSocorro) {

        alarma();
        System.out.println(mensajeSocorro);
    }
}
