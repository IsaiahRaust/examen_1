package motores;

import componentes.Motor;

public class Motor6000Diesel implements Motor {

    @Override
    public void tipo() {
        System.out.println("Motor 6000cc Diesel");
    }
}