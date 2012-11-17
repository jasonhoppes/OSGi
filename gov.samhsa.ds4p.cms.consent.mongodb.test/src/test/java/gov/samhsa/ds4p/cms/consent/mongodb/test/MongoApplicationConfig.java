/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.samhsa.ds4p.cms.consent.mongodb.test;


import gov.samhsa.ds4p.cms.consent.mongodb.dto.Person;
import gov.samhsa.ds4p.cms.consent.mongodb.repositories.PersonRepository;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.PlatformTransactionManager;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;

/**
 * Spring JavaConfig configuration class to setup a Spring container and
 * infrastructure components like a {@link DataSource}, a
 * {@link EntityManagerFactory} and a {@link PlatformTransactionManager}.
 *
 * @author Oliver Gierke
 */
@Configuration
@ComponentScan
@EnableMongoRepositories(basePackageClasses = {PersonRepository.class})
public class MongoApplicationConfig extends AbstractMongoConfiguration {

    //@Autowired
    //private List<Converter<?, ?>> converters;

    /* 
     * (non-Javadoc)
     * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#getDatabaseName()
     */
    @Override
    protected String getDatabaseName() {
        return "p-store";
    }

    /* 
     * (non-Javadoc)
     * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#mongo()
     */
    @Override
    public Mongo mongo() throws Exception {

        Mongo mongo = new Mongo();
        mongo.setWriteConcern(WriteConcern.SAFE);

        return mongo;
    }

    /* 
     * (non-Javadoc)
     * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#customConversions()
     */
    /*@Override
     public CustomConversions customConversions() {
     return new CustomConversions(converters);
     }*/
    @Override
    protected String getMappingBasePackage() {
        return Person.class.getPackage().getName();
    }
}
