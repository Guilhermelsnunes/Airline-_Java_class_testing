//Parent abstract class to help cabin crew member and pilot
package people.crew;

import java.util.ArrayList;

public abstract class PlaneCrew {

    private String name;
    private Rank rank;

    public PlaneCrew(String name, Rank rank){
//        super(rank);
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}


