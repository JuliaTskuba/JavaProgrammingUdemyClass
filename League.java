package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    String name;
    ArrayList<T> leagueList = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        String result;
        if(leagueList.contains(team)) {
            System.out.println(team.getName() + " is already in league " + this.name);
            return false;
        } else {
            leagueList.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(leagueList);
        for(T t : leagueList) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
