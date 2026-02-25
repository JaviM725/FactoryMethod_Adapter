package output;

public class ConsoleOutput implements OutputDevice {
    @Override
    public void mostrarDatos(String mensaje) {
        System.out.println("[CONSOLA] " + mensaje);
    }
}