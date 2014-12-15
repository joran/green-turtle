package se.js.greenturtle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String uid;
	private String givenName;
	private String surname;
	private String pnr;
	private String email;
	public Account(String uid, String givenName, String surname, String pnr,
			String email) {
		super();
		this.uid = uid;
		this.givenName = givenName;
		this.surname = surname;
		this.pnr = pnr;
		this.email = email;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}
	public String getGivenName() {
		return givenName;
	}
	public String getSurname() {
		return surname;
	}
	public String getPnr() {
		return pnr;
	}
	public String getEmail() {
		return email;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", uid=" + uid + ", givenName="
				+ givenName + ", surname=" + surname + ", pnr=" + pnr
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

	
}
