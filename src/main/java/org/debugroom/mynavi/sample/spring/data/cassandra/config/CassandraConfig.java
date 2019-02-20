package org.debugroom.mynavi.sample.spring.data.cassandra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Profile("dev")
@Configuration
@EnableCassandraRepositories("org.debugroom.mynavi.sample.spring.data.cassandra.domain.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages(){
        return new String[] {"org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity"};
    }

    @Override
    protected boolean getMetricsEnabled() {
        return false;
    }


    @Override
    protected String getKeyspaceName() {
        return "sample";
    }
}
