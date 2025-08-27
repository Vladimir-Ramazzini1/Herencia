package logica;
import Interfaces.Motor;

public class Electrico implements Motor {
    @Override
    public void encender(){
        System.out.println("Motor electrico encendido pero silencioso.");
    }
    @Override
    public void apagar(){
        System.out.println("Motor electrico apagado");
    }
}
