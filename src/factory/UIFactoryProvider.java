package factory;

public class UIFactoryProvider {

    public enum Entorno { CONSOLA, FRAME }

    // Factory Method: decide qué fábrica concreta crear
    public static UIFactory obtenerFactory(Entorno entorno) {
        switch (entorno) {
            case FRAME:   return new FrameUIFactory();
            case CONSOLA:
            default:      return new ConsoleUIFactory();
        }
    }
}
