package carros;

import componentes.Motor;
import componentes.RelacionesDiferenciales;
import componentes.Suspension;

public class CarroDiesel extends Carro {

    private final Motor motor;
    private final RelacionesDiferenciales relaciones;
    private final Suspension suspension; 

    
    public CarroDiesel(Motor motor, RelacionesDiferenciales relaciones, Suspension suspension) {
        this.motor = motor;
        this.relaciones = relaciones;
        this.suspension = suspension;

        System.out.println("Carro de Diesel");
    }

    @Override 
    public void tipoCarroOffRoad() {
        motor.tipo();
        relaciones.tipo();
        suspension.tipo();
    }
}