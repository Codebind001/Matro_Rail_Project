package Sender;

public class checker {
	
	public String Generate_Code;
	public String Activation_code;
	private int result;
	
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void getActivationCode(String Acode) {
		this.Activation_code=Acode;
		System.out.println(Activation_code);
	}
	
	public void getGenerateCode(String gcode) {
		result(gcode);
		this.Generate_Code=sendGcode(gcode);;
		System.out.println(Generate_Code);
		
	}
	
	public String sendGcode(String GC) {
		return GC;
	}
		
	
	public void result(String ab) {
		System.out.println(" in result "+Generate_Code);
		System.out.println(" in result "+Activation_code);
		if(ab.equals(Activation_code)) {
			setResult(1);
		}
		else {
			setResult(0);
		}
	}

}
