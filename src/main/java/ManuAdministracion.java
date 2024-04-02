import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ManuAdministracion {
    public static void main(String[] args) {
        int opcionElegida = 0;
        Map<String, Integer> opciones = new HashMap();
        opciones.put("1. Actualizar", 1);
        opciones.put("2. Eliminar", 2);
        opciones.put("3. Agregar", 3);
        opciones.put("4. Listar", 4);
        opciones.put("5. Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        do {
            Object opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Mantenedor de productos",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArreglo,
                    opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionElegida = opciones.get(opcion.toString());
            }

            switch (opcionElegida) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Usarios listados correctamente");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con exito");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionElegida != 5);
    }
}
