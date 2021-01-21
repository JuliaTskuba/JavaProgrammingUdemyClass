package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        League<Team<FootballPlayer>> footballLeague = new League<Team<FootballPlayer>>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");

        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);


        hawthorn.matchResult(adelaideCrows, 1, 0);
        adelaideCrows.matchResult(hawthorn, 6, 2);
        hawthorn.matchResult(melbourne, 1, 0);

        footballLeague.showLeagueTable();

    }
}
