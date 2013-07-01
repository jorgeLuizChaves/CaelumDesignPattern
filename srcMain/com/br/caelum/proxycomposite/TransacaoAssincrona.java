package com.br.caelum.proxycomposite;

public class TransacaoAssincrona implements Transacao {
	
	public static void main(String[] args) {
		Transacao t = new TransacaoSincrona();
		String result = new TransacaoAssincrona(t).executar();
		System.out.println(result);
	}
	
	private Transacao transacao;
	
	public TransacaoAssincrona(Transacao transacao){
		this.transacao = transacao;
	}

	@Override
	public String executar() {
		Runnable run = getRunnable();
		
		Thread job = new Thread(run);
		job.start();
		return "Transacao Assincrona";
	}

	private Runnable getRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				transacao.executar();
			}
		};
	}
}