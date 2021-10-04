package org.iesfm.insituto;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Instituto {
    private String nombre;
    private String direccion;
    private List<Grupo> grupos;

    public Instituto(String nombre, String direccion, List<Grupo> grupos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.grupos = grupos;
    }

    public List<Alumno> todosLosAlumnos() {
        List<Alumno> alumnos = new LinkedList<>();
        for (Grupo grupo : grupos) {
            alumnos.addAll(grupo.getAlumnos());
        }
        return alumnos;
    }

    // Dado un DNI, devolver si existe el alumno
    public boolean existeAlumno(String dni) {
        boolean encontrado = false;
        for (Alumno alumno : todosLosAlumnos()) {
            if (alumno.getDni().equals(dni)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) && Objects.equals(direccion, instituto.direccion) && Objects.equals(grupos, instituto.grupos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, grupos);
    }
}
