package com.blit.Models;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class FrontDeskPIntakes {
	@Column(nullable = false)
	private String FirstName;
	private String MidName;
	@Column(nullable = false)
	private String LastName;
	@Column(nullable = false)
	private int Age;
	@Column(nullable = false)
	private String PayersName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MemberId;
	private String PaymentType;
	private String AsgnProvider;
	@ManyToOne
	private PatientsVitalsModel patientVitalModel;
	
	
	public FrontDeskPIntakes(String firstName, String midName, String lastName, int age, String payersName,
			int memberId, String paymentType, String asgnProvider, PatientsVitalsModel patientVitalModel) {
		super();
		FirstName = firstName;
		MidName = midName;
		LastName = lastName;
		Age = age;
		PayersName = payersName;
		MemberId = memberId;
		PaymentType = paymentType;
		AsgnProvider = asgnProvider;
		this.patientVitalModel = patientVitalModel;
	}
	public FrontDeskPIntakes() {
		super();
	}
	public FrontDeskPIntakes(String firstName, String midName, String lastName, int age, String payersName,
			String paymentType, String asgnProvider, PatientsVitalsModel patientVitalModel) {
		super();
		FirstName = firstName;
		MidName = midName;
		LastName = lastName;
		Age = age;
		PayersName = payersName;
		PaymentType = paymentType;
		AsgnProvider = asgnProvider;
		this.patientVitalModel = patientVitalModel;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMidName() {
		return MidName;
	}
	public void setMidName(String midName) {
		MidName = midName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPayersName() {
		return PayersName;
	}
	public void setPayersName(String payersName) {
		PayersName = payersName;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	public String getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getAsgnProvider() {
		return AsgnProvider;
	}
	public void setAsgnProvider(String asgnProvider) {
		AsgnProvider = asgnProvider;
	}
	public PatientsVitalsModel getPatientVitalModel() {
		return patientVitalModel;
	}
	public void setPatientVitalModel(PatientsVitalsModel patientVitalModel) {
		this.patientVitalModel = patientVitalModel;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Age, AsgnProvider, FirstName, LastName, MemberId, MidName, PayersName, PaymentType,
				patientVitalModel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FrontDeskPIntakes other = (FrontDeskPIntakes) obj;
		return Age == other.Age && Objects.equals(AsgnProvider, other.AsgnProvider)
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& MemberId == other.MemberId && Objects.equals(MidName, other.MidName)
				&& Objects.equals(PayersName, other.PayersName) && Objects.equals(PaymentType, other.PaymentType)
				&& Objects.equals(patientVitalModel, other.patientVitalModel);
	}
	@Override
	public String toString() {
		return "FrontDeskPIntakes [FirstName=" + FirstName + ", MidName=" + MidName + ", LastName=" + LastName
				+ ", Age=" + Age + ", PayersName=" + PayersName + ", MemberId=" + MemberId + ", PaymentType="
				+ PaymentType + ", AsgnProvider=" + AsgnProvider + ", patientVitalModel=" + patientVitalModel + "]";
	}
	
	
	
	
	
		
	
}
