package Objects;

import Enums.Actions;
import Enums.Adjectives;

public class Cup extends Thing{

    private String name;


    public Cup(String name) {
        super(name);
        this.name = name;
    }

    public void Decent(Adjectives adj)
    {
        if (adj == Adjectives.decent)
        {
            System.out.print(" порядочный ");
        }
    }

    public void Cut(Actions act, Thing o)
    {
        if (act == Actions.cut)
        {
            System.out.print("кусок " + name + " вместо " + o + ".");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return java.util.Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
