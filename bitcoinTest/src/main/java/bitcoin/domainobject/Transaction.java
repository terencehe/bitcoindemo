package bitcoin.domainobject;

public class Transaction {

    /**

    * ����Ψһ��ʶ

    */

    private String id;

    /**

    * ���׷��ͷ�Ǯ����ַ

    */

    private String sender;

    /**

    * ���׽��շ�Ǯ����ַ

    */

    private String recipient;

    /**

    * ���׽��

    */

    private int amount;
    
    
    public Transaction(String id,String sender,String recipient,int amount){
    	this.id=id;
    	this.sender=sender;
    	this.recipient=recipient;
    	this.amount=amount;
    	
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    	
    
}
