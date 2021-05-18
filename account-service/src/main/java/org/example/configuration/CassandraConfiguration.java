package org.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${springmicroservicesapp.cassandra.keyspace.name}")
    private String keyspaceName;

    @Value("${springmicroservicesapp.cassandra.contact.point}")
    private String contactPoint;

    @Value("${springmicroservicesapp.cassandra.port}")
    private int port;

    @Value("${springmicroservicesapp.cassandra.username}")
    private String username;

    @Value("${springmicroservicesapp.cassandra.password}")
    private String password;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean clusterFactoryBean = super.cluster();
        clusterFactoryBean.setPassword(password);
        clusterFactoryBean.setUsername(username);
        return clusterFactoryBean;
    }
}
