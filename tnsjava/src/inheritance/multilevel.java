package inheritance;
class Parent {
	public void showParent() {
			System.out.println("Raju is parent");
	
}
}
class Son extends Parent {
	public void showSon() {
		System.out.println("Ramesh is Raju's son");
}
}
class Daughter extends Parent {
	public void showDaughter() {
		System.out.println("Ramya is Raju's daughter");
}
}
public class multilevel {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.showParent();
		
		Son s = new Son();
		s.showSon();
		
		Daughter d = new Daughter();
		d.showDaughter();
		
	}

}
