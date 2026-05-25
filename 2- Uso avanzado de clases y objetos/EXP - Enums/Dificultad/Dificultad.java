package Enums.Dificultad;

public enum Dificultad {

    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);

    public final int multi_puntuacion;

    Dificultad(int multiPuntuacion) {
        this.multi_puntuacion = multiPuntuacion;
    }

    public int getMulti_puntuacion() {
        return multi_puntuacion;
    }
}
