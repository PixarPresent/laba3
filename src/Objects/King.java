package Objects;

import Enums.*;
import Interfaces.Additions;

public class King extends Entity implements Additions
{
    private String name;

    public King(String name)
    {
        super(name);
        this.name = name;
    }

    public void Say(Actions act)
    {
        if (act == Actions.say)
        {
            System.out.print(",- Сказал " + name + ",- ");
        }
    }
    public void Help(Actions act)
    {
        if (act == Actions.help)
        {
            System.out.print("слова " + super.name + " не очень помогли ");
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

    @Override
    public void getAdditions(String add)
    {
        System.out.print(this.name = add);
    }

}
