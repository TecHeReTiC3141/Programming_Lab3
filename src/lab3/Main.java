package lab3;

import lab3.heros.*;
import lab3.actions.*;
import lab3.entities.*;

import java.util.ArrayList;

/*
    TODO: think about implementing a class for the whole story
* */

public class Main {
    public static void main(String[] args) {

        Sentence sentence1 = new Sentence();

        Neznaika neznaika = new Neznaika();
        Goat goat = new Goat();
        EntityArray heros1 = new EntityArray(){{
            addEntity(neznaika);
            addEntity(goat);
        }};
        Action watch = new Watch(new ArrayList<String>() {{ add("с середины"); }});
        watch.attachEntity(new Film());
        Action dontUnderstand = new DontUnderstand();
        dontUnderstand.addModifier(ActionModifier.NO_WAY);
        sentence1.addClause(heros1.executeActions(new ArrayList<Action>()
            {{ add(watch); add(dontUnderstand); }}));

        Crimes crimes = new Crimes();
        Action steal = new Steal();
        steal.attachEntity(new Valuables());
        steal.addModifier(ActionModifier.WHERE);
        steal.addModifier(ActionModifier.WHICH);
        sentence1.addClause(crimes.executeAction(steal));
        System.out.println(sentence1);

        Sentence sentence2 = new Sentence();

        FindOut findOut = new FindOut(new ArrayList<String>() {{ add("этот"); }});
        findOut.attachEntity(new Question());
        Want want = new Want(findOut, new ArrayList<String>() {{ add("им"); }});
        want.addModifier(ActionModifier.STILL);
        want.addModifier(ActionModifier.FOR_SOME_REASON);
        sentence2.addClause(want.executeSelf());
        System.out.println(sentence2);

        Sentence sentence3 = new Sentence();
        Be be = new Be(findOut, new ArrayList<>() {{ add("им"); }});

        Adjective interesting = new Adjective("интересно");
        Adjective really = new Adjective("чрезвычайно");
        be.attachObject("им", true);
        be.addModifier(ActionModifier.AT_THE_SAME_TIME);
        be.addAdjective(really);
        be.addAdjective(interesting);
        findOut.clearObjects();
        sentence3.addClause(be.executeSelf());

        Catch catchAction = new Catch();
        catchAction.addModifier(ActionModifier.FINALLY);
        catchAction.addModifier(ActionModifier.OR_NOT);
        catchAction.attachEntity(crimes);
        sentence3.addClause(catchAction.executeSelf());
        System.out.println(sentence3);

        Sentence sentence4 = new Sentence();
        Movie movie = new Movie();
        Become become = new Become();
        become.addModifier(ActionModifier.BY_THE_WAY);
        become.addModifier(ActionModifier.PROGRESSING);
        become.addAdjective(new Comparative("напряженно"));
        become.addAdjective(new Comparative("стремительно"));
        sentence4.addClause(movie.executeAction(become));
        System.out.println(sentence4);

        Sentence sentence5 = new Sentence();

        Pursuits pursuits = new Pursuits();
        Shootouts shootouts = new Shootouts();
        Fights fights = new Fights();

        EntityArray heros2 = new EntityArray(){{
            addEntity(pursuits);
            addEntity(shootouts);
            addEntity(fights);
        }};
        Appear appear = new Appear();
        appear.addModifier(ActionModifier.ONE_BY_ONE);
        sentence5.addClause(heros2.executeAction(appear));
        System.out.println(sentence5);

        Sentence sentence6 = new Sentence(true);
        CrimesLeader leader = new CrimesLeader();
        catchAction.attachEntity(leader, true);
        catchAction.clearModifiers();
        be.setSubAction(catchAction);
        be.addModifier(ActionModifier.NEARLY, true);
        be.clearObjects();
        be.clearAdjectives();
        Must must = new Must(be);
        sentence6.addClause(ActionModifier.WHEN.toString() + " " + must.executeSelf());

        TV tv = new TV();
        TurnOff turnOff = new TurnOff();
        turnOff.addModifier(ActionModifier.SUDDENLY);
        turnOff.addModifier(ActionModifier.AT_INTERESTING_PLACE);
        sentence6.addClause(tv.executeAction(turnOff));

        Tongue tongue = new Tongue();
        LeanOut leanOut = new LeanOut();
        leanOut.addModifier(ActionModifier.AGAIN);
        leanOut.addModifier(ActionModifier.FROM_ABOVE);
        sentence6.addClause(tongue.executeAction(leanOut));

        Sign sign = new Sign();
        Blink blink = new Blink();
        sentence6.addClause(sign.executeAction(blink));
        System.out.println(sentence6);

    }
}