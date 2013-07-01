package com.br.caelum.adaptor;

public interface EnviadorSMS {

	void sendSMS(String addressee, String receiver, String [] msg) throws SMSException;
}