package adapter;

import input.InputDevice;

// Adapta InputDevice (String) → Integer
public class IntegerInputAdapter implements InputAdapter<Integer> {
    private InputDevice adaptado;

    public IntegerInputAdapter(InputDevice adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public Integer obtenerDato(String mensaje) {
        String valor = adaptado.ingresarDatos(mensaje + " (entero)");
        try {
            return Integer.parseInt(valor.trim());
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido, se retorna 0");
            return 0;
        }
    }
}
