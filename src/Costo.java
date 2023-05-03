public class Costo {
    public double valor(int peso,String contenido,String tipo){

        if(tipo.equals("Nacional") || tipo.equals("nacional")){
            if(contenido.equals("Documento") || contenido.equals("documento")){
                if(peso <= 2)return 400;
                else return 600;
            } else if (contenido.equals("Mercancia") || contenido.equals("mercancia")) {
                if(peso <= 5)return 800;
                else return 1000;
            }else System.out.println("No se maneja ese contenido");
        } else if (tipo.equals("Internacional") || tipo.equals("internacional")) {
            if(contenido.equals("Documento") || contenido.equals("documento")){
                if(peso <= 2)return 4000;
                else return 6000;
            } else if (contenido.equals("Mercancia") || contenido.equals("mercancia")) {
                if(peso <= 5)return 9000;
                else return 12000;
            }else System.out.println("No se maneja ese contenido");
        }
        return 0;
    }
}
