public class Main {
    public static void main(String[] args) {

        int numeroIf = -15;
        if (numeroIf < 0){
            System.out.println("El valor es negativo");
        } else if (numeroIf == 0) {
            System.out.printf("el valor es 0");
        }else {
            System.out.println("El valor es positivo");
        }

        //---------------------------------------------------------
        System.out.println("-------------------------\n" +
                "       Ciclo while");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //-----------------------------------------------------------
        System.out.println("-------------------------\n" +
                "       Ciclo Do while");
        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile > 3);

        //-----------------------------------------------------------
        System.out.println("-------------------------\n" +
                "       Ciclo Swhitch");
        var Estacion = "VERANO";
        switch (Estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Estacion por default");
        }

    }



}