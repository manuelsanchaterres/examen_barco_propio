package main;

import domain.barcos.BarcoCrucero;
import domain.barcos.BarcoPesquero;
import domain.barcos.BarcoPortaAviones;

public class Main {
    public static void main(String[] args) {
        // INSTANCIA, MUESTRA INFORMACIÓN Y LLAMADA MÉTODOS ALARMA Y MENSAJESOCORRO PARA BARCO CRUCERO
        BarcoCrucero barcoCrucero = new BarcoCrucero(375.32,25);
        System.out.println("DATOS BARCO CRUCERO: Metros de Eslora: " + barcoCrucero.metrosEslora + ", Número de Camas Ocupadas: " + barcoCrucero.numeroCamasOcupadas);
        barcoCrucero.alarma();
        barcoCrucero.mensajeSocorro("NECESITAMOS AYUDA URGENTE DESDE BARCO CRUCERO!!!");

        // INSTANCIA, MUESTRA INFORMACIÓN Y LLAMADA MÉTODOS ALARMA Y MENSAJESOCORRO PARA BARCO PORTAAVIONES

        BarcoPortaAviones barcoPortaAviones = new BarcoPortaAviones(47,352);
        System.out.println("DATOS BARCO PORTAAVIONES: " + "Número Total de Aviones: " + barcoPortaAviones.numeroAviones + ", Número de Marinos: " + barcoPortaAviones.numeroMarinos);
        barcoPortaAviones.alarma();
        barcoPortaAviones.mensajeSocorro("NECESITAMOS AYUDA URGENTE DESDE BARCO PORTAAVIONES!!!");

        // INSTANCIA, MUESTRA INFORMACIÓN Y LLAMADA MÉTODOS ALARMA Y MENSAJESOCORRO PARA BARCO PESQUERO

        BarcoPesquero barcoPesquero = new BarcoPesquero(55.24,1500.32, 12);
        System.out.println("DATOS BARCO PESQUERO: Metros de Eslora: " + barcoPesquero.metrosEslora + ", Potencia del Barco: " + barcoPesquero.potenciaBarco + ", Número de Pescadores: " + barcoPesquero.numeroPescadores);
        barcoPesquero.alarma();
        barcoPesquero.mensajeSocorro("NECESITAMOS AYUDA URGENTE DESDE BARCO PESQUERO!!!");

    }
}
