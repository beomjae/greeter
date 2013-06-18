public class Greeter {
	private Object names;
	
	public Greeter() {
		this.names = "World";
	}

	public void setNames(String names){		
		this.names = names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public void say_hi() {
		if (this.names == "") {
			System.out.println("...");
		} else if(this.names instanceof String[]) {
			for(String name : (String[])this.names) {
				System.out.println("Hello " + name + "!");
			}			
		} else {
			System.out.println("Hello " + this.names + "!");
		}
	}
	
	public void say_bye() {
		if (this.names == "") {
			System.out.println("...");
		} else if(this.names instanceof String[]) {
			String join_names = "";
			for(String name : (String[])this.names) {
				if (join_names != ""){
					join_names += ", ";
				}
				join_names += name;
			}
			System.out.println("Good Bye " + join_names + ". Come back soon!");
		} else {
			System.out.println("Good Bye " + this.names + ". Come back soon!");
		}		
	}

	public static void main(String args[]) {
		Greeter mg = new Greeter();
		mg.say_hi();
		mg.say_bye();

		mg.setNames("Zeke");
		mg.say_hi();
		mg.say_bye();
		
		String[] p_names = {"Albert", "Brenda", "Charles", "Dave", "Engelbert"};
		mg.setNames(p_names);
		mg.say_hi();
		mg.say_bye();
		
		mg.setNames("");
		mg.say_hi();
		mg.say_bye();
	}
}