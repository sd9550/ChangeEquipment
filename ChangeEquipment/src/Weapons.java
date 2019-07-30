
public class Weapons extends Equipment {
		
		private String[] miscWeapons = {"Fist"};
		String miscDesc = "Bare fist. Not ideal in most situations.";
		private String[] oneHandedSwords = {"Longsword", "Shortsword", "Broad Sword", "Scimitar"};
		private String[] twoHandedSwords = {"Bastard Sword", "Claymore", "Zweihander"};
		private String[] oneHandedAxes = {"Hand Axe", "Battle Axe"};
		private String[][] allWeapons = {oneHandedSwords, twoHandedSwords, oneHandedAxes};
		
		private int[] oneHandedSwordsAttack = {6, 5, 7, 7};
		private int[] twoHandedSwordsAttack = {9, 9, 10};
		private int[] oneHandedAxesAttack = {5, 8};
		private int[][] allWeaponsAttack = {oneHandedSwordsAttack, twoHandedSwordsAttack, oneHandedAxesAttack};
		
		private String[] oneHandedSwordsDesc = {"Widely-used standard straight sword, only matched in ubiquity by the shortsword.", "The small straight sword is widely used, to an extent only matched by the longsword.", "The wide blade of this straight sword emphasizes slicing and has no thrust attack.", "Small curved sword. Each hit inflicts little damage, but fluid attacks are deadly."};
		private String[] twoHandedSwordsDesc = {"This standard greatsword is normally wielded with two hands due to its great weight.", "This larger type of greatsword is normally wielded with two hands due to its weight.", "One of the gigantic straight greatswords."};
		private String[] oneHandedAxesDesc = {"Small hand axe. Appears identical to a lumberjack's tool,  but has an ideal weight and strength, and is easy to handle.", "Standard battle axe. Inflicts regular damage, making it effective in various situations."};
		private String[][] allWeaponsDesc = {oneHandedSwordsDesc, twoHandedSwordsDesc, oneHandedAxesDesc};

		public Weapons() {
			this.setEquipmentName(miscWeapons[0]);
			this.setAttackRating(1);
			this.setDefenseRating(0);
			this.setEquipmentDesc(miscDesc);
		}
		
		public String[] getAllWeapons() {
			return this.getAllEquipment(allWeapons, getWeaponsTotal());
		}
		
		public void getAllWeaponsMulti() {
			this.displayAllEquipmentMulti(allWeapons);
		}
		
		public int getWeaponsTotal() {
			return this.getEquipmentTotal(allWeapons);
		}
		
		public void changeWeapon(String w) {
			for(int x = 0; x < allWeapons.length; ++x) {
				for(int y = 0; y < allWeapons[x].length; ++y) {
					if(allWeapons[x][y].equals(w)) {
						this.setEquipmentDesc(allWeaponsDesc[x][y]);
						this.setAttackRating(allWeaponsAttack[x][x]);
					}
				}
			}
			this.changeEquipment(w);
		}
}
