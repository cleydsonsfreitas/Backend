
abstract class Conta {
    protected String tipo;
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(">>> Depósito de R$" + valor + " na conta " + tipo);
    }

 
    public void executarSaque(double valor) {
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " concluído. Saldo atual: R$" + saldo);
    }

    public double getSaldo() { return saldo; }
    public String getTipo() { return tipo; }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca() { this.tipo = "Poupança"; }
}

class ContaInvestimento extends Conta {
    public ContaInvestimento() { this.tipo = "Investimento"; }
}


class AspectoVerificacao {
    public static void validarAntesDoSaque(Conta conta, double valor) {
        if (conta.getSaldo() < valor) {
            // O LOG DE ERRO exigido no desafio
            System.err.println("[LOG ERRO] Saldo insuficiente! Conta: " + conta.getTipo() + 
                               " | Tentativa: R$" + valor + " | Saldo: R$" + conta.getSaldo());
            throw new RuntimeException("Operação bloqueada por falta de saldo.");
        }
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        Conta minhaConta = new ContaPoupanca();
        minhaConta.depositar(100.0);

        System.out.println("\n--- Testando Saque Permitido ---");
        realizarOperacao(minhaConta, 50.0);

        System.out.println("\n--- Testando Saque Negado (Gera Log) ---");
        realizarOperacao(minhaConta, 200.0);
    }

    public static void realizarOperacao(Conta c, double valor) {
        try {
          
            AspectoVerificacao.validarAntesDoSaque(c, valor);
            
            
            c.executarSaque(valor);
        } catch (Exception e) {
            System.out.println("Resultado: " + e.getMessage());
        }
    }
}
