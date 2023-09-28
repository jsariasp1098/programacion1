import java.util.Scanner;
public class pregunta1 {
    int estado;
    pregunta1 (int estado){
        this.estado = estado;
    }
    public void puerta(){
                if(estado == 1){
            System.out.println("Puerta Abierta");
        }else if(estado == 0){
            System.out.println("Puerta Cerrada");
        }else {
            System.out.println("No Permitido");
        }
    }
    public static void main(String[] args) {
        int estado;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para Abrir Oprima 1");
        System.out.println("Para Cerrar Oprima 0");
        estado = scanner.nextInt();
        pregunta1 p = new pregunta1(estado);
        p.puerta();

    }
}
