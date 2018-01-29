/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Chathura
 */
public class Record {
    String key;
    long pressedTime;
    long releaseTime;

    Record(String key, long pressedTime) {
        this.key = key;
        this.pressedTime = pressedTime;
    }
}
