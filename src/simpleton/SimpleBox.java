package simpleton;

public class SimpleBox {

	public static void main(String[] args) {
		SimpleObject so = new SimpleObject();
		System.out.println(so);
		SimpleObject so2 = new SimpleObject("Cosmo", 16);
		System.out.println(so2);
		
		System.out.println("Working in branchBeta1");
		SimpleObject so3 = new SimpleObject("Filo", 25);
		System.out.println(so3);
	}

}
