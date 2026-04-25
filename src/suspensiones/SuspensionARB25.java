package suspensiones;

import componentes.Suspension;

public class SuspensionARB25 implements Suspension {

    @Override
    public void tipo() {
        System.out.println("Suspension ARB 2.5");
    }
}