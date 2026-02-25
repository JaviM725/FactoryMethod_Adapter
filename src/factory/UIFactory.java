package factory;

import input.InputDevice;
import output.OutputDevice;

public interface UIFactory {
    InputDevice crearEntrada();
    OutputDevice crearSalida();
}
