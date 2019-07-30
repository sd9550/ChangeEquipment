
public class Armor extends Equipment {
		
		private String[] miscArmor = {"Naked"};
		private String miscDesc = "Unclothed enigma. Perhaps had their clothing stolen.";
		private String[] lightArmor = {"Leather Armor", "Sorcerer's Robe", "Moon Butterfly Set"};
		private String[] heavyArmor = {"Iron Armor", "Stone Armor", "Steel Armor"};
		private String[][] allArmor = {lightArmor, heavyArmor};
		
		private int[] lightArmorDefense = {3, 1, 2};
		private int[] heavyArmorDefense = {5, 6, 7};
		private int[][] allArmorDefense = {lightArmorDefense, heavyArmorDefense};
		
		private String[] lightArmorDesc = {"This armor made of smooth black leather is extremely quiet, a good thing for those who hide in the shadows.", "Cloak worn by proper sorcerers who studied at Vinheim Dragon School.", "Armor made from wings of the rare moon butterfly. Poisons those who aproach the wearer."};
		private String[] heavyArmorDesc = {"Armor of a lower-rank knight. Despite the thin metal used, the grooved textures give it added protection.", "Moss-covered armor of the Stone Knight, defender of the  Darkroot Garden.", "Armor of the Knights of Berenike, known for their heavy arnaments and armor."};
		private String[][] allArmorDesc = {lightArmorDesc, heavyArmorDesc};

		public Armor() {
			this.setEquipmentName(miscArmor[0]);
			this.setDefenseRating(0);
			this.setAttackRating(0);
			this.setEquipmentDesc(miscDesc);
		}
		
		public String[] getAllArmor() {
			return this.getAllEquipment(allArmor, getArmorTotal());
		}
		
		public int getArmorTotal() {
			return this.getEquipmentTotal(allArmor);
		}
		
		public void displayAllArmor() {
			this.displayAllEquipmentMulti(allArmor);
		}
		
		public void changeArmor(String w) {
			for(int x = 0; x < allArmor.length; ++x) {
				for(int y = 0; y < allArmor[x].length; ++y) {
					if(allArmor[x][y].equals(w)) {
						this.setEquipmentDesc(allArmorDesc[x][y]);
						this.setAttackRating(allArmorDefense[x][x]);
					}
				}
			}
			this.changeEquipment(w);
		}
}
