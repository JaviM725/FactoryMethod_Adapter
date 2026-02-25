package factory;

import input.FrameInput;
import input.InputDevice;
import output.FrameOutput;
import output.OutputDevice;

public class FrameUIFactory implements UIFactory {
    @Override
    public InputDevice crearEntrada() {
        return new FrameInput();
    }

    @Override
    public OutputDevice crearSalida() {
        return new FrameOutput();
    }
}
