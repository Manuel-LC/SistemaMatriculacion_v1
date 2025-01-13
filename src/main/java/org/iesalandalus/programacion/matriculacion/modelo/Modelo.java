package org.iesalandalus.programacion.matriculacion.modelo;

import org.iesalandalus.programacion.matriculacion.modelo.dominio.Alumno;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Asignatura;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.CicloFormativo;
import org.iesalandalus.programacion.matriculacion.modelo.dominio.Matricula;
import org.iesalandalus.programacion.matriculacion.modelo.negocio.*;

import javax.naming.OperationNotSupportedException;

public class Modelo {
    public static final int CAPACIDAD=3;
    private static Alumnos alumnos;
    private static Asignaturas asignaturas = new Asignaturas(CAPACIDAD);
    private static CiclosFormativos ciclosFormativos = new CiclosFormativos(CAPACIDAD);
    private static Matriculas matriculas = new Matriculas(CAPACIDAD);

    public void comenzar() {
        alumnos = new Alumnos(CAPACIDAD);
        asignaturas = new Asignaturas(CAPACIDAD);
        ciclosFormativos = new CiclosFormativos(CAPACIDAD);
        matriculas = new Matriculas(CAPACIDAD);
        System.out.println("Modelo iniciado.");
    }

    public void terminar() {
        System.out.println("Modelo terminado.");
    }

    public void insertar(Alumno alumno) throws OperationNotSupportedException {
        alumnos.insertar(alumno);
    }

    public Alumno buscar(Alumno alumno) {
        return alumnos.buscar(alumno);
    }

    public void borrar(Alumno alumno) throws OperationNotSupportedException {
        alumnos.borrar(alumno);
    }

    public Alumno[] getAlumnos() {
        return alumnos.get();
    }

    public void insertar(Asignatura asignatura) throws OperationNotSupportedException {
        asignaturas.insertar(asignatura);
    }

    public Asignatura buscar(Asignatura asignatura) {
        return asignaturas.buscar(asignatura);
    }

    public void borrar(Asignatura asignatura) throws OperationNotSupportedException {
        asignaturas.borrar(asignatura);
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas.get();
    }

    public void insertar(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
        ciclosFormativos.insertar(cicloFormativo);
    }

    public CicloFormativo buscar(CicloFormativo cicloFormativo) {
        return ciclosFormativos.buscar(cicloFormativo);
    }

    public void borrar(CicloFormativo cicloFormativo) throws OperationNotSupportedException {
        ciclosFormativos.borrar(cicloFormativo);
    }

    public CicloFormativo[] getCiclosFormativos() {
        return ciclosFormativos.get();
    }

    public void insertar(Matricula matricula) throws OperationNotSupportedException {
        matriculas.insertar(matricula);
    }

    public Matricula buscar(Matricula matricula) {
        return matriculas.buscar(matricula);
    }

    public void borrar(Matricula matricula) throws OperationNotSupportedException {
        matriculas.borrar(matricula);
    }

    public Matricula[] getMatriculas() {
        return matriculas.get();
    }

    public Matricula[] getMatriculas(Alumno alumno) {
        return matriculas.get(alumno);
    }

    public Matricula[] getMatriculas(CicloFormativo cicloFormativo) {
        return matriculas.get(cicloFormativo);
    }

    public Matricula[] getMatriculas(String cursoAcademico) {
        return matriculas.get(cursoAcademico);
    }
}
