public class Tienda {
    private String nombre, ubicacion, dni, telefono;


    Tienda(String nombre, String ubicacion, String dni, String telefono){
        this.nombre= nombre;
        this.ubicacion= ubicacion;
        this.dni= dni;
        this.telefono= telefono;
    }
    public String getnombre(){
        return nombre;
    }
    public String getubicacion(){
        return ubicacion;
    }
    public String getdni(){
        return dni;
    }
    public String gettelefono(){
        return telefono;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setubicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setdni(String dni){
        this.dni = dni;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
}
