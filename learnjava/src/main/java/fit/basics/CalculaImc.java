package fit.basics;

public class CalculaImc {

    public static void calcular(Double peso, Double altura) {

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
 
        if(imc < 18.5){
            System.out.println("Sua classificação é Magreza!");  
        }
        else if((imc < 24.9)){
            System.out.println("Sua classificação é Normal!");  
        }
        else if((imc < 30)){
            System.out.println("Sua classificação é Sobrepeso!");  
        }
        else{
            System.out.println("Sua classificação é Obesidade!");  
        }
        System.out.println("\n");
    }
}
