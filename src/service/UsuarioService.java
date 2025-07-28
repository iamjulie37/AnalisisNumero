/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Usuario;
import util.FileUtils;
import java.util.List;

public class UsuarioService {
    private static final String RUTA = "usuarios.txt";

    public static Usuario validarLogin(String login, String password) {
        List<String> lineas = FileUtils.leerArchivo(RUTA);
        for (String linea : lineas) {
            String[] datos = linea.split(";");
            if (datos[0].equals(login) && datos[1].equals(password)) {
                return new Usuario(datos[0], datos[1], Integer.parseInt(datos[2]),
                        datos[3], datos[4], datos[5]);
            }
        }
        return null;
    }
}
