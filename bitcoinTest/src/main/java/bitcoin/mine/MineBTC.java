package bitcoin.mine;



import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;
import bitcoin.util.SHA256Util;

public class MineBTC {
	/**

	 * 挖矿

	 * @param blockchain 整个区块链

	 * @param txs 需记账交易记录,包含

	 * @param address 矿工钱包地址 

	 * @return

	 */

	public static void mineBlock(List<Block> blockchain, List txs, String address) {

	    //加入系统奖励的交易

	    Transaction sysTx = new Transaction(UUID.randomUUID().toString(), "", address, 10);

	    txs.add(sysTx);

	    //获取当前区块链里的最后一个区块

	    Block latestBlock = blockchain.get(blockchain.size() - 1);

	    //随机数

	    int nonce = 1;

	    String hash = "";

	    while(true){

	        hash = SHA256Util.getSHA256StrJava(latestBlock.getHash() + JSON.toJSONString(txs) + nonce);

	        if (hash.startsWith("0000")) {

	            System.out.println("=====计算结果正确，计算次数为：" +nonce+ ",hash:" + hash);

	            break;

	        }

	        nonce++;

	        System.out.println("计算错误，hash:" + hash);

	    }

	    //解出难题，可以构造新区块并加入进区块链里

	    Block newBlock = new Block(latestBlock.getIndex() + 1, System.currentTimeMillis(), txs, nonce, latestBlock.getHash(), hash);

	    blockchain.add(newBlock);

	   

	}
}
