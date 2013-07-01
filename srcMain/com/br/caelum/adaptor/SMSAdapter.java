package com.br.caelum.adaptor;

public class SMSAdapter implements SMSSender{

	private static final int MAX_CHARACTERS = 160;

	private EnviadorSMS enviadorSMS;

	public SMSAdapter(EnviadorSMS enviadorSMS){
		this.enviadorSMS = enviadorSMS;
	}

	@Override
	public boolean sendSMS(SMS sms) {
		try {
			String receiver = sms.getReceiver();
			String addressee = sms.getAddressee();
			String[] msg = sliptMessage(sms.getMessage());

			enviadorSMS.sendSMS(addressee, receiver, msg);
		} catch (SMSException e) {
			return false;
		}
		return true;
	}

	private String[] sliptMessage(String message) {
		int messageSize = message.length();
		int arraySize = calculateSize(messageSize);
		String[] msgs = new String[arraySize];

		for(int cont=0; cont < arraySize; cont++){
			int min = cont * MAX_CHARACTERS;
			int max = (cont ==  arraySize - 1) ? messageSize : (cont + 1) * MAX_CHARACTERS;
			msgs[cont] = message.substring(min, max);
		}
		return msgs;
	}

	private int calculateSize(int messageSize) {
		if(messageSize % MAX_CHARACTERS == 0){
			return (messageSize / MAX_CHARACTERS);
		}
		return (messageSize / MAX_CHARACTERS) + 1;
	}
}