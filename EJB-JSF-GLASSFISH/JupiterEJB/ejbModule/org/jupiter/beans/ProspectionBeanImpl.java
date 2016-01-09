package org.jupiter.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jupiter.entities.Prospection;

/**
 * Session Bean implementation class ProspectionBeanImpl
 */
@Stateless
public class ProspectionBeanImpl implements ProspectionBeanRemote, ProspectionBeanLocal {

	@PersistenceContext(unitName = "JUPITER_PU")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public ProspectionBeanImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addProspection(Prospection prospect) {
		em.persist(prospect);
	}

	@Override
	public Prospection findProspection(int id) {
		Prospection prospect = em.find(Prospection.class, id);
		return prospect;
	}

	@Override
	public void updateProspection(Prospection prospect) {
		em.merge(prospect);
	}

	@Override
	public void deleteProspectio(Prospection prospect) {
		em.remove(prospect);
	}

	@Override
	public List<Prospection> findAllProsectons() {
		Query query = em.createQuery("SELECT p FROM Prospection p");
		return query.getResultList();
	}
}
