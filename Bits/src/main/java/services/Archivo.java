package services;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Archivo {

    public static void salvarArchivo(File archivoGuardar, String codigo) throws Exception {
        try {
            if (archivoGuardar != null) {
                BufferedWriter writer = Files
                        .newBufferedWriter(
                                archivoGuardar.toPath(),
                                StandardOpenOption.TRUNCATE_EXISTING
                        );
                writer.write(codigo);
                writer.flush();
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerEntradas(File archivo, String codigo) throws Exception {
        try {
            for (String linea : codigo.split("\n")) {
                //set /p id="Enter ID: "
                if (linea.contains("set /p ")) {
                    System.out.println(linea.substring(linea.indexOf("set /p ")));
                    System.out.println("indice: " + linea.indexOf("set /p "));
                }
            }

            salvarArchivo(archivo, codigo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
