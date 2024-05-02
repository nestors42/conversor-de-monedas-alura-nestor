package com.nestorproyecto.menuConversor;

import java.util.Scanner;

public class MenuDeConversor {
        public static void main(String[] args) {

            int opcion = 0;

            String menu = """
                    ****************************************************
                    Sea bienvenido/a al conversor de monedas
                    
                    1) Dólar => Peso Argentino
                    2) Peso Argentino => Dólar
                    3) Dólar => Real Brasileño
                    4) Real Brasileño => Dólar
                    5) Dólar => Peso Colombiano
                    6) Peso Colombiano => Dólar
                    7) Salir
                    
                    Elija una opcion válida:
                    """;
//            realizo un loop para que el menu aparezca si no le doy salir
            Scanner teclado = new Scanner(System.in);
            while (opcion != 7){
                System.out.println(menu);
                opcion = teclado.nextInt();
            }

    }


}
