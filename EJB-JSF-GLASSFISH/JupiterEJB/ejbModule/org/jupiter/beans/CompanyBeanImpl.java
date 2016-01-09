package org.jupiter.beans;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.jupiter.entities.Company;
/**
 * @author Boubacar KOITA alias Tocka
 */

/**
 * Session Bean implementation class CompanyBeanImpl
 */
@Stateless
public class CompanyBeanImpl implements CompanyBeanRemote, CompanyBeanLocal {

	@PersistenceContext(unitName = "JUPITER_PU")
	private EntityManager em;

	/**
	 * Default constructor.
	 */
	public CompanyBeanImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCompany(Company company) {
		em.persist(company);
	}

	@Override
	public Company findCompany(int id) {
		Company company = em.find(Company.class, id);
		return company;
	}

	@Override
	public void updateCompany(Company company) {
		em.merge(company);
	}

	@Override
	public void deleteCompany(Company company) {
		em.remove(company);
	}

	@Override
	public List<Company> findAllCompanies() {
		Query query = em.createQuery("SELECT c FROM Company c");
		return query.getResultList();
	}

}
