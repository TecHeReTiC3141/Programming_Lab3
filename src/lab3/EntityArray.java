package lab3;

import lab3.utils.GetArrayString;

import java.util.ArrayList;
import java.util.Objects;

public class EntityArray implements AbleToExecute {

    public ArrayList<Entity> entities;

    public EntityArray() {
        this.entities = new ArrayList<Entity>();
    }

    public EntityArray(ArrayList<Entity> entities) {
        this.entities = entities;
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public String getEntitiesList() {
        return GetArrayString.getArrayString(this.entities);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityArray that = (EntityArray) o;
        return Objects.equals(entities, that.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities);
    }

    @Override
    public String executeAction(Action action) {
        return this.getEntitiesList() + " " + action.toString();
    }

    public String executeActions(ArrayList<Action> actions) {
        String s = "";
        s += this.getEntitiesList();
        s += GetArrayString.getArrayString(actions);
        return s;
    }
}
