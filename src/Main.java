import Interfaces.Marchas;
import Interfaces.Motor;
import logica.Auto;
import logica.Electrico;
import logica.Mecanico;

public class Main {
    public static void main(String[] args){
        Motor mecaMotor = new Mecanico();
        Motor eleMotor = new Electrico();

        Marchas autoCombustion = new Auto(mecaMotor);
        Marchas autoElectrico = new Auto(eleMotor);
        
        System.out.println("=== Auto Eléctrico ===");
        autoElectrico.adelante();
        autoElectrico.atras();
        
        System.out.println("\n=== Auto de Combustión ===");
        autoCombustion.adelante();
        autoCombustion.atras();
    }
}
