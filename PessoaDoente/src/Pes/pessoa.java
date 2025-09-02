package Pes;

public class pessoa {
    public int salarioP;
    salario din;
    remedio remedy = new remedio();
    int diaAtual = 0;
    boolean viva = true;
    
    public pessoa() {
        this.salarioP = 0;
        this.din = new salario(0);
    }
    
    public void receberSalario(int dia) {
        if (dia == 15) {
            salarioP =+ 900;
            din.dinheiro += salarioP;
            
            System.out.println("✓ Salário de R$" + salarioP + " recebido no dia " + dia);
        } else if (dia < 15) {
            salarioP = 0;
        } else {
            System.out.println("✗ Dia " + dia + " - Aguardando próximo pagamento (próximo dia 15)");
            salarioP = 0;
        }
    }
    
    public void ComprarRemedio(int salario) {
    	this.salarioP = salario;
    	if (salario>=remedy.custo ) {
    		remedy.Qtd_Na_Cartela +=10;
    	}
    	
    }
    
    
    public void simularDia(int dia) {
        if (!viva) {
            System.out.println("Já morreu no dia " + diaAtual);
            return;
        }
        
        diaAtual = dia;
        System.out.println("\n=== DIA " + dia + " ===");
        
     
        receberSalario(dia);
        
  
      
        if (din.dinheiro >= remedy.custo) {
            din.dinheiro -= remedy.custo;
            remedy.Qtd_Na_Cartela++;
            System.out.println("✅ Remédio comprado! Cartela: " + remedy.Qtd_Na_Cartela);
        } else if (din.dinheiro > 0) {
            System.out.println(" Dinheiro insuficiente para comprar remédio");
        }
        
        
        if (remedy.Qtd_Na_Cartela > 0) {
            remedy.Qtd_Na_Cartela--;
            System.out.println("Usou um remédio. Sobreviveu mais um dia, doente " + dia);
            System.out.println("sobram : " + remedy.Qtd_Na_Cartela);
        } else {
            viva = false;
            System.out.println("wasted skks " + dia);
        }
        
      
    }
    
    public boolean estaViva() {
        return viva;
    }
}