/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tepach.config;

import com.tepach.beans.*;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.tepach")
@Lazy(value = true)
public class ConfigBean {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.1.166/ascender_iglesia");
        dataSource.setUsername("anthonytepach");
        dataSource.setPassword("Tbryan.1996");
        return dataSource;
    }
    @Bean
    public Persona persona(){
    return new Persona();
    }
    @Bean
    public Contacto contacto(){
    return new Contacto();
    }
    @Bean
    public Direccion direccion(){
    return new Direccion();
    }
    @Bean
    public Evento evemto(){
    return new Evento();
    }
}
