package bitcoin.domainobject;

import java.util.List;

public class Block {

        /**

        * 区块索引号

        */

        private int index;

        /**

        * 当前区块的hash值,区块唯一标识

        */

        private String hash;

        /**

        * 生成区块的时间戳

        */

        private long timestamp;

        /**

        * 当前区块的交易集合

        */

        private List<Transaction> transactions;

        /**

        * 工作量证明，计算正确hash值的次数

        */

        Integer nounce;
        
        /**

        * 前一个区块的hash值

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
