package logica;

import Interfaces.Marchas;
import Interfaces.Motor;

public class Vehiculo implements Marchas{
    protected Motor motor;

    public Vehiculo(Motor motor){
        this.motor = motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    @Override
    public void adelante(){
        motor.encender();
        System.out.println("El auto esta en marcha.");
    }
    @Override
    public void atras(){
        motor.encender();
        System.out.println("El auto retrocede");
    }
}