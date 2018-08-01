package bitcoin.mine;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;

@Component
public class MineAdapter {

	@Autowired
	MineService mineService;
	
	public void startMine(List<Block> blockchain, List<Transaction> txs, String address){
		//排序该集合，保证输出稳定的merkle树
		Set<Transaction> sortedSet = new TreeSet<Transaction>(txs);
		List<Transaction> sortedList = new ArrayList<Transaction>(sortedSet);
		
		mineService.mineBlock(blockchain, sortedList, address);
	}
}
