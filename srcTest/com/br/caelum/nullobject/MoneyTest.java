package com.br.caelum.nullobject;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMoneyCurrencyEquals() {
		BigDecimal currency = new BigDecimal("2.50");
		BigDecimal currency2 = new BigDecimal("2.51");
		Money money1 = Money.methodFactory(currency);
		Money money2 = Money.methodFactory(currency);
		Money money3 = Money.methodFactory(currency2);
		
		Assert.assertTrue(money1.equals(money2));
		Assert.assertTrue(money2.equals(money1));
		
		Assert.assertFalse(money1.equals(null));
		Assert.assertFalse(money2.equals(null));
		
		Assert.assertFalse(money3.equals(money2));
		Assert.assertFalse(money3.equals(money1));
		Assert.assertFalse(money3.equals(null));
		
	}
	
	@Test
	public void testMoneyCurrencyWhenCurrencyIsNull() {
		BigDecimal currency = null;
		Money money = Money.methodFactory(currency);
		Assert.assertEquals(Money.MONEY_ZERO_VALUE, money);
	}

}
