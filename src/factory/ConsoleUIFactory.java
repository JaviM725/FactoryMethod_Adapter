package factory;

import input.ConsoleInput;
import input.InputDevice;
import output.ConsoleOutput;
import output.OutputDevice;

public class ConsoleUIFactory implements UIFactory {
    @Override
    public InputDevice crearEntrada() {
        return new ConsoleInput();
    }

    @Override
    public OutputDevice crearSalida() {
        return new ConsoleOutput();
    }
}
