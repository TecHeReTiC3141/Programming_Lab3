package lab4;

import lab4.utils.GetArrayString;

import java.util.ArrayList;

public class HeroGroup {
    public ArrayList<Watcher> entities;

    public HeroGroup() {
        this.entities = new ArrayList<Watcher>();
    }

    public HeroGroup(ArrayList<Watcher> entities) {
        this.entities = entities;
    }

    public void addEntity(Watcher entity) {
        this.entities.add(entity);
    }

    public String getEntitiesList() {
        return GetArrayString.getArrayString(this.entities);
    }

    public void watchHistory(History history) {
        System.out.println("%s слушают историю:".formatted(this.getEntitiesList()));
        for (Watcher entity : this.entities) {
            entity.watch(history);
        }
    }

}
