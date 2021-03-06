package org.CabinetMedecin.service;

import org.CabinetMedecin.dao.IMedecinDao;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class TestMedecinService extends TestCase {

	@Test
	public void testAuthentificationMedecin() {

		IMedecinDao dao = Mockito.mock(IMedecinDao.class);
		MedecinService service = new MedecinService();

		Mockito.when(dao.connect("FOBERLAY", "test")).thenReturn(true);
		dao.connect("FOBERLAY", "test");
		boolean valeur_retournée = service.authentification("FOBERLAY", "test");
		Mockito.verify(dao, Mockito.times(1)).connect("FOBERLAY", "test");
		Mockito.verify(dao).connect("FOBERLAY", "test");
		TestCase.assertTrue(valeur_retournée);
	}
}
