package model;

public class AplicacaoCDB {
	private float prazoEmdias;
	private float aplicacaoInicial;
	private float jurosAnual;
	private float aliquotaImposto;
	
	public AplicacaoCDB(int prazoEmdias, float aplicacaoInicial, float jurosAnual) {
		this.prazoEmdias = prazoEmdias;
		this.aplicacaoInicial = aplicacaoInicial;
		this.jurosAnual = jurosAnual;
		
		if(prazoEmdias <= 180) {
			aliquotaImposto = 22.5F;
		}
		else if(prazoEmdias <= 360) {
			aliquotaImposto = 20;
		}
		else if(prazoEmdias <= 720) {
			aliquotaImposto = 17.5F;
		}
		else {
			aliquotaImposto = 15;
		}
	}

	public float getRendimentoBruto() {
		float tempoAplicacao = prazoEmdias/365;
		float rendimentoBruto = (1+(jurosAnual/100))*aplicacaoInicial - aplicacaoInicial;
		return rendimentoBruto * tempoAplicacao;
	}

	public float getRendimentoLiquido() {
		float rendimentoMenosImposto = getRendimentoBruto() - getValorImpostoRenda();
		float rendimentoLiquido = ((aplicacaoInicial + rendimentoMenosImposto) / aplicacaoInicial * 100);
		return rendimentoLiquido - 100;
	}

	public float getValorImpostoRenda() {
		return getRendimentoBruto() * (aliquotaImposto / 100);
	}

}
