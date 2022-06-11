/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author engeer
 */
public class currentSettings {
    private static final currentSettings cSettings = new currentSettings();
    
    private int difficulty;
    private String playerName;
    private int soundSetting;
    private int scoreValue;
    
    currentSettings(){
        
    }
    
    public static currentSettings getInstance(){
        return cSettings;
    }
    
    public static currentSettings getcSettings(){
        return cSettings;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getSoundSetting() {
        return soundSetting;
    }

    public void setSoundSetting(int soundSetting) {
        this.soundSetting = soundSetting;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }
    
    
    
    
}
