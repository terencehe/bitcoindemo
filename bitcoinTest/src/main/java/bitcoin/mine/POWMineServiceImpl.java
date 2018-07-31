package bitcoin.mine;



import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import bitcoin.domainobject.Block;
import bitcoin.domainobject.Transaction;
import bitcoin.util.SHA256Util;


@Component
public class POWMineServiceImpl implements MineService{
	/**

	 * �ڿ�

	 * @param blockchain ����������

	 * @param txs ����˽��׼�¼,����

	 * @param address ��Ǯ����ַ 

	 * @return

	 */
    @Override
	public void mineBlock(List<Block> blockchain, List<Transaction> txs, String address) {

	    //����ϵͳ�����Ľ���

	    Transaction sysTx = new Transaction(UUID.randomUUID().toString(), "", address, 10);

	    txs.add(sysTx);

	    //��ȡ��ǰ������������һ������

	    Block latestBlock = blockchain.get(blockchain.size() - 1);

	    //�����

	    int nonce = 1;

	    String hash = "";

	    while(true){

	        hash = SHA256Util.getSHA256StrJava(latestBlock.getHash() + JSON.toJSONString(txs) + nonce);

	        if (hash.startsWith("0000")) {

	            System.out.println("=====��������ȷ���������Ϊ��" +nonce+ ",hash:" + hash);

	            break;

	        }

	        nonce++;

	        System.out.println("�������hash:" + hash);

	    }

	    //������⣬���Թ��������鲢�������������

	    Block newBlock = new Block(latestBlock.getIndex() + 1, System.currentTimeMillis(), txs, nonce, latestBlock.getHash(), hash);

	    blockchain.add(newBlock);

	   

	}
}
