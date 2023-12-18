package Objects;

import Enums.*;

public class Im extends Entity
{
    private String name;

    public Im(String name)
    {
        super(name);
        this.name = name;
    }

    public void Execute(Actions act)
    {
        if (act == Actions.execute)
        {
            System.out.print("не то " + name + " велю казнить вас");
        }
    }

    public void Here(Place plc)
    {
        if (plc == Place.here)
        {
            System.out.println(" на месте. ");
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
