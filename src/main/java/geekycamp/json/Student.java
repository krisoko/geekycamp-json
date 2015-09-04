package geekycamp.json;

import java.util.Date;
import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIdentityInfo(property="name",generator=ObjectIdGenerators.IntSequenceGenerator.class)
//@JsonSerialize(using=StudentNameSerializer.class)
//@JsonDeserialize(using=StudentNameDeserializer.class)
public class Student {

	private String name;
	private Boolean smoker;
	private Boolean age;
	private Double savings;
	private List<Integer> lotteryNumbers;
	
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-yyyy-MM")
//	@JsonSerialize(using=BirthDateSerializer.class)
//	@JsonDeserialize(using=BirthDateDeserializer.class)
	private Date dateOfBirth;
//	private Student roomMate;
	
//	@JsonIgnore
//	@JsonProperty(value="billingAddress")
//	@JsonUnwrapped
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSmoker() {
		return smoker;
	}
	public void setSmoker(Boolean smoker) {
		this.smoker = smoker;
	}
	public Boolean getAge() {
		return age;
	}
	public void setAge(Boolean age) {
		this.age = age;
	}
	public Double getSavings() {
		return savings;
	}
	public void setSavings(Double savings) {
		this.savings = savings;
	}
	public List<Integer> getLotteryNumbers() {
		return lotteryNumbers;
	}
	public void setLotteryNumbers(List<Integer> lotteryNumbers) {
		this.lotteryNumbers = lotteryNumbers;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
//	@JsonValue
	public String toJSON(){
		return "I am so fancy!";
		
	}
	
}
