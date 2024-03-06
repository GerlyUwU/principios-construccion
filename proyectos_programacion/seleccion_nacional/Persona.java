abstract class  Persona{
    protected int identificador;
    protected String nombre; 
    protected String apellidos;
    protected int edad;



    public Persona(int identificador, String nombre, String apellidos, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }






    
    public int getIdentificador() {
        return identificador;
    }







    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }







    public String getNombre() {
        return nombre;
    }







    public void setNombre(String nombre) {
        this.nombre = nombre;
    }







    public String getApellidos() {
        return apellidos;
    }







    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }







    public int getEdad() {
        return edad;
    }







    public void setEdad(int edad) {
        this.edad = edad;
    }







    //metodos abstractos(se implementaran segun cada rol utilizado)
    public abstract void concentrase();
    public abstract void viajar();
    


}