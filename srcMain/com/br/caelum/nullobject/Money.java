package com.br.caelum.nullobject;

import java.math.BigDecimal;
import java.math.MathContext;

public final class Money {

	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final String REAL_SIGNAL = "R$";
	private static final MathContext PRECISION = new MathContext(TWO);
	public static final Money MONEY_ZERO_VALUE = new Money(BigDecimal.ZERO); 
	
	private BigDecimal currency;
	
	private Money(){}
	
	private Money(BigDecimal currency){
		this.currency = currency;
	}
	
	public BigDecimal getCurrency(){
		return currency;
	}
	
	public static Money methodFactory(BigDecimal currency){
		if(currency != null){
			return new Money(currency);
		}
		return MONEY_ZERO_VALUE;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s",REAL_SIGNAL, currency.round(PRECISION));
	}
	
	@Override
	public int hashCode(){
		return currency.hashCode() ^ THREE;
	}
	
	@Override
	public boolean equals(Object o){
		if(this == o){
			return true;
		}else if(o instanceof Money){
			Money money = (Money) o;
			return currency.equals(money.getCurrency());
		}
		return false;
	}
}