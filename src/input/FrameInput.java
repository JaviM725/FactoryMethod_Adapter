// FrameInput.java
package input;

import javax.swing.*;

public class FrameInput implements InputDevice {

    @Override
    public String ingresarDatos(String mensaje) {
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String valor = JOptionPane.showInputDialog(frame, mensaje, "Entrada", JOptionPane.QUESTION_MESSAGE);
        return valor != null ? valor : "";
    }
}