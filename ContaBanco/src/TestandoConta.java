import java.util.Scanner;

public class TestandoConta {
    public static void main(String[] args) {
         //declara��o de vari�veis
         int numeroConta;
            int agencia;
                 String nomeCliente;
        //declarando 'entrada' do tipo Scanner            
        Scanner entrada = new Scanner(System.in);    
           //cria��o do objeto 'conta' do tipo ContaTerminal
            ContaTerminal conta = new ContaTerminal();
           //obten��o de dados do usu�rio
            System.out.println("Por favor, insira o seu nome: ");
              nomeCliente = entrada.nextLine();
                conta.setNomeCliente(nomeCliente);
                
            System.out.println("Insira o n�mero da conta: ");
                numeroConta = entrada.nextInt();
                    conta.setNumeroConta(numeroConta);

            System.out.println("Insira a ag�ncia sem o d�gito: ");
                agencia = entrada.nextInt();
                    conta.setAgencia(agencia);
                        //settando um valor no atributo 'saldo'
                        conta.setSaldo(5000.00);   
                            //chamando o m�todo 'retornarInformacoes'
                            conta.retornarInformacoes();       
    }
}
