package bitcoin.mine;

import java.util.List;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;

public interface MineService {
	void mineBlock(List<Block> blockchain, List<Transaction> txs, String address);
}
