import adapter.DoubleInputAdapter;
import adapter.IntegerInputAdapter;
import factory.UIFactory;
import factory.UIFactoryProvider;
import factory.UIFactoryProvider.Entorno;
import input.InputDevice;
import output.OutputDevice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.setProperty("java.awt.headless", "false");
        // ── El cliente elige el entorno ──────────────────────────────
        Scanner scanner = new Scanner(System.in);
        Entorno entorno = null;

        while (entorno == null) {
            System.out.println("╔══════════════════════════════════╗");
            System.out.println("║  Selecciona el modo de interfaz  ║");
            System.out.println("╠══════════════════════════════════╣");
            System.out.println("║  1. Consola                      ║");
            System.out.println("║  2. Ventana (JOptionPane)        ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    entorno = Entorno.CONSOLA;
                    break;
                case "2":
                    entorno = Entorno.FRAME;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingresa 1 o 2.\n");
            }
        }

        // ── Crear la factory según la elección ───────────────────────
        UIFactory factory = UIFactoryProvider.obtenerFactory(entorno);

        InputDevice  entrada = factory.crearEntrada();
        OutputDevice salida  = factory.crearSalida();

        // ── Uso normal (String) ──────────────────────────────────────
        String nombre = entrada.ingresarDatos("Ingresa tu nombre");
        salida.mostrarDatos("Hola, " + nombre + "!");

        // ── Adapter: String → Integer ────────────────────────────────
        IntegerInputAdapter intAdapter = new IntegerInputAdapter(entrada);
        int edad = intAdapter.obtenerDato("Ingresa tu edad");
        salida.mostrarDatos("Tu edad es: " + edad + " años. En 10 años tendrás " + (edad + 10));

        // ── Adapter: String → Double ─────────────────────────────────
        DoubleInputAdapter doubleAdapter = new DoubleInputAdapter(entrada);
        double altura = doubleAdapter.obtenerDato("Ingresa tu altura en metros");
        salida.mostrarDatos("Tu altura es: " + altura + " m");
    }
}