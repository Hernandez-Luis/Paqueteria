public class Mostrar {
    public void muestra(PaqueteDeEnvio [] envios){
        Costo costo = new Costo();

        for (PaqueteDeEnvio envio:envios) {
            System.out.println("<>><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n");
            System.out.println("\t\t- - D A T O S  D E L  E N V I O - -");
            System.out.println("\n<><><><>><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n");
            System.out.println("Nombre del remitente: " + envio.getRemitente().nombre + " " + envio.getRemitente().apellido);
            System.out.println("Nombre del destinatario: " + envio.getDestinatario().nombre + " " + envio.getDestinatario().apellido);
            System.out.println("Tipo de envio: " + envio.getTipoEnvio());
            System.out.println("Contendio: " + envio.getContenido());
            System.out.println("Peso del contenido: " + envio.peso);
            System.out.println("Costo: " + costo.valor(envio.getPeso(),envio.getContenido(),envio.getTipoEnvio()));
        }
    }
}
