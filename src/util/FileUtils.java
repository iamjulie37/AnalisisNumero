/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.*;
import java.util.*;

public class FileUtils {
    public static List<String> leerArchivo(String ruta) {
        List<String> lineas = new ArrayList<>();
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            return lineas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return lineas;
    }
}

