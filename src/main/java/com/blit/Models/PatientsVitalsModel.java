package com.blit.Models;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class PatientsVitalsModel {
	@Column(nullable = false)
	private int Height;
	@Column(nullable = false)
	private int Weight;
	@Column(nullable = false)
	private int BloodPresure;
	@Column(nullable = false)
	private int PulseRate;
	@Column(nullable = false)
	private int Temperature;
	@Column(nullable = false)
	private String Symptoms;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MemberId;
	
	@OneToMany
	List<FrontDeskPIntakes> frontDeskPIntakes;
	public PatientsVitalsModel(int height, int weight, int bloodPresure, int pulseRate, int temperature,
			String symptoms, int memberId, List<FrontDeskPIntakes> frontDeskPIntakes) {
		super();
		Height = height;
		Weight = weight;
		BloodPresure = bloodPresure;
		PulseRate = pulseRate;
		Temperature = temperature;
		Symptoms = symptoms;
		MemberId = memberId;
		this.frontDeskPIntakes = frontDeskPIntakes;
	}
	public PatientsVitalsModel() {
		super();
	}
	public PatientsVitalsModel(int height, int weight, int bloodPresure, int pulseRate, int temperature,
			String symptoms, List<FrontDeskPIntakes> frontDeskPIntakes) {
		super();
		Height = height;
		Weight = weight;
		BloodPresure = bloodPresure;
		PulseRate = pulseRate;
		Temperature = temperature;
		Symptoms = symptoms;
		this.frontDeskPIntakes = frontDeskPIntakes;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public int getBloodPresure() {
		return BloodPresure;
	}
	public void setBloodPresure(int bloodPresure) {
		BloodPresure = bloodPresure;
	}
	public int getPulseRate() {
		return PulseRate;
	}
	public void setPulseRate(int pulseRate) {
		PulseRate = pulseRate;
	}
	public int getTemperature() {
		return Temperature;
	}
	public void setTemperature(int temperature) {
		Temperature = temperature;
	}
	public String getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String symptoms) {
		Symptoms = symptoms;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	public List<FrontDeskPIntakes> getFrontDeskPIntakes() {
		return frontDeskPIntakes;
	}
	public void setFrontDeskPIntakes(List<FrontDeskPIntakes> frontDeskPIntakes) {
		this.frontDeskPIntakes = frontDeskPIntakes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(BloodPresure, Height, MemberId, PulseRate, Symptoms, Temperature, Weight,
				frontDeskPIntakes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientsVitalsModel other = (PatientsVitalsModel) obj;
		return BloodPresure == other.BloodPresure && Height == other.Height && MemberId == other.MemberId
				&& PulseRate == other.PulseRate && Objects.equals(Symptoms, other.Symptoms)
				&& Temperature == other.Temperature && Weight == other.Weight
				&& Objects.equals(frontDeskPIntakes, other.frontDeskPIntakes);
	}
	@Override
	public String toString() {
		return "PatientsVitalsModel [Height=" + Height + ", Weight=" + Weight + ", BloodPresure=" + BloodPresure
				+ ", PulseRate=" + PulseRate + ", Temperature=" + Temperature + ", Symptoms=" + Symptoms + ", MemberId="
				+ MemberId + ", frontDeskPIntakes=" + frontDeskPIntakes + "]";
	}
	
	
	
}





