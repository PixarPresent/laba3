import Enums.*;
import Objects.*;

public class Main {
    public static void main(String[] args)
    {
        Witness witness = new Witness("Свидетель");
        Indications ind = new Indications("показания");
        King king = new King("Король");
        Im im = new Im("я");
        Shlyapa shlyapa = new Shlyapa("Шляпа");
        He he = new He("oн");
        Queen queen = new Queen("Королева");
        Cup cup = new Cup("чашка");
        Sandwich sandwich = new Sandwich("бутерброд");

        witness.doing(Actions.doing, ind);
        king.Say(Actions.say);
        witness.Dont_worry(Actions.dont_worry);
        im.Execute(Actions.execute);
        im.Here(Place.here);
        king.getAdditions("Но, кажется, ");
        king.Help(Actions.help_to_cope, shlyapa);
        shlyapa.getConditions("с волнением:");
        he.Cont(Actions.cont);
        he.Shuffle(Actions.shuffle);
        he.getConditions("опасливо ");
        he.Looking(Actions.looking, queen);
        he.getConditions("и с перепугу");
        he.Bite(Actions.bite);
        he.getAdditions("даже");
        cup.Decent(Adjectives.decent);
        cup.Cut(Actions.cut, sandwich);

        // про бедного шляпу доделать хз как справишься думаю

    }
}