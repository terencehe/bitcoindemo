package bitcoin.accountinfo;



import java.util.List;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;

public class AccountMaintain {
	/**

	 * ≤È—Ø”‡∂Ó

	 * @param blockchain

	 * @param address

	 * @return

	 */

	public static int getWalletBalance(List<Block> blockchain, String address) {

	    int balance = 0;

	    for (Block block : blockchain) {

	        List<Transaction>  transactions = block.getTransactions();

	        for (Transaction transaction : transactions) {

	            if (address.equals(transaction.getRecipient())) {

	                balance += transaction.getAmount();

	            }

	            if (address.equals(transaction.getSender())) {

	                balance -= transaction.getAmount();

	            }

	        }

	    }

	    return balance;

	}


}
