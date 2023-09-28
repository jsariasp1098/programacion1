public class Mascotas {
    private String nombre, f_nacimiento, raza, estado, id;

    Mascotas(String nombre, String f_nacimiento, String raza, String estado, String id){
        this.nombre = nombre;
        this.f_nacimiento = f_nacimiento;
        this.raza = raza;
        this.estado = estado;
        this.id = id;
    }
    public String getnombre(){
        return nombre;
    }
    public String getf_nacimiento(){
        return f_nacimiento;
    }
    public String getraza(){
        return raza;
    }
    public String getestado(){
        return estado;
    }
    public String getid(){
        return id;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setf_nacimiento(String f_nacimiento){
        this.f_nacimiento = f_nacimiento;
    }
    public void setraza(String raza){
        this.raza = raza;
    }
    public void setestado(String estado){
        this.estado = estado;
    }
    public void setid(String id){
        this.id = id;
    }
}
