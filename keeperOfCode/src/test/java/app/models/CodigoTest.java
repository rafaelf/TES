package app.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CodigoTest {
	String nome = "rafael",linguagem = "JAVA",tags = "main",trecho = "public main()";
	
    @Test public void fakeTest() {
  		assertNotNull("put something real.", new Codigo());
  	}
    
    @Test 
    public void testCodigoNotNull() {
    	Codigo c = new Codigo();
  		assertNotNull(c);
  	}
    
    @Test 
    public void testNewCodigo(){
    	Codigo s = new Codigo();
    	
    	s.setNome(nome);
    	s.setLinguagem(linguagem);
    	s.setTags(tags);
    	s.setTrecho(trecho);
    	assertEquals("rafael", s.getNome());
    	assertEquals("main", s.getTags());
    	assertEquals("public main()", s.getTrecho());
    	assertEquals("JAVA", s.getLinguagem());
    }
    
    @Test 
    public void testNewCodigoCamposNaoNulos(){
    	Codigo s = new Codigo();
    	
    	s.setNome(nome);
    	s.setLinguagem(linguagem);
    	s.setTrecho(trecho);
    	s.setTags(tags);
    	assertNotNull(s.getNome());
    	assertNotNull(s.getTrecho());
    	assertNotNull(s.getTags());
    	assertNotNull(s.getLinguagem());
    }
    
    @Test 
    public void testCodigoCamposNulos(){
    	
    	Codigo c = new Codigo();
    	assertNull(c.getNome());
    	assertNull(c.getTrecho());
    	assertNull(c.getLinguagem());
    	assertNull(c.getTags());
    }
    
    @Test
    public void testCodigoSemCampoNome(){
    	Codigo c = new Codigo();
    	
    	c.setLinguagem(linguagem);
    	c.setTrecho(trecho);
    	c.setTags(tags);
    	assertNull(c.getNome());
    	assertNotNull(c.getTrecho());
    	assertNotNull(c.getTags());
    	assertNotNull(c.getLinguagem());
    	assertEquals("JAVA", c.getLinguagem());
    	assertEquals("main", c.getTags());
    	assertEquals("public main()", c.getTrecho());
    }
    
    @Test
    public void testCodigoSemCampoTrecho(){
    	Codigo c = new Codigo();
    	
    	c.setLinguagem(linguagem);
    	c.setNome(nome);
    	c.setTags(tags);
    	assertNull(c.getTrecho());
    	assertNotNull(c.getNome());
    	assertNotNull(c.getTags());
    	assertNotNull(c.getLinguagem());
    	assertEquals("JAVA", c.getLinguagem());
    	assertEquals("main", c.getTags());
    	assertEquals("rafael", c.getNome());
    }
    
    @Test
    public void testCodigoSemCampoTag(){
    	Codigo c = new Codigo();
    	
    	c.setLinguagem(linguagem);
    	c.setNome(nome);
    	c.setTrecho(trecho);
    	assertNull(c.getTags());
    	assertNotNull(c.getNome());
    	assertNotNull(c.getTrecho());
    	assertNotNull(c.getLinguagem());
    	assertEquals("JAVA", c.getLinguagem());
    	assertEquals("public main()", c.getTrecho());
    	assertEquals("rafael", c.getNome());
    }
    
    @Test
    public void testCodigoSemCampoLinguagem(){
    	Codigo c = new Codigo();
    	
    	c.setTags(tags);
    	c.setNome(nome);
    	c.setTrecho(trecho);
    	assertNull(c.getLinguagem());
    	assertNotNull(c.getNome());
    	assertNotNull(c.getTrecho());
    	assertNotNull(c.getTags());
    	assertEquals("main", c.getTags());
    	assertEquals("public main()", c.getTrecho());
    	assertEquals("rafael", c.getNome());
    }
}

