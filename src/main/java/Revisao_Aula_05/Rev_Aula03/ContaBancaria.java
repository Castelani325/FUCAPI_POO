package Revisao_Aula_05.Rev_Aula03;

public class ContaBancaria {
        String numeroConta;
        double saldo;

        public ContaBancaria(String num, double saldInicial) {
            this.numeroConta = num;
            this.saldo = saldInicial;
        }


        public void depositar(double valor) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + "\n realizado.\n Novo saldo: " + this.saldo);
        }

        public void sacar(double valor) {
             if (saldo >= valor) {
                 this.saldo -= valor;
                 System.out.println("Saque de " + valor + "\n realizado. Novo saldo: " + this.saldo);
             } else {
                 System.out.println("Saldo insuficiente para saque de " + valor + "\n Saldo atual: " + this.saldo);
             }
        }
    }

