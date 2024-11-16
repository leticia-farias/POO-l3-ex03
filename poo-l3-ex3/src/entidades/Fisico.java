package entidades;

public class Fisico extends Contribuinte{
	private Double despesas;

	public Fisico(String nome, Double renda, Double despesas) {
		super(nome, renda);
		this.despesas = despesas;
	}

	public Double getDespesas() {
		return despesas;
	}

	public void setDespesas(Double despesas) {
		this.despesas = despesas;
	}
	
	
	@Override
	public Double imposto() {
		if (getRenda() <20000) {
			return ((getRenda() * 0.15) - (despesas * 0.50));
		} else {			
			return ((getRenda() * 0.25) - (despesas * 0.50));
		}
	}
}