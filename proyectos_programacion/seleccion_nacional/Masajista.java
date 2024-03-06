public class Masajista extends Persona {
    private int aniosExperiencia;
    private String profesion;

    public Masajista(int identificador, String nombre, String apellidos, int edad, int aniosExperiencia,String profesion) {
        super(identificador, nombre, apellidos, edad);
        // TODO Auto-generated constructor stub
        this.aniosExperiencia = aniosExperiencia;
        this.profesion = profesion;
    }

    @Override
    public void concentrase() {
        // TODO Auto-generated method stub
        System.out.println("el masajista se concentra para los jugadores");
    }

    @Override
    public void viajar() {
        // TODO Auto-generated method stub
        System.out.println("el masajista viaja con la seleccion ya que es parte de la misma");

    }

    public static void darMasaje() {
        System.out.println("el masajista da masajes a los jugadores");
    }

}
