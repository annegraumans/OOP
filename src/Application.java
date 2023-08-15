import java.util.ArrayList;
import java.util.List;

public class Application {

	
	// Method
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		// Dit is een method. Het heeft een code block en het heeft een return type.
		// Als Argument heeft een ray van arguments.
//		Abstract class mag je niet aanmaken.		
//		Animal animal1 = new Animal();
//		animal1.setLegs(2);
//		animal1.setName("Kangaroo");
		
		Cat cat1 = new Cat();
		cat1.setLegs(4);
		cat1.setName("Tiger");
		
	//	Bear bear1 = new Bear();
	//	bear1.setLegs(3);
	//	bear1.setName("Winnie de Poeh");
		
		Dog dog1 = new Dog();
		dog1.setLegs(3);
		dog1.setName("Goofy");
		
		bear1.Properties();
		dog1.Properties();
		
		cat1.Smell();
		bear1.Smell();
		dog1.Smell();
		
		List<Animal> animals = new ArrayList<>();
		animals.add(cat1);
		animals.add(new Cat());
		
		animals.forEach(animal -> {
			animal.makeSound();
		});
		
		// ShoppingCart --> lijst van Products - Price - Discount
		//shoppingcart.getProduct().forEach(product -> {
		//	product.getTotalPrice();
		// })
		
	}

}
