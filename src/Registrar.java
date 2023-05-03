import java.util.Scanner;

public class Registrar {
    public PaqueteDeEnvio [] llenar (Scanner scanner){
        System.out.println("Ingresa el numero de envios a realizar: ");
        int cantEnvios = scanner.nextInt();

        PaqueteDeEnvio [] envios = new PaqueteDeEnvio[cantEnvios];

        for (int i = 0; i < envios.length; i++) {
            System.out.println("Ingresa el nombre del remitente: ");
            String nombre = scanner.next();
            System.out.println("Ingresa el apellido del remitente: ");
            String apellidoRemitente = scanner.next();
            System.out.println("Ingresa el numero del documento: ");
            int numDocIdentidad = scanner.nextInt();
            System.out.println("Ingresa su direccion: ");
            String direccion = scanner.next();
            System.out.println("Ingresa su numero de telefono: ");
            int telefono = scanner.nextInt();
            System.out.println("Ingresa el nombre del destinatario: ");
            String nombreDes = scanner.next();
            System.out.println("Ingresa el apellido del destinatario: ");
            String apellidoDes = scanner.next();
            System.out.println("Ingresa el numero del documento: ");
            int numDocIdentidadDes = scanner.nextInt();
            System.out.println("Ingresa su direccion: ");
            String direccionDes = scanner.next();
            System.out.println("Ingresa su numero de telefono: ");
            int telefonoDes = scanner.nextInt();System.out.println("Ingresa el tipo de envio: ");
            String tipoEnvio = scanner.next();
            System.out.println("Ingresa el contenido del envio: ");
            String contenido = scanner.next();
            System.out.println("Ingresa el peso del contenido: ");
            int peso = scanner.nextInt();

            envios [i] = new PaqueteDeEnvio(new PaqueteDeEnvio.Persona(nombre,apellidoRemitente,numDocIdentidad,direccion,telefono),
                    new PaqueteDeEnvio.Persona(nombreDes,apellidoDes,numDocIdentidadDes,direccionDes,telefonoDes),tipoEnvio,contenido,peso);
        }
        return envios;
    }
}
