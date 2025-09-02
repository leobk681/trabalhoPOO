package Pes;

public class Main {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();
        int diaM=14;
        
        for (int dia = diaM; dia <= 30; dia++) {
            pessoa.simularDia(dia);
            
            if (!pessoa.estaViva()) {
                System.out.println("\n💀 FIM: A pessoa morreu no dia " + dia);
                break;
            }
            
           
            /*try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        
        if (pessoa.estaViva()) {
            System.out.println("\n🎉 Sobreviveu ao mês inteiro!");
        }
    }
}