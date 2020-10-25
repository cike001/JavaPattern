package com.gwy.memo;

public class Original {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Memo createMemo(){
		return new Memo(value);
	}
	
	public void restoreMemo(Memo memo){
		this.value = memo.getValue();
	}
}
