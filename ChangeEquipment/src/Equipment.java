
public abstract class Equipment {

		private String equipmentName;
		private String equipmentDesc;
		
		private int attackRating;
		private int defenseRating;
		
		public Equipment() {
			
		}
		
		public Equipment(String n, String d, int r, int ra) {
			equipmentName = n;
			equipmentDesc = d;
			attackRating = r;
			defenseRating = ra;
		}
		
		protected void setEquipmentName(String n) {
			equipmentName = n;
		}
		
		protected void setEquipmentDesc(String d) {
			equipmentDesc = d;
		}
		
		protected void setAttackRating(int r) {
			attackRating = r;
		}
		
		protected void setDefenseRating(int r) {
			defenseRating = r;
		}
		
		public String getEquipmentName() {
			return equipmentName;
		}
		
		public String getEquipmentDesc() {
			return equipmentDesc;
		}
		
		public int getAttackRating() {
			return attackRating;
		}
		
		public int getDefenseRating() {
			return defenseRating;
		}
		
		protected String[] getAllEquipment(String[][] e, int l) {
			int counter = 0;
			String[] temp = new String[l];
			
			for(int x = 0; x < e.length; x++) {
				for(int y = 0; y < e[x].length; ++y) {
					temp[counter] = e[x][y];
					counter += 1;
				}
			}
			return temp;
		}
		
		protected void displayAllEquipmentMulti(String[][] e) {
			for(int x = 0; x < e.length; ++x) {
				for(int y = 0; y < e[x].length; ++y) {
					System.out.println(e[x][y]);
				}
			}
		}
		
		protected int getEquipmentTotal(String[][] w) {
			int total = 0;
			
			for(int x = 0; x < w.length; ++x) {
				for(int y = 0; y < w[x].length; ++y) {
					total += 1;
				}
			}
			return total;
		}
		
		public void changeEquipment(String e) {
			equipmentName = e;
		}
}
