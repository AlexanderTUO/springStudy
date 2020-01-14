package com.tyk.demo.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: tyk
 * @Date: 2020/1/14 17:05
 * @Description:
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }
}
