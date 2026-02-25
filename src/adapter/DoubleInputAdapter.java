package adapter;

import input.InputDevice;

// Adapta InputDevice (String) → Double
public class DoubleInputAdapter implements InputAdapter<Double> {
    private InputDevice adaptado;

    public DoubleInputAdapter(InputDevice adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public Double obtenerDato(String mensaje) {
        String valor = adaptado.ingresarDatos(mensaje + " (decimal)");
        try {
            return Double.parseDouble(valor.trim().replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido, se retorna 0.0");
            return 0.0;
        }
    }
}
