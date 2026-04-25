package motores;

import componentes.Motor;

public class Motor6000Gasolina implements Motor {

    @Override
    public void tipo() {
        System.out.println("Motor 6000cc Gasolina");
    }
}