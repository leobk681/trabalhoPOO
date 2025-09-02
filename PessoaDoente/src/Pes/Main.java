package Pes;

public class Main {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();
        int diaM=14;
        
        for (int dia = diaM; dia <= 30; dia++) {
            pessoa.simularDia(dia);
            
            if (!pessoa.estaViva()) {
                System.out.println("\n A pessoa morreu no dia " + dia);
                break;
            }
            
           
         
        }
        
        if (pessoa.estaViva()) {
            System.out.println("\n🎉 Sobreviveu ao mês inteiro!");
        }
    }
}