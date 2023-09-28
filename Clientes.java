public class Clientes {
    private String id, nombre, telefono, f_adopcion;

    Clientes (String id, String nombre,String telefono, String f_adopcion){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.f_adopcion = f_adopcion;
    }
    //Get
    public String getid(){
        return id;
    }
    public String getnombre(){
        return nombre;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getf_adopcion(){
        return f_adopcion;
    }
    //setter
    public void setid(String id){
        this.id = id;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setf_adopcion(String f_adopcion){
        this.f_adopcion = f_adopcion;
    }

}

