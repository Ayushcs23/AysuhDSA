package OOPs;

public class Car {
	String colour;
	int price;
	int speed;
	public Car(String colour,int price,int speed) {
		this.colour=colour;
		this.price=price;
		this.speed=speed;
	}
	public void Displaycar() {
		System.out.println("c "+ colour +"p "+ price +"s "+ speed );
	}
}
