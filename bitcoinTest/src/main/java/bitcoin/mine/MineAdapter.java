package bitcoin.mine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;

@Component
public class MineAdapter {

	@Autowired
	MineService mineService;
	
	public void startMine(List<Block> blockchain, List<Transaction> txs, String address){
		mineService.mineBlock(blockchain, txs, address);
	}
}
