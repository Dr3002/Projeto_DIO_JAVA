## 🏦 Sistema Bancário em Java

Este projeto é um simulador simples de conta bancária desenvolvido em Java.
Ele permite criar uma conta, consultar saldo e verificar o cheque especial,
com possibilidade de futuras implementações para depósitos, saques e pagamento de boletos.

========================================================
📋 Funcionalidades Implementadas

- Criar Conta: permite cadastrar uma conta bancária informando número,
  saldo inicial e se possui cheque especial.
- Consultar Saldo: exibe o saldo atual da conta.
- Consultar Cheque Especial: mostra o valor disponível no cheque especial, se houver.

⚠️ Algumas opções de menu (depósito, saque e pagamento de boleto)
   ainda não estão implementadas, mas já estão reservadas no código.

========================================================
🧠 Lógica do Sistema

O programa roda em um loop (while) que exibe um menu de opções para o usuário:

1 - Criar Conta
2 - Consultar Saldo
3 - Consultar Cheque Especial
4 - Depositar Dinheiro
5 - Sacar Dinheiro
6 - Pagar Boleto
7 - Verificar Cheque Especial
0 - SAIR

Cada opção aciona um método específico. Por exemplo:

- CriarConta() → cria e retorna uma nova conta do tipo ContaBanco.
- ConsultarSaldo() → exibe o saldo da conta criada.
- ConsultarChequeEsp() → verifica se a conta possui cheque especial e exibe o valor.

========================================================
▶️ Como Executar

1. Certifique-se de ter o Java instalado (versão 8 ou superior).
2. Compile as classes:
   javac Main.java ContaBanco.java
3. Execute o programa:
   java Main
4. Interaja com o menu no terminal.

========================================================
🧑‍💻 Autor

Daniel Ribeiro Alcântara Marques
💼 GitHub: Dr3002
