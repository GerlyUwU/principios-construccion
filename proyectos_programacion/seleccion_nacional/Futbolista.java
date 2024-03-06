public class Futbolista extends Persona {

    private int numeroDePlayera;
    private String posicionDeJuego;

    public Futbolista(int identificador, String nombre, String apellidos, int edad, int numeroDePlayera,
            String posicionDeJuego) {
        super(identificador, nombre, apellidos, edad);
        // TODO Auto-generated constructor stub
        this.numeroDePlayera = numeroDePlayera;
        this.posicionDeJuego = posicionDeJuego;
    }

    @Override
    public void concentrase() {
        // TODO Auto-generated method stub
        System.out.println("el jugador se concentra para dar lo mejor de si ");
    }

    @Override
    public void viajar() {
        // TODO Auto-generated method stub
        System.out.println("el jugador viaja a los juegos con la seleccion ya que es parte de la misma");
    }

    public void jugarPartido() {
        System.out.println("el jugador juega los partidos con todo su esfuerzo y dedicacion ");

    }

    public void entrenar() {
        System.out.println("el jugador entrena para ser mejor cada dia");
    }

}
