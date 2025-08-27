package logica;

import Interfaces.Motor;

public class Mecanico implements Motor {
    @Override
    public void encender(){
        System.out.println("Motor humeante encendido.");
    }
    @Override
    public void apagar(){
        System.out.println("Motor apagado dejo de generar humo");
    }
}
