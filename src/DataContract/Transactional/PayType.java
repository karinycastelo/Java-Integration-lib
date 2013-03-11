package maxiPago.DataContract.Transactional;


public class PayType {

	public PayType() {
	}

	private CreditCard creditCard;
	private OnFile onFile;
	private Boleto boleto;
	private OnlineDebit onlineDebit;

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public OnFile getOnFile() {
		return onFile;
	}

	public void setOnFile(OnFile onFile) {
		this.onFile = onFile;
	}
	
	public Boleto getBoleto() { 
		return this.boleto; 
	}
	 
	public void setBoleto(Boleto boleto) { 
		this.boleto = boleto; 
	}
	
	public OnlineDebit getOnlineDebit() { 
		return this.onlineDebit; 
	}
	 
	public void setOnlineDebit(OnlineDebit onlineDebit) { 
		this.onlineDebit = onlineDebit; 
	}
	

	// private Token token;

}
