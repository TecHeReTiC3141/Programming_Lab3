package lab3;

import lab3.utils.GetArrayString;

import java.util.ArrayList;

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
