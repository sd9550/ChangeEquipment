import java.util.Scanner;

public class Initialize {
	
		private Scanner scan = new Scanner(System.in);
		private boolean exit = false;
		private String entry;
		private Weapons weapons = new Weapons();
		private Armor armor = new Armor();

		public Initialize() {
			System.out.println("ChangeEquipment Program");
			
			// main menu loop, continues until quit command is entered
			do {
				System.out.println("Command: e - view equipment, i - view inventory, c - change equipment, q = quit");
				System.out.print("Enter a command >>");
				
				entry = scan.nextLine();
					
				if(entry.equals("e")) {
					System.out.println("Weapon: " + weapons.getEquipmentName() + " - Damage: " + weapons.getAttackRating() + "\n" + weapons.getEquipmentDesc()  + "\nArmor: " + armor.getEquipmentName() + " - Defense: " + armor.getDefenseRating() + "\n" + armor.getEquipmentDesc());
				} else if(entry.equals("i")) {
					weapons.getAllWeaponsMulti();
					armor.displayAllArmor();
				} else if(entry.equals("c")) {
					changeEquipment();
				} else if(entry.equals("q")) {
					exit = true;
				} else {
					
				}
			} while(!exit);
			
			scan.close();
			System.out.println("\nProgram terminated");
		}
		
		public void changeEquipment() {
			boolean valid = false;
			int num;
			String[] weap, arm;
			
			// loop until a valid entry is entered
			do {
				System.out.print("w to change weapon, a to change armor, q to quit >>");
				entry = scan.nextLine();
				if(entry.equals("w") || entry.equals("a") || entry.equals("q")) {
					valid = true;
				} else {
					System.out.println("Invalid entry");
				}
			} while(!valid);
			
			if(entry.equals("q")) {
				return;
			}
			
			valid = false;
			weap = weapons.getAllWeapons();
			arm = armor.getAllArmor();
			
			// loop until a valid entry is entered
			do {
				if(entry.equals("w")) {
					for(int x = 0; x < weap.length; ++x) {
						System.out.println((x + 1) + ". " + weap[x]);
					}
					System.out.print("Enter a number to change currently equipped weapon: " + weapons.getEquipmentName() + ", q to quit >>");
					entry = scan.nextLine();
					
					if(entry.equals("q")) {
						return;
					}
					
					try {
						num = Integer.parseInt(entry);
						if(num > 0 && num < weap.length) {
							valid = true;
							weapons.changeWeapon(weap[--num]);
							System.out.println("Weapon was changed to " + weap[num]);
						} else {
							System.out.println("Please enter a valid number");
						}
					} catch(Exception e) {
						System.out.println("Error detected: " + e.getMessage());
					}
				} else {
					for(int x = 0; x < arm.length; ++x) {
						System.out.println((x + 1) + ". " + arm[x]);
					}
					System.out.print("Enter a number to change currently equipped armor: " + armor.getEquipmentName() + ", q to quit >>");
					entry = scan.nextLine();
					
					if(entry.equals("q")) {
						return;
					}
					
					try {
						num = Integer.parseInt(entry);
						if(num > 0 && num < weap.length) {
							valid = true;
							armor.changeArmor(arm[--num]);
							System.out.println("Armor was changed to " + arm[num]);
						} else {
							System.out.println("Please enter a valid number");
						}
					} catch(Exception e) {
						System.out.println("Error detected: " + e.getMessage());
					}
				}
			} while(!valid);
			
		}
}

// souls of the lost, withdrawn from its vessel
// let strength be granted, so the world might be mended
// so the world might be mended
