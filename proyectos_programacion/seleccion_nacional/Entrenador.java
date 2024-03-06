public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador(int identificador, String nombre, String apellidos, int edad, int idFederacion) {
        super(identificador, nombre, apellidos, edad);
        // TODO Auto-generated constructor stub
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrase() {
        // TODO Auto-generated method stub
        System.out.println("el entrenador se concentra para poder entrenar al equipo");
    }

    @Override
    public void viajar() {
        // TODO Auto-generated method stub
        System.out.println("el entrenador viaja con la seleccion ya que es parte de ella");
    }

    public void dirigirPartido(){
        System.out.println("el entrenador dirige el partido para que la seleciccion gane");
    }

    public void dirigirEntrenamiento(){
        System.out.println("el entrenador dirige el entrenamiento");
    }
    

}
