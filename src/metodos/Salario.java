public class Salario {
	public static double calcularImpuestos(double bruto,double impuestos){

		if (bruto <= 500) {
			impuestos = 0;
		} else if (bruto <= 900) {
			impuestos = (bruto - 500) * 0.25f;
		} else {
			impuestos = (400 * 0.25f) + (bruto - 500 - 400) * 0.45f;
		}
		return impuestos;

	}
	public static double calcularBruto(int horas, double precio) {
		double bruto;
		if (horas <= 35) {
			bruto = horas * precio;
		} else {
			bruto = 35 * precio;
			bruto += (horas - 35) * precio * 1.5;
		}
		return bruto;

	}
		public static void main (String argv[]){
			int horas;
			double precio;
			double bruto;
			double impuestos = 0;

			horas = Utilidades.leerEntero("Introduce las horas:");

			precio = Utilidades.leerDoble("Introduce el precio por hora:");

			bruto = calcularBruto(horas, precio);

			impuestos = calcularImpuestos(bruto,impuestos);


			System.out.println("Pago bruto: " + bruto);
			System.out.println("Salario neto: " + (bruto - impuestos));
			System.out.println("Impuestos: " + impuestos);
		}
	}
