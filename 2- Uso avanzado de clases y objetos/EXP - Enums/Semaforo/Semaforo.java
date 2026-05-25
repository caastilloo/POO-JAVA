package Enums.Semaforo;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    // EN LOS ENUM SIEMPRE STATIC, TANTO ATRIBUTOS COMO MÉTODOS
    public static Semaforo siguiente(Semaforo actual){

        switch (actual){

            case AMARILLO: return ROJO;
            case ROJO: return VERDE;
            case VERDE: return AMARILLO;
            default: return AMARILLO;

        }

    }

}
