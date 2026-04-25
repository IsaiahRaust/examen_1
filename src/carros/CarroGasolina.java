package carros;

import componentes.Motor;
import componentes.RelacionesDiferenciales;
import componentes.Suspension;

public class CarroGasolina extends Carro {

    private final Motor motor;
    private final RelacionesDiferenciales relaciones;
    private final Suspension suspension;

    
    public CarroGasolina(Motor motor, RelacionesDiferenciales relaciones, Suspension suspension) {
        this.motor = motor;
        this.relaciones = relaciones;
        this.suspension = suspension;

        System.out.println("Carro de Gasolina");
    }

    @Override
    public void tipoCarroOffRoad() {
        motor.tipo();
        relaciones.tipo();
        suspension.tipo();
    }
}