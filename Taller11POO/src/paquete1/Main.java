
package paquete1;

import entities.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MenuKids kid1 = new MenuKids("Papi pollo", 3.00);
        MenuKids kid2 = new MenuKids("Salchipapa", 3.00);
        EconomicalMenu econmical1 = new EconomicalMenu("Hamburguesa Sencilla", 2.50);

        Cuenta cuenta = new Cuenta("Juan Seabastinan Rodriguez Maza");
        cuenta.setListadoMenus(new ArrayList <>(Arrays.asList(kid1, kid2,  econmical1)));
        cuenta.calcularSubtotal();
        System.out.println(cuenta);
    }
}