package app.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import app.models.Codigo;

public class CodigoRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new CodigoRepositoryImpl(null));
  	}

    @Test
    /*  public void testBusca() {
    	Codigo c = new Codigo();
        System.out.println("Busca");
        String trecho = "main";
        EntityManager e = null;
        CodigoRepository instance = new CodigoRepositoryImpl(e);
        assertEquals(new ArrayList<Codigo>(), instance.busca(trecho));
    }*/


}

