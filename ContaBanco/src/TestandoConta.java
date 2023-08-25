import java.util.Scanner;

public class TestandoConta {
    public static void main(String[] args) {
         //declaração de variáveis
         int numeroConta;
            int agencia;
                 String nomeCliente;
        //declarando 'entrada' do tipo Scanner            
        Scanner entrada = new Scanner(System.in);    
           //criação do objeto 'conta' do tipo ContaTerminal
            ContaTerminal conta = new ContaTerminal();
           //obtenção de dados do usuário
            System.out.println("Por favor, insira o seu nome: ");
              nomeCliente = entrada.nextLine();
                conta.setNomeCliente(nomeCliente);
                
            System.out.println("Insira o número da conta: ");
                numeroConta = entrada.nextInt();
                    conta.setNumeroConta(numeroConta);

            System.out.println("Insira a agência sem o dígito: ");
                agencia = entrada.nextInt();
                    conta.setAgencia(agencia);
                        //settando um valor no atributo 'saldo'
                        conta.setSaldo(5000.00);   
                            //chamando o método 'retornarInformacoes'
                            conta.retornarInformacoes();       
    }
}
