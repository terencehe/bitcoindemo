package bitcoin.domainobject;

import java.util.List;

public class Block {

        /**

        * ����������

        */

        private int index;

        /**

        * ��ǰ�����hashֵ,����Ψһ��ʶ

        */

        private String hash;

        /**

        * ���������ʱ���

        */

        private long timestamp;

        /**

        * ��ǰ����Ľ��׼���

        */

        private List<Transaction> transactions;

        /**

        * ������֤����������ȷhashֵ�Ĵ���

        */

        Integer nounce;
        
        /**

        * ǰһ�������hashֵ

        */

        private String previousHash;

        
        public Block(int index, long timestamp,List<Transaction> transactions, Integer nounce, String previousHash, String newHash){
        	this.index=index;
        	this.timestamp=timestamp;
        	this.transactions=transactions;
        	this.nounce=nounce;
        	this.previousHash=previousHash;
        	this.hash = newHash;
        	
        }
        
		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public String getHash() {
			return hash;
		}

		public void setHash(String hash) {
			this.hash = hash;
		}

		public long getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(long timestamp) {
			this.timestamp = timestamp;
		}

		public List<Transaction> getTransactions() {
			return transactions;
		}

		public void setTransactions(List<Transaction> transactions) {
			this.transactions = transactions;
		}

		public Integer getNounce() {
			return nounce;
		}

		public void setNounce(Integer nounce) {
			this.nounce = nounce;
		}

		public String getPreviousHash() {
			return previousHash;
		}

		public void setPreviousHash(String previousHash) {
			this.previousHash = previousHash;
		}

       

}
