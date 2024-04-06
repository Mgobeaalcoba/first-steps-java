import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/main/java/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo); // Carga las propiedades del archivo
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado por script"); // Asigna una propiedad al archivo
            System.setProperties(p); // Asigna las propiedades al sistema para poder listarlas
            System.getProperties().list(System.out); // Lista las propiedades del sistema
            // Imprimir la propiedad que acabo de cargar vía script
            System.out.println("mi.propiedad.personalizada = " + System.getProperty("mi.propiedad.personalizada"));
        } catch (Exception e) {
            System.out.println("No se encontro el archivo = " + e);
        }
    }
}
