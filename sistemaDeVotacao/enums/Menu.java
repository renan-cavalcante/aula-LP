package enums;

public enum Menu {
		CADASTRAR_ELEITOR(1){
			@Override
			public void chamada() {
				
			}
		}
		, CADASTRAR_VOTACAO(2){
			@Override
			public void chamada() {
				
			}
		}
		, AGRUPAR_APURACAO(3){
			@Override
			public void chamada() {
				
			}
		}
		, MENU_ESTATISTICA(4){
			@Override
			public void chamada() {
				
			}
		}
		, FIM(9){
			@Override
			public void chamada() {
				
			}
		};
	
	private int code;
	
	private Menu(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Menu valueOf(int code) {
		for (Menu value : Menu.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
	public abstract void chamada();
}
