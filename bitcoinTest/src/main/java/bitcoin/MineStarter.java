package bitcoin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSON;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;
import bitcoin.mine.MineAdapter;
import bitcoin.testhelper.BlockInitionInfo;
import bitcoin.util.Constant;

@Configuration
@ComponentScan
public class MineStarter {

	private static ApplicationContext context;
 	
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(MineStarter.class);
		MineAdapter mineAdapter = context.getBean(MineAdapter.class);
		
		
		List<Block> blockchain = new ArrayList<Block>();
		blockchain.add(BlockInitionInfo.initCreationBlock());
		
		List<Transaction> txs = new ArrayList<Transaction>();
		
		Transaction tx1= new Transaction(UUID.randomUUID().toString(), Constant.SENDER_ADDRESS1,Constant.RECIPIENT_ADDRESS1,10 );
		txs.add(tx1);
	
		mineAdapter.startMine(blockchain, txs, Constant.MINER_ADDRESS);
		
		System.out.println("ÍÚ¿óºóµÄÇø¿éÁ´£º" + JSON.toJSONString(blockchain));
	}

	

}
