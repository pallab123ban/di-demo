package guru.springframework.config;

import guru.springframework.datasource.FakeDataSource;
import guru.springframework.jms.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * This is the class responsible for populating the db details
 * from properties file to data source pojo
 * @author PALLAB
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
// This is an alternative and best/popular approach when you have multiple properties file to be loaded in the spring context.
@PropertySources({
        @PropertySource("classpath:datasource.properties")
        //@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUserName;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsSource fakeJmsSource(){
        FakeJmsSource fakeJmsSource = new FakeJmsSource();
        fakeJmsSource.setUsername(jmsUserName);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setUrl(jmsUrl);

        return fakeJmsSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
