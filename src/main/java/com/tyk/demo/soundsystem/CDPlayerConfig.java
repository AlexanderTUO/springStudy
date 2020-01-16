package com.tyk.demo.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.management.relation.RelationNotFoundException;

/**
 * @Author: tyk
 * @Date: 2020/1/14 15:03
 * @Description:
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {
    @Bean(name = "lonelyCompactDisc")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomCompactDisc() {
        int random = (int) Math.floor(Math.random()*4);
        if (random == 1) {
            return new HardDaysNight();
        } else if (random == 2) {
            return new Revolver();
        } else if (random == 3) {
            return new WhiteAlbum();
        } else {
            return new SgtPeppers();
        }
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc randomCompactDisc) {
        return new CDPlayer(randomCompactDisc);
    }
}
