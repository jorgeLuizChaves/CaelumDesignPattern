package com.br.caelum.chainofresponsability;

import java.io.File;
import org.junit.Assert;
import org.junit.Test;

public class RecuperadorCacheMemoriaTest {
	
	private static final String FILE_NAME_DB = "db";
	private static final String KEY_FILE_NAME = "key";
	private static final String FILE_NAME_CACHE = "xfile";
	
	@Test(expected=RuntimeException.class)
	public void testRecuperarOnCacheDontFindAndNextIsNull() {
		RecuperadorArquivo recuperador = new RecuperadorCacheMemoria(null);
		File fileRecovered = recuperador.recuperar(FILE_NAME_CACHE);
		Assert.assertNull(fileRecovered);
	}
	
	@Test
	public void testRecuperarOnCache() {
		File fileCached = new File(FILE_NAME_CACHE);
		RecuperadorCacheMemoria recuperador = new RecuperadorCacheMemoria(null);
		recuperador.addInCache(KEY_FILE_NAME, fileCached);
		File fileRecovered = recuperador.recuperar(KEY_FILE_NAME);
		Assert.assertEquals(fileCached, fileRecovered);
	}
	
	@Test
	public void testRecuperarOnDB() {
		File fileCached = new File(FILE_NAME_DB);
		RecuperadorArquivo recuperadorDB = new RecuperadorDataBase(null);
		RecuperadorArquivo recuperador = new RecuperadorCacheMemoria(recuperadorDB);
		File fileRecovered = recuperador.recuperar(KEY_FILE_NAME);
		Assert.assertEquals(fileCached, fileRecovered);
	}
}