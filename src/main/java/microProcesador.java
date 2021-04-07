import java.util.Scanner;
import java.lang.Math;
public class microProcesador {
    public static void main(String[] args){
        boolean ingresarBinario = false;
        System.out.println("¡Bienvenido al microprocesador Ufro! \n");
        ingresarBinario = preguntarPorBinario();
        int numeroDec = leerNumero();
        int[] numeroBin = new int[8];
        boolean numeroValido = false;
        if (!ingresarBinario) {
            numeroValido = validarNumero(numeroDec);
        }else{
            numeroBin = llenarListaBin(numeroDec);
            numeroValido = validarBinario8Bits(numeroBin);
        }
        if(!numeroValido){
            numeroDec = leerNumero();
        }
    }

    public static boolean preguntarPorBinario(){
        System.out.println("¿Qué tipo de número desea ingresar? (1. Decimal, 2. Binario)");
        Scanner leer = new Scanner(System.in);
        String opcion = leer.nextLine();
        boolean esBinario = false;
        switch(opcion) {
            case "1":
                break;
            case "2":
                esBinario = true;
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        return esBinario;
    }

    public static int leerNumero( ){
        Scanner leer = new Scanner(System.in);
        int numEntrada = 0;
        System.out.println("Ingrese su número");
        try{
            numEntrada = leer.nextInt();
        }catch (Exception e) {
            System.out.println("Error: entrada no válida");
            if (leer.hasNextInt()) leer.nextInt();
            leerNumero();
        }
        return numEntrada;
    }

    public static boolean validarNumero(int numero){
        boolean numValido = true;
        if(numero < 0 || numero > 255){
            numValido = false;
            System.out.println("Error! Número fuera del rango permitido");
        }
        return numValido;
    }

    public static int[] llenarListaBin(int numero){
        int[] lista = new int[8];
        for(int i=(lista.length)-1; i<0; i--){
            lista[i] = numero - (numero % (Math.pow(10,i));
        }
        return lista;
    }

    public static boolean validarBinario8Bits(int [] numBin ){
        boolean binValido = true;
        for(int i=0; i<numBin.length; i++){
            if(numBin[i] > 1){
                binValido = false;
            }
        }
        return binValido;
    }

    public static int convertirEntero(int numBin [] ){

    }

    public static int [] convertirBinario8Bits(int num){

    }

    public static void imprimirNumBinario8Bits(int [] numBin){

    }

    public static void imprimirNumDecimal(int numero){

    }
}
