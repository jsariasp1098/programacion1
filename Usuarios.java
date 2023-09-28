public class Usuarios {
    private String nombre, cargo, id;

    Usuarios(String nombre, String cargo, String id){
        this.nombre = nombre;
        this.cargo = cargo;
        this.id = id;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargp(String cargo){
        this.cargo = cargo;
    }
    public String getid(){
        return id;
    }
    public void setid(String id){
        this.id = id;
    }
}
