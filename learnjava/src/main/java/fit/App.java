package fit;

import java.util.Scanner;

import fit.basics.CalculaImc;

public class App 
{
    public static void main( String[] args )
    {
        Scanner inputUsr = new Scanner(System.in);

        System.out.print("Por favor, informe seu peso: ");
        double peso = Double.parseDouble(inputUsr.nextLine());
        System.out.print("Por favor, informe sua altura: ");
        double altura = Double.parseDouble(inputUsr.nextLine()); 
     
        CalculaImc.calcular(peso, altura);
    }
}
