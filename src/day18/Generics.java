package day18;

public class Generics {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FruitBox<Fruit> fBox1 = new FruitBox<Fruit>();
	}
}
class FruitBox<T>{}
class Fruit implements Eat{}
class Apple extends Fruit {}
class FruitBox<T extends Fruit & Eat>{}
interface Eat{}
