package com.tyk.demo.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @Author: tyk
 * @Date: 2020/1/14 15:00
 * @Description:
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "卖大米";
    private String artist = "假老练";

    @Override
    public void play() {
        System.out.println("艺术家" + artist + "演唱" + title);
    }
}
