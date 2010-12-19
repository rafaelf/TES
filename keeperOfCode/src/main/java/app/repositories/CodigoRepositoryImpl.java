package app.repositories;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import app.models.Codigo;

import java.util.List;
import javax.persistence.Query;


@Component
public class CodigoRepositoryImpl 
    extends Repository<Codigo, Long>
    implements CodigoRepository {

	public CodigoRepositoryImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Codigo> busca(String trecho) {
		String t = "%"+ trecho + "%";
		Query q = entityManager.createQuery("From Codigo " + "where trecho like :trecho" );
		q.setParameter("trecho", t);  
	 return  (List<Codigo>)q.getResultList();
		
		
		
	}
}
