import carros.Carro;
import carros.CarroDiesel;
import carros.CarroGasolina;

import componentes.Motor;
import componentes.RelacionesDiferenciales;
import componentes.Suspension;

import motores.*;
import relaciones.*;
import suspensiones.*;

public class App {
    public static void main(String[] args) {

        
        Motor[] motores = {
            new Motor5000Gasolina(),
            new Motor6000Gasolina(),
            new Motor5000Diesel(),
            new Motor6000Diesel()
        };

        RelacionesDiferenciales[] relaciones = {
            new Relacion47(),
            new Relacion49()
        };

        Suspension[] suspensiones = {
            new SuspensionARB25(),
            new SuspensionTJM35()
        };

        
        for (Motor m : motores) {
            for (RelacionesDiferenciales r : relaciones) {
                for (Suspension s : suspensiones) {

                    Carro carro;

                    if (m instanceof Motor5000Diesel || m instanceof Motor6000Diesel) {
                        carro = new CarroDiesel(m, r, s);
                    } else {
                        carro = new CarroGasolina(m, r, s);
                    }

                    carro.tipoCarroOffRoad();
                    System.out.println("-------------");
                }
            }
        }
    }
}