package lab3;

import java.util.ArrayList;

import java.util.Objects;

import lab3.colors.Colors;
import lab3.utils.GetArrayString;

public abstract class Action {

    protected String DEFAULT_DESCRIPTION = "сделал действие";

    protected String description;
    private ArrayList<ActionModifier> modifiers;
    private ArrayList<Entity> entities;
    private ArrayList<String> objects;
    private ArrayList<Adjective> adjectives;

    public Action() {
        this.entities = new ArrayList<>();
        this.modifiers = new ArrayList<>();
        this.objects = new ArrayList<>();
        this.adjectives = new ArrayList<>();
    }


    public Action(String description) {
        this();
        this.description = description;
    }

    public Action(String description, ArrayList<String> objects) {
        this();
        this.description = description;
        this.objects = objects;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        String s = this.description;
        s += GetArrayString.getArrayString(this.modifiers);
        s += GetArrayString.getArrayString(this.adjectives);
        s += GetArrayString.getArrayString(this.entities);
        s += GetArrayString.getArrayString(this.objects);
        return Colors.ANSI_GREEN + s + Colors.ANSI_RESET;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action = (Action) o;
        return Objects.equals(modifiers, action.modifiers)
                && Objects.equals(entities, action.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, modifiers, entities);
    }

    public void attachEntity(Entity object) {
        this.entities.add(object);
    }


    public void attachEntity(Entity object, boolean clear) {
        if (clear) this.entities.clear();
        this.entities.add(object);
    }

    public void attachObject(String objectName) {
        this.objects.add(objectName);
    }
    public void attachObject(String objectName, boolean clear) {
        if (clear) this.objects.clear();
        this.objects.add(objectName);
    }

    public void clearObjects() {
        this.objects.clear();
    }

    public void clearEntities() {
        this.entities.clear();
    }

//    public abstract void attachObject(String objectName);

    public void addModifier(ActionModifier modifier) {
        this.modifiers.add(modifier);
    }

    public void addModifier(ActionModifier modifier, boolean clear) {
        if (clear) this.modifiers.clear();
        this.modifiers.add(modifier);
    }

    public void clearModifiers() {
        this.modifiers.clear();
    }

    public void addAdjective(Adjective adjective) {
        this.adjectives.add(adjective);
    }

    public void addAdjective(Adjective adjective, boolean clear) {
        if (clear) this.adjectives.clear();
        this.adjectives.add(adjective);
    }

    public void clearAdjectives() {
        this.adjectives.clear();
    }


}
