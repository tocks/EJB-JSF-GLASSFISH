package org.jupiter.beans;

import java.util.List;

import javax.ejb.Remote;

import org.jupiter.entities.Company;

@Remote
public interface CompanyBeanRemote {
	public void addCompany(Company company);

	public Company findCompany(int id);

	public void updateCompany(Company company);

	public void deleteCompany(Company company);

	public List<Company> findAllCompanies();

}
