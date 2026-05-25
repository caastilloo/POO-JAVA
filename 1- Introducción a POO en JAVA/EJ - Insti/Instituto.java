package Insti;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@ToString
public class Instituto {

    private final String nombre;
    private String poblacion;

    private List<Estudiante> listaEstudiantes = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();

    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            listaEstudiantes.add(estudiante);
        }
    }

    public void agregarCurso(Curso curso) {
        if (curso == null) return;

        for (Curso curso1 : listaCursos) {
            if (curso1.getNombre().equals(curso.getNombre())
                    && curso1.getHoras() == curso.getHoras()) {
                return;
            }
        }
        listaCursos.add(curso);
    }
}