package motores;

import componentes.Motor;

public class Motor5000Diesel implements Motor {

    @Override
    public void tipo() {
        System.out.println("Motor 5000cc Diesel");
    }
}