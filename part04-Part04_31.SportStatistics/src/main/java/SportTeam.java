/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class SportTeam {

    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int wins;
    private int Losses;
    private int games;

    public SportTeam(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        

    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }

    public int getHomeScore() {
        return this.homeScore;
    }
    
    public int getAwayScore(){
        return this.awayScore;
    }
   
    public int playGame(){
       return this.games = this.games+1;
    }
    
    public int setWins(){
        return this.wins = this.wins+1;
    }
    
    public int setLoses(){
        return this.wins = this.wins+1;
    }
    
    public int getWin(){
        return this.wins;
    }
    
    public int getloses(){
        return this.Losses;
    }
}
 