/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;

/**
 *
 * @author Chathura
 */
public class User {
    String key;
    String pass;
    ArrayList<Long> flyTime;
    ArrayList<Long> dwellTime;
    

    User(String key, String pass, ArrayList<Long> dwellTime, ArrayList<Long> flyTime) {
        this.key = key;
        this.pass = pass;
        this.dwellTime = dwellTime;
        this.flyTime = flyTime;
    } 
}
