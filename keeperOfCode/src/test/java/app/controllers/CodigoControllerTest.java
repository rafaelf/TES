package app.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import app.models.Codigo;
import app.repositories.CodigoRepository;
import app.repositories.CodigoRepositoryImpl;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

public class CodigoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new CodigoController(null, null, null));
 	}
	
	   @Test
	    public void testIndex() {
			Result r = null;
			Validator v = null;
			CodigoRepository rs = null;
	        System.out.println("index");
	        Codigo c = new Codigo();
	        CodigoController instance = new CodigoController(r,rs,v);
	        List<Codigo> expResult = new ArrayList<Codigo>();
	        List result = instance.index(c, expResult);
	        assertEquals(expResult, result);
	    }
	   
	   @Test 
	   public void controllerNotNull(){
			Result r = null;
			Validator v = null;
			CodigoRepository rs = null;
			CodigoController cc = new CodigoController(r,rs,v);
			assertNotNull(cc);
		}
	   
		@Test 
		public void testNewSnippet(){
			Result r = null;
			Validator v = null;
			EntityManager e = null;
			CodigoRepository sr = new CodigoRepositoryImpl(e);
			CodigoController sc = new CodigoController(r,sr,v);
			
			Codigo s = new Codigo();
			assertEquals(s,sc.newCodigo());
		}
}
