package services;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Archivo {

    public static void salvarArchivo(File archivoGuardar, String codigo) throws Exception {
        try {
            if (archivoGuardar != null) {
                try (BufferedWriter writer = Files
                        .newBufferedWriter(
                                archivoGuardar.toPath(),
                                archivoGuardar.exists() ? StandardOpenOption.TRUNCATE_EXISTING : StandardOpenOption.CREATE
                        )) {
                    writer.write(codigo);
                    writer.flush();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerEntradas(File archivo, String codigo) throws Exception {
        try {
            String codigoTemporal = "";
            for (String linea : codigo.split("\n")) {
                //set /p id="Enter ID: "
                if (linea.contains("set /p ")) {
                    linea = linea.replaceAll("/p", "");
                    String inp = linea.substring(linea.indexOf("\""));
                    String leido = JOptionPane.showInputDialog(null, inp, "c:", JOptionPane.OK_OPTION);
                    linea = linea.replaceAll(inp, leido);
                }
                codigoTemporal += linea + "\n";

            }
//            System.out.println("Código Temporal: " + codigoTemporal);

            salvarArchivo(archivo, codigoTemporal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
