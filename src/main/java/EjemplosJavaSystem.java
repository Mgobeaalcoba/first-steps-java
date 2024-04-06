import java.util.Properties;

public class EjemplosJavaSystem {
    public static void main(String[] args) {
        System.out.println("Ejemplos de la clase System");
        System.out.println("Variables de entorno del sistema");
        System.out.println("java_home = " + System.getenv("JAVA_HOME")); // JAVA_HOME es una variable de entorno del sistema
        System.out.println("path = " + System.getenv("PATH")); // PATH es una variable de entorno del sistema
        System.out.println("username = " + System.getenv("USERNAME")); // USERNAME es una variable de entorno del sistema
        System.out.println("java_home = " + System.getenv("JAVA_HOME")); // JAVA_HOME es una variable de entorno del sistema

        // Traemos las propiedades del sistema
        System.out.println("java_home = " + System.getProperty("java.home")); // java.home es una propiedad del sistema
        System.out.println("user.home = " + System.getProperty("user.home")); // user.home es una propiedad del sistema
        System.out.println("user.dir = " + System.getProperty("user.dir")); // user.dir es una propiedad del sistema
        System.out.println("os.name = " + System.getProperty("os.name")); // os.name es una propiedad del sistema
        System.out.println("os.version = " + System.getProperty("os.version")); // os.version es una propiedad del sistema
        System.out.println("os.arch = " + System.getProperty("os.arch")); // os.arch es una propiedad del sistema
        System.out.println("java.version = " + System.getProperty("java.version")); // java.version es una propiedad del sistema
        System.out.println("java.vendor = " + System.getProperty("java.vendor")); // java.vendor es una propiedad del sistema
        System.out.println("java.vendor.url = " + System.getProperty("java.vendor.url")); // java.vendor.url es una propiedad del sistema
        System.out.println("java.class.path = " + System.getProperty("java.class.path")); // java.class.path es una propiedad del sistema
        System.out.println("java.class.version = " + System.getProperty("java.class.version")); // java.class.version es una propiedad del sistema
        System.out.println("java.compiler = " + System.getProperty("java.compiler")); // java.compiler es una propiedad del sistema
        System.out.println("java.ext.dirs = " + System.getProperty("java.ext.dirs")); // java.ext.dirs es una propiedad del sistema
        System.out.println("java.library.path = " + System.getProperty("java.library.path")); // java.library.path es una propiedad del sistema
        System.out.println("java.specification.name = " + System.getProperty("java.specification.name")); // java.specification.name es una propiedad del sistema
        System.out.println("java.specification.vendor = " + System.getProperty("java.specification.vendor")); // java.specification.vendor es una propiedad del sistema
        System.out.println("java.specification.version = " + System.getProperty("java.specification.version")); // java.specification.version es una propiedad del sistema
        System.out.println("java.vm.name = " + System.getProperty("java.vm.name")); // java.vm.name es una propiedad del sistema
        System.out.println("java.vm.specification.name = " + System.getProperty("java.vm.specification.name")); // java.vm.specification.name es una propiedad del sistema
        System.out.println("java.vm.specification.vendor = " + System.getProperty("java.vm.specification.vendor")); // java.vm.specification.vendor es una propiedad del sistema
        System.out.println("java.vm.specification.version = " + System.getProperty("java.vm.specification.version")); // java.vm.specification.version es una propiedad del sistema
        System.out.println("java.vm.vendor = " + System.getProperty("java.vm.vendor")); // java.vm.vendor es una propiedad del sistema
        System.out.println("java.vm.version = " + System.getProperty("java.vm.version")); // java.vm.version es una propiedad del sistema
        System.out.println("line.separator = " + System.getProperty("line.separator")); // line.separator es una propiedad del sistema
        System.out.println("path.separator = " + System.getProperty("path.separator")); // path.separator es una propiedad del sistema
        System.out.println("file.separator = " + System.getProperty("file.separator")); // file.separator es una propiedad del sistema
        System.out.println("user.name = " + System.getProperty("user.name")); // user.name es una propiedad del sistema
        System.out.println("user.language = " + System.getProperty("user.language")); // user.language es una propiedad del sistema
        System.out.println("user.country = " + System.getProperty("user.country")); // user.country es una propiedad del sistema
        System.out.println("user.timezone = " + System.getProperty("user.timezone")); // user.timezone es una propiedad del sistema
        System.out.println("user.variant = " + System.getProperty("user.variant")); // user.variant es una propiedad del sistema
        System.out.println("file.encoding = " + System.getProperty("file.encoding")); // file.encoding es una propiedad del sistema
        System.out.println("java.io.tmpdir = " + System.getProperty("java.io.tmpdir")); // java.io.tmpdir es una propiedad del sistema
        System.out.println("java.home = " + System.getProperty("java.home")); // java.home es una propiedad del sistema
        System.out.println("java.runtime.name = " + System.getProperty("java.runtime.name")); // java.runtime.name es una propiedad del sistema
        System.out.println("java.runtime.version = " + System.getProperty("java.runtime.version")); // java.runtime.version es una propiedad del sistema
        System.out.println("java.specification.version = " + System.getProperty("java.specification.version")); // java.specification.version es una propiedad del sistema
        System.out.println("java.vm.info = " + System.getProperty("java.vm.info")); // java.vm.info es una propiedad del sistema

        // Todas las propiedades del sistema
        System.out.println(" ");
        System.out.println(" ... Todas las propiedades del sistema 1° Forma... ");
        Properties propiedades = System.getProperties();
        propiedades.forEach((k, v) -> {
            System.out.println(k + " = " + v); // Imprime las propiedades del sistema en la consola usando un forEach donde k es la clave y v es el valor
        });

        // Todas las propiedades del sistema 2° Forma
        System.out.println(" ");
        System.out.println(" ... Todas las propiedades del sistema 2° Forma... ");
        propiedades.list(System.out); // Imprime las propiedades del sistema en la consola usando el método list de la clase Properties

    }
}
