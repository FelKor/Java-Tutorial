

public class K51A02_Hund extends K51A02_Haustiere{
	
	K51A02_Hund(String name, double futtervorrat) {
		super(name, futtervorrat);
	}

	public void sprich() {
		System.out.println("Wuff!");
	}
	
	public void friss() {
		System.out.println(name + ": " + futtervorrat);
		futtervorrat -= 1;
	}
}
