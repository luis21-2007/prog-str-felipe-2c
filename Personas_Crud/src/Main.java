import java.util.Scanner;

public class Main {
    private static Persona[] personas = new Persona[20];
    private static Scanner leer = new Scanner(System.in);
    private static int contador = 0;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println(" Programa Crud Persona");
            System.out.println("1 Alta");
            System.out.println("2 Buscar por ID Activas");
            System.out.println("3 Baja lógica por ID");
            System.out.println("4 Listar activas");
            System.out.println("5 Actualizar nombre por ID");
            System.out.println("0 Salir");
            System.out.print("Seleccione una opción: ");

            while (!leer.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                leer.next();
            }
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1: altaPersona();
                break;
                case 2: buscarPersona();
                break;
                case 3: bajaLogica();
                break;
                case 4:  listarActivas();
                break;
                case 5: actualizarNombre();
                break;
                case 0: System.out.println("Salir");
                break;
                default: System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }


    private static void altaPersona() {
        if (contador >= personas.length) {
            System.out.println("Error: Arreglo lleno.");
            return;
        }

        System.out.print("Ingrese ID que no sea 0 ");
        int id = leer.nextInt();
        leer.nextLine();

        if (id <= 0) {
            System.out.println("Error: El ID debe ser mayor a 0.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                System.out.println("Error: El ID " + id + " ya existe.");
                return;
            }
        }

        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }

        personas[contador++] = new Persona(id, nombre);
        System.out.println("Persona registrada con éxito.");
    }

    private static void buscarPersona() {
        System.out.print("Ingrese ID a buscar: ");
        int id = leer.nextInt();
        Persona p = encontrarPorId(id);

        if (p != null && p.isActiva()) {
            System.out.println("Resultado: " + p);
        } else {
            System.out.println("No existe  o esta inactiva.");
        }
    }

    private static void bajaLogica() {
        System.out.print("Ingrese ID para dar de baja: ");
        int id = leer.nextInt();
        Persona p = encontrarPorId(id);

        if (p != null && p.isActiva()) {
            p.setActiva(false);
            System.out.println("Baja realizada correctamente.");
        } else {
            System.out.println("No existe o ya está inactiva.");
        }
    }

    private static void listarActivas() {
        System.out.println("--- LISTA DE PERSONAS ACTIVAS ---");
        boolean hayActivas = false;
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].isActiva()) {
                System.out.println(personas[i]);
                hayActivas = true;
            }
        }
        if (!hayActivas) System.out.println("No hay personas activas para mostrar.");
    }

    private static void actualizarNombre() {
        System.out.print("Ingrese ID para actualizar: ");
        int id = leer.nextInt();
        leer.nextLine();
        Persona p = encontrarPorId(id);

        if (p != null && p.isActiva()) {
            System.out.print("Nuevo nombre: ");
            String nuevoNombre = leer.nextLine().trim();
            if (!nuevoNombre.isEmpty()) {
                p.setNombre(nuevoNombre);
                System.out.println("Nombre actualizado.");
            } else {
                System.out.println("Error: Nombre inválido.");
            }
        } else {
            System.out.println(" No existe o está inactiva.");
        }
    }


    private static Persona encontrarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (personas[i] != null && personas[i].getId() == id) {
                return personas[i];
            }
        }
        return null;
    }
}