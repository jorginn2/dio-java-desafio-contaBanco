//classe ContaTerminal que possui o objetivo de simular uma conta bancária
public class ContaTerminal {
            //declaração de atributos
            public int numeroConta;
                public int agencia;
                    public String nomeCliente;
                        private double saldo;

    public ContaTerminal(){
    }
     //getters e setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }  
      //método retornarInformacoes
    public void retornarInformacoes(){
      /*possui a função de retornar informações inseridas
       * durante a execução do programa no método 'main'
       */
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!", getNomeCliente());
            System.out.printf("\nA sua agência é: %d", getAgencia());
                System.out.printf("\nNúmero da sua conta: %d", getNumeroConta());
                    System.out.printf("\nE o seu saldo: "+getSaldo()+" já está disponível");
    }
}
