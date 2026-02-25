// FrameOutput.java
package output;

import javax.swing.*;

public class FrameOutput implements OutputDevice {

    @Override
    public void mostrarDatos(String mensaje) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(frame, mensaje, "Salida", JOptionPane.INFORMATION_MESSAGE);
    }
}
