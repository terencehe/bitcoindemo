package bitcoin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;
import bitcoin.mine.MineBTC;

public class MineStarter {

	public static final String MINER_ADDRESS="I_AM_A_MINER";
	
	public static void main(String[] args) {
		List<Block> blockchain = new ArrayList<Block>();
		blockchain.add(initCreationBlock());
		
		List<Transaction> txs = new ArrayList<Transaction>();
		
		Transaction tx1= new Transaction(UUID.randomUUID().toString(), "wantao","hetao",10 );
		txs.add(tx1);
	
		MineBTC.mineBlock(blockchain, txs, MINER_ADDRESS);
		
		System.out.println("ÍÚ¿óºóµÄÇø¿éÁ´£º" + JSON.toJSONString(blockchain));
	}

	
	public static Block initCreationBlock(){
		List<Transaction> transactions = new ArrayList<Transaction>();
		Block creationBlock = new Block(0, System.currentTimeMillis(),transactions,
		0,null, "aaaa"	);
		
		
		return creationBlock;
		
	}
}
