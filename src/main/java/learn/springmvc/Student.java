package learn.springmvc;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private List<String> countryList;
	private String favLanguage;
	private List<String> favLanguageList;
	private String[] operatingSystems;
	

	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public List<String> getFavLanguageList() {
		return favLanguageList;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public List<String> getCountryList() {
		return countryList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
		
		countryList = new ArrayList<>();
		countryList.add("India");
		countryList.add("USA");
		countryList.add("South Africa");
		countryList.add("Kenya");
		countryList.add("Pakistan");
		
		favLanguageList = new ArrayList<>();
		favLanguageList.add("JAVA");
		favLanguageList.add("C++");
		favLanguageList.add("Python");
	}

}
