package com.kosmos.test.citas.entities;

import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Citas {
    @Id
    @GeneratedValue
    private int clave_cita;
    private String consultorio;
    private String doctor;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora_cita;
    private String nombre_paciente;
    private boolean cancelada;

    public int getClave_cita() {
        return clave_cita;
    }

    public void setClave_cita(int clave_cita) {
        this.clave_cita = clave_cita;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Date getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Date hora_cita) {
        this.hora_cita = hora_cita;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public boolean isCancelada() {
        return cancelada;
    }
    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Citas(String consultorio, String doctor, Date hora_cita, String nombre_paciente, boolean cancelada) {
        this.consultorio = consultorio;
        this.doctor = doctor;
        this.hora_cita = hora_cita;
        this.nombre_paciente = nombre_paciente;
        this.cancelada = cancelada;
    }
    public Citas() {
        super();
    }
}
