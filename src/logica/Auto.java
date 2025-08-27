package logica;

import Interfaces.Motor;

public class Auto extends Vehiculo{
    public Auto(Motor motor){
        super(motor);
    }
   @Override
   public void adelante(){
    super.adelante();
    System.out.println("Auto circulando.");
   }
}