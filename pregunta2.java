public class pregunta2 {
    String autor, titulo, año, paginas, estadolibro;
    int prestado;

    pregunta2(String autor, String titulo, String año, String paginas,String estadolibro, int prestado){
        this.autor = autor;
        this.titulo = titulo;
        this.año = año;
        this.paginas = paginas;
        this.estadolibro = estadolibro;
        this.prestado = prestado;
    }
    public void estado(){
        if(prestado == 1){
            estadolibro = "Prestado";
            System.out.println("Autor: "+autor+" Titulo: "+titulo+" Año de Publicacion: "+año+" Numero de Paginas: "+paginas+" Estado: "+estadolibro);
        }else if(prestado == 0){
            estadolibro = "Disponible";
            System.out.println("Autor: "+autor+" Titulo: "+titulo+" Año de Publicacion: "+año+" Numero de Paginas: "+paginas+" Estado: "+estadolibro);
        }else 
        System.out.println("Autor: "+autor+"Titulo: "+titulo+"Año de Publicacion: "+año+"Numero de Paginas"+paginas+"Estado: "+estadolibro);
    }
    public static void main(String[] args) {
        
        pregunta2 p = new pregunta2("Juan Sebastian", "Las locuras de Emiliana", "2022", "200","0", 0);
        p.estado();

    }
}
