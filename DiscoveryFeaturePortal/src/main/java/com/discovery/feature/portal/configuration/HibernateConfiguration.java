package com.discovery.feature.portal.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.discovery.feature.portal.configuration" })
@PropertySource("classpath:application.properties")
public class HibernateConfiguration {
	
	@Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }

//    @Bean(name = "entityManagerFactory")
//    @DependsOn({"dataSource"})
//    public EntityManagerFactory entityManagerFactory() {
//        final LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        bean.setDataSource(dataSource());
//        bean.setPackagesToScan("com.discovery.feature.portal.mvc.entity" );
//        bean.setPersistenceUnitName("primary");
//        bean.setJpaProperties(additionalProperties());
//        bean.afterPropertiesSet();
//        return bean.getObject();
//    }
    
    @Bean
    @DependsOn({"dataSource"})
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.discovery.feature.portal.mvc.entity" });
        sessionFactory.setHibernateProperties(additionalProperties());
        return sessionFactory;
     } 

    private static Properties additionalProperties() {
        Properties properties = new Properties();
        properties.setProperty("org.hibernate.dialect.Dialect", "org.hibernate.dialect.Oracle11gDialect");
//        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.use_sql_comments", "true");
        properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
        properties.setProperty("hibernate.event.merge.entity_copy_observer", "allow");
        return properties;
    }

    @Bean(destroyMethod = "")
    @Primary
    public DataSource dataSource() {
        final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
        dsLookup.setResourceRef(true);
        return dsLookup.getDataSource("java:jboss/OracleDataSource");
    }
    

}



