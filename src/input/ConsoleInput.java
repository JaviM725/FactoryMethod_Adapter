// ConsoleInput.java
package input;

import java.util.Scanner;

public class ConsoleInput implements InputDevice {
    // Un único Scanner compartido para toda la aplicación
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String ingresarDatos(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }
}
