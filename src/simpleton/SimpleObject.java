package simpleton;

public class SimpleObject {
	private String name;
	private int size;
	
	public SimpleObject(String name, int size){
		this.name = name;
		this.size = size;
	}
	
	public SimpleObject(){
		this("Bruckno", 64);
	}
	
	public SimpleObject(String name){
		this(name, 64);
	}
	
	public SimpleObject(int size){
		this("Bruckno", size);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "SimpleObject [name=" + name + ", size=" + size + "]";
	}

}
