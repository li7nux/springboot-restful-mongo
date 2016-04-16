package cc.openscanner.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author Li7nux@gmail.com
 * @date 2016年4月16日 下午10:26:13
 * @description 
 */

@Configuration
@EnableMongoRepositories
public class MongoDBConfig extends AbstractMongoConfiguration {

	//TODO add to config
	
	@Override
	protected String getDatabaseName() {
		// MongoDB name
		return "springtest";
	}

	@Override
	public Mongo mongo() throws Exception {
		// Mongo Client
		return new MongoClient();
	}

	@Override
	protected String getMappingBasePackage() {
		return "cc.openscanner";
	}
	

}
