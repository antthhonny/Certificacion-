package com.ejemplo.Certificacion.Model;

public class ContactosModel {

    private String nombre_Contacto ;
    private String apellido_Contacto ;
    private String Apodo_Contacto ;
    private String telefono_Contacto ;
    private String email_Contacto ;
    private String direccion_Contacto ;

    public ContactosModel() {
    }

    public ContactosModel(String apellido_Contacto, String nombre_Contacto, String apodo_Contacto, String telefono_Contacto, String email_Contacto, String direccion_Contacto) {
        this.apellido_Contacto = apellido_Contacto;
        this.nombre_Contacto = nombre_Contacto;
        Apodo_Contacto = apodo_Contacto;
        this.telefono_Contacto = telefono_Contacto;
        this.email_Contacto = email_Contacto;
        this.direccion_Contacto = direccion_Contacto;
    }

    public String getNombre_Contacto() {
        return nombre_Contacto;
    }

    public void setNombre_Contacto(String nombre_Contacto) {
        this.nombre_Contacto = nombre_Contacto;
    }

    public String getApellido_Contacto() {
        return apellido_Contacto;
    }

    public void setApellido_Contacto(String apellido_Contacto) {
        this.apellido_Contacto = apellido_Contacto;
    }

    public String getApodo_Contacto() {
        return Apodo_Contacto;
    }

    public void setApodo_Contacto(String apodo_Contacto) {
        Apodo_Contacto = apodo_Contacto;
    }

    public String getTelefono_Contacto() {
        return telefono_Contacto;
    }

    public void setTelefono_Contacto(String telefono_Contacto) {
        this.telefono_Contacto = telefono_Contacto;
    }

    public String getEmail_Contacto() {
        return email_Contacto;
    }

    public void setEmail_Contacto(String email_Contacto) {
        this.email_Contacto = email_Contacto;
    }

    public String getDireccion_Contacto() {
        return direccion_Contacto;
    }

    public void setDireccion_Contacto(String direccion_Contacto) {
        this.direccion_Contacto = direccion_Contacto;
    }
}
