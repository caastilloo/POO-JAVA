package PlataformaStreaming;

import java.util.ArrayList;

public class PlataformaStreaming {

    static void main() {

        ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();

        PlanGratis plan1 = new PlanGratis("Gratis", 0.0);
        listaSuscripciones.add(plan1);

        PlanBasico plan2 = new PlanBasico("Básco", 9.99);
        listaSuscripciones.add(plan2);

        PlanPremium plan3 = new PlanPremium("Premium", 14.99);
        listaSuscripciones.add(plan3);

        PlanFamiliar plan4 = new PlanFamiliar("Familiar", 19.99);
        listaSuscripciones.add(plan4);

        for (Suscripcion suscripcion : listaSuscripciones){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
            System.out.println();
        }


    }
}
