//classe ContaTerminal que possui o objetivo de simular uma conta banc�ria
public class ContaTerminal {
            //declara��o de atributos
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
      //m�todo retornarInformacoes
    public void retornarInformacoes(){
      /*possui a fun��o de retornar informa��es inseridas
       * durante a execu��o do programa no m�todo 'main'
       */
        System.out.printf("\nOl� %s, obrigado por criar uma conta em nosso banco!", getNomeCliente());
            System.out.printf("\nA sua ag�ncia �: %d", getAgencia());
                System.out.printf("\nN�mero da sua conta: %d", getNumeroConta());
                    System.out.printf("\nE o seu saldo: "+getSaldo()+" j� est� dispon�vel");
    }
}
