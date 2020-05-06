package Programacion;

public class Menu {
    //Crear un objeto de la clase que contiene metodos

    //Método que muestra el menú

    public void menu() {
        //Crear variable para usar el switch case validado con el metodo de validarInt
        // int seleccion;
        int seleccion;
        //Menú selección
        System.out.println("Bienvenido a la calculadora, tenemos 7 opciones a elegir\n" +
                "1.-Suma\n2.-Resta\n3.-Multiplicación\n" +
                "4.-División\n5.-Mayor de 2 números\n6.-Calcular potencia de un número\n" +
                "7.-Salir de la calculadora");
        //Se crea una Seleccion no validada
        seleccion = Main.in.nextInt();

        //switch case para menu
        switch (seleccion) {
            //ingresaare los metodos cuando los compañeros tengas lista su parte
            case 1:
                System.out.println("Usted ha seleccionado suma");
                linea();
                break;
            case 2:
                System.out.println("Usted ha seleccionado resta");
                linea();
                break;
            case 3:
                System.out.println("Usted ha seleccionado multiplicación");
                linea();
                break;
            case 4:
                System.out.println("Usted ha seleccionado división");
                linea();
                break;
            case 5:
                System.out.println("Usted ha seleccionado elegir el mayor de 2 numeros");
                linea();
                break;
            case 6:
                System.out.println("Usted ha seleccionado potencia de un numero");
                linea();
                break;
            case 7:
                //salir();
                linea();
                break;
            default:
                System.out.println("La opción ingresada no existe");
        }
    }

    //Decoracion
    public void linea() {
        System.out.println("------------------------------------------------");
    }
    /*
    public void salir() {
        boolean valido = false;
        int eleccion;
        do {
            System.out.println("¿Desea salir de la calculadora? 1=Sí 0=No");
            //agregar eleccion con su metodo en operaciones
            eleccion = ope.validarInt();

            switch (eleccion) {
                case 1:
                    Calculadora.seguir = false;//se debe agregar una clase que contenga metodo seguir
                    valido = true;
                    break;
                case 0:
                    valido = true;
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
            }
        } while(!valido);
     */
}









