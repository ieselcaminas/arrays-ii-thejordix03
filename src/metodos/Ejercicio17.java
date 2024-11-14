public class Ejercicio17 {

    public static int obtenerDiasDelMes(int mes) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2: // Febrero
                return 28; //

            default:
                return -1; // Indica que el mes es inválido
        }
    }

    public static void main(String[] args) {
        int mes;
        int dias;

        mes = Utilidades.leerEntero("Introduce un número de mes (1-12):");
        dias = obtenerDiasDelMes(mes);

        if (dias == -1) {
            System.out.println("El mes introducido no es válido.");
        } else {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
    }
}

















