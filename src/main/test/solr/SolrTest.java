package solr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

import java.io.IOException;

/**
 * 用solrj提供的api操作solr
 *
 * @author 丁旭
 * @E-mail <a href="mailto:dingxu@sjgtw.com"/>
 * @date 2016-05-06
 */
public class SolrTest {
    public static void main(String args[]) throws IOException, SolrServerException {
        //创建solr对象
        String urlString = "http://192.168.86.128:8983/solr/test-core";
        SolrClient solr = new HttpSolrClient(urlString);

//        建立索引
        SolrInputDocument document = new SolrInputDocument();
        document.addField("id", "552199");
        document.addField("admin_Name", "solr测试人物");
        UpdateResponse response = solr.add(document);
        // Remember to commit your changes!
        solr.commit();


        //查询索引
//        SolrQuery query = new SolrQuery();
////        query.setQuery("*.*");
//        query.setRequestHandler("/select");
////        query.set("fl", "category,title,price");
//        query.setFields("id", "admin_Name");
////        query.set("q", "category:books");
//        QueryResponse response = solr.query(query);
//        SolrDocumentList list = response.getResults();
//        System.out.println(list);

    }
}
