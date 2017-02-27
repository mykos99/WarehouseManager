
public class Item {
	
	private int id;
	private String short_name;
	private String long_name;
	private double weight;
	
	Item(int id, String short_name, String long_name, double weight){
		this.id = id;
		this.short_name = short_name;
		this.long_name = long_name;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getLong_name() {
		return long_name;
	}

	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
