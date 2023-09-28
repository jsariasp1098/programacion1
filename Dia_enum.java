public enum Dia_enum {
    LUNES,
    MARTES,
    MIERCOLES, 
    JUEVES,
    VIERNES,
}
public class Dia_enum {
    public static void main(String[] args) {
        Dia_enum diaActual = Dia_enum.LUNES;
        switch (diaActual) {
            case LUNES:
                System.out.println("Hoy es Lunes");
                break;
            case MARTES:
                System.out.println("Hoy es Martes");
                break;
            case MIERCOLES:
                System.out.println("Hoy es Miercoles");
                break;
            case JUEVES:
                System.out.println("Hoy es Jueves");
                break;
            case VIERNES:
                System.out.println("Hoy es Viernes");
                break;
            default:
                break;
        }
    }
}
