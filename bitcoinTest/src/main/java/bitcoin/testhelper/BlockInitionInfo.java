package bitcoin.testhelper;

import java.util.ArrayList;
import java.util.List;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;

public class BlockInitionInfo {
	
	public static Block initCreationBlock(){
		List<Transaction> transactions = new ArrayList<Transaction>();
		Block creationBlock = new Block(0, System.currentTimeMillis(),transactions,
		0,null, "aaaa"	);
		
		
		return creationBlock;
		
	}
}
