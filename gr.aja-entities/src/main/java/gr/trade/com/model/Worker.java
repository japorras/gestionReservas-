package gr.trade.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="worker")
public class Worker {
	
	
	private long id;
	
	
	private String name;
	
	
	private Company company;
	
	
	private String surname;
	
	
	private String workertype;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="surname")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Column(name="workertype")
	public String getWorkertype() {
		return workertype;
	}

	public void setWorkertype(String workertype) {
		this.workertype = workertype;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="COMPANY_id")
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	
}
