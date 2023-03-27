//Use to create template for common behaviour of similar objects
// Inheritance ove composition. Decides on object type at runtime
// opposite to Strategy pattern
// if solution can be achieved using Strategy pattern, then using Strategy pattern is recommended

package template.com.app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Teams> teams = new ArrayList<>();
        teams.add(new Teams("Team1"));
        teams.add(new Teams("Team2"));

        Cricket cricket = new Cricket(teams);
        cricket.play();

        Football football = new Football(teams);
        football.play();
    }
}

//Game class
//Football, Cricket inherits game(play - initialize, start, end)
//