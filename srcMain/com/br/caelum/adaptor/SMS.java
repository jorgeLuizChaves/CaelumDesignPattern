package com.br.caelum.adaptor;

public class SMS {

	private String message;
	private String receiver;
	private String addressee;
	
	public SMS(){
	}
	
	public String getAddressee() {
		return addressee;
	}
	
	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}