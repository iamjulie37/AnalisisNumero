/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Usuario {
    private String login, password, nombre, apellidos, email;
    private int nivelAcceso;

    public Usuario(String login, String password, int nivelAcceso,
                   String nombre, String apellidos, String email) {
        this.login = login;
        this.password = password;
        this.nivelAcceso = nivelAcceso;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public int getNivelAcceso() { return nivelAcceso; }
    public String getNombre() { return nombre; }
}
