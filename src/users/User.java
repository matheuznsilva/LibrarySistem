package users;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Title> title = new ArrayList<>();

    void addTitle(Title TITLE){
        title.add(TITLE);
    }

    public List<Title> getTitles(){
        return title;
    }


}
