package 연습;

public class Std {
	
	private String name;
	private String id;
	private String major;
	private char grade;
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public char getGrade() {
		return grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public Std(){}
	
	public Std(String name,String id, String major,char grade){
		this.name=name;
		this.id=id;
		this.major=major;
		this.grade=grade;
	}
	
	public Std(Std s){
		this(s.name,s.id,s.major,s.grade);
	}
	@Override
	public String toString() {
		return "학생 [이름 : " + name + ", 학번 : " + id + ","
				+ "전공 : " + major + ", 학점 : " + grade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Std other = (Std) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
