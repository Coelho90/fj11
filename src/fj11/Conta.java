package fj11;

public class Conta {
	private double saldo;
	private String nome;
	private int agencia;

	public double getSaldo() {
		return saldo;
	}

	public Conta(String nome, int agencia, double saldo) {
		super();
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	private void name() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void imprime() {

		System.out.println(nome);
		System.out.println(agencia);
		System.out.println(saldo);

	}

	public void atualiza(double taxa) {
		this.saldo = taxa;

	}

	public boolean saca(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			return true;

		} else {
			return false;
		}
	}
}


