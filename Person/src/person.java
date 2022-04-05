
public class person {

	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/
	private String name;
	private int birthYear;
	public person (String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}


	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	   }

}
