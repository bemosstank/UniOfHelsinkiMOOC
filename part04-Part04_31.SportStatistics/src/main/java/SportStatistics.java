
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        int count= 0, losses = 0, wins = 0;
        
        System.out.println("File: ");
        String fileName = scan.nextLine();


        ArrayList<SportTeam> list = Team(fileName);
        
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        for (SportTeam team : list) {
            
            if (team.getHomeTeam().equals(teamName)) {
                count = count + 1;

                if (team.getHomeScore() >= team.getAwayScore()) {
                    wins = wins+1;
                    team.setWins();
                } else {
                    losses = losses +1;
                    team.setLoses();
                }
                team.playGame();
            } else if (team.getAwayTeam().equals(teamName)) {
                count = count + 1;

                if (team.getAwayScore() >= team.getHomeScore()) {
                    wins = wins+1;
                    team.setWins();
                } else {
                    losses = losses+1;
                    team.setLoses();
                }
                team.playGame();
            }
        }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
    }

    public static ArrayList<SportTeam>Team(String fileName) {
        ArrayList<SportTeam> teams = new ArrayList<>();
        String[] parts;

        String line;

        String homeTeam;
        String awayTeam;

        int homeScore;
        int awayScore;

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                line = fileScan.nextLine();
                parts = line.split(",");

                homeTeam = parts[0];
                awayTeam = parts[1];

                homeScore = Integer.valueOf(parts[2]);
                awayScore = Integer.valueOf(parts[3]);

                teams.add(new SportTeam(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (IOException exe) {
            System.out.println("Error " + exe.getMessage());
        }
        return teams;
    }
}
