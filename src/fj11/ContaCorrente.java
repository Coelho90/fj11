package fj11;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, int agencia, double saldo) {
		super(nome, agencia, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa) {
		// TODO Auto-generated method stub
		super.atualiza(taxa * 2);
	}
}
