package SistemaBanco;
public class ContaBanco {
    String num_conta;
    double saldo;
    double cheque_especial;

    ContaBanco(String num_conta,double saldo,double cheque_especial){
        this.num_conta =  num_conta;
        this.saldo = saldo;
        this.cheque_especial = (saldo / 10);
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCheque_especial() {
        return cheque_especial;
    }

    public void setCheque_especial(double cheque_especial) {
        this.cheque_especial = cheque_especial;
    }


}
