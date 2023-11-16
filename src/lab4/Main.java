package lab4;

import lab4.exceptions.OutOfOrderException;
import lab4.heros.*;
import lab4.actions.*;
import lab4.entities.*;

import java.util.ArrayList;

/*
    TODO: think about implementing a class for the whole story
    TODO: create classes for light and water which are descendants of TemporaryService and will have
     some static inner class which will control if they can be used or not
* */

public class Main {

    public static void watchFilm(History history, HeroGroup watchers) {
        Crimes crimes = new Crimes();
        Action steal = new Steal();
        steal.attachEntity(new Valuables());
        steal.addModifier(ActionModifier.WHERE);
        steal.addModifier(ActionModifier.WHICH);
        history.doAction(new Clause(crimes, steal));


        FindOut findOut = new FindOut(new ArrayList<String>() {{ add("этот"); }});
        Be be = new Be(findOut, new ArrayList<>() {{ add("им"); }});

        Adjective interesting = new Adjective("интересно");
        Adjective really = new Adjective("чрезвычайно");
        be.attachObject("им", true);
        be.addModifier(ActionModifier.AT_THE_SAME_TIME);
        be.addAdjective(really);
        be.addAdjective(interesting);
        findOut.clearObjects();

        Catch catchAction = new Catch();
        catchAction.addModifier(ActionModifier.FINALLY);
        catchAction.addModifier(ActionModifier.OR_NOT);
        catchAction.attachEntity(crimes);
        history.doAction(new Clause(catchAction));

        Movie movie = new Movie();
        Become become = new Become();
        become.addModifier(ActionModifier.BY_THE_WAY);
        become.addModifier(ActionModifier.PROGRESSING);
        become.addAdjective(new Comparative("напряженно"));
        become.addAdjective(new Comparative("стремительно"));
        history.doAction(new Clause(movie, become)).doAction(new Clause(movie, become));

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

        for (Entity hero : heros2.entities) {
            history.doAction(new Clause((Hero) hero, appear));
        }

        CrimesLeader leader = new CrimesLeader();
        catchAction.attachEntity(leader, true);
        catchAction.clearModifiers();
        be.setSubAction(catchAction);
        be.addModifier(ActionModifier.NEARLY, true);
        be.clearObjects();
        be.clearAdjectives();
        Must must = new Must(be);
        history.doAction(new Clause(must));

        TV tv = new TV();
        TurnOff turnOff = new TurnOff();
        turnOff.addModifier(ActionModifier.SUDDENLY);
        turnOff.addModifier(ActionModifier.AT_INTERESTING_PLACE);
        history.doAction(new Clause(tv, turnOff));

        Tongue tongue = new Tongue();
        LeanOut leanOut = new LeanOut();
        leanOut.addModifier(ActionModifier.AGAIN);
        leanOut.addModifier(ActionModifier.FROM_ABOVE);
        history.doAction(new Clause(tongue, leanOut));

        Sign sign = new Sign();
        Blink blink = new Blink();
        history.doAction(new Clause(sign, blink));
        history.tell(watchers);
    }

    public static void main(String[] args) {

        History history = new History();

        Goat goat = new Goat() {{
            for (int i = 0; i < Math.round(Math.random() * 10) + 2; ++i) {
                addMoney(Money.getRandomMoney());
            }
            System.out.println("У Козлика всего есть %s сантиков".formatted(getMoney()));
        }};
        HeroGroup watchers = new HeroGroup(){{ addEntity(new Neznaika()); addEntity(goat); }};

        watchFilm(history, watchers);

        ArrayList<String> services = HotelServices.getNotTemporaryAllServices();
        System.out.println("\nВсе услуги отеля: " + services);

        for (HotelServices service : HotelServices.values()) {
            HotelServices.Tongue tongue = service.new Tongue();
            tongue.pay(goat);
        }

        int time = 0;
        HotelServices.TemporaryServiceState state = new HotelServices.TemporaryServiceState();
        while (state.isAnyTemporaryServiceActive()) {
            System.out.println("\nПрошло %s минут".formatted(++time) + ". У %s остается %s сантиков".formatted(goat.getName(), goat.getMoney()));
            try {
                state.update(goat);
            } catch (OutOfOrderException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}