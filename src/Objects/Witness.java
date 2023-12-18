package Objects;

import Enums.*;

public class Witness extends Entity
{
    private String name;

    public Witness(String name)
    {
        super(name);
        this.name = name;
    }

    public void doing(Actions act, Thing o){
        if (act == Actions.doing)
        {
            System.out.print("- " + name + ", " + "давайте " + o);
        }
    }

    public void Dont_worry(Actions act)
    {
        if (act == Actions.dont_worry)
        {
            System.out.print("и не волнуйтесь, ");
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
