/*

Логический блок инициализации

*/


package Study.Study;

class LogicBlock {
	private int x = 89;
	
	{
		x = 20; // перед запуском конструктора x становится равным 20, а не 89
	}
	
    public LogicBlock() {
    }
	
	public LogicBlock(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public static void main (String[] args) {
		LogicBlock logic1 = new LogicBlock();
		LogicBlock logic2 = new LogicBlock(200);
		
		System.out.println(logic1.getX() + " " + logic2.getX());
	}
}