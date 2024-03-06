public class Prueba {
    public static void main(String[] args) {
        // ¿que hace el entrenador?
        Entrenador entrenador1 = new Entrenador(12, "vergara", "camacho", 25, 340);
        entrenador1.concentrase();
        entrenador1.viajar();
        entrenador1.dirigirPartido();
        entrenador1.dirigirEntrenamiento();
        System.out.println("\n");

        // ¿que hace el masajista?
        Masajista masajista1 = new Masajista(11, "pepe", "santes", 20, 19, "masajista");
        masajista1.concentrase();
        masajista1.viajar();
        masajista1.darMasaje();
        System.out.println("\n");

        // ¿Que hace el futbolista?
        Futbolista futbolista1 = new Futbolista(777, "GERLY DANIEL ", "ARTEAGA BERNAL", 23, 07, "DELANTERO");
        futbolista1.concentrase();
        futbolista1.viajar();
        futbolista1.jugarPartido();
        futbolista1.entrenar();
        System.out.println("\n");

    }
}
