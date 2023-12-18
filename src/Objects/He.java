package Objects;

import Enums.Actions;
import Interfaces.Conditions;
import Interfaces.Additions;


public class He extends Entity implements Conditions, Additions {

    private String name;

    public He(String name)
    {
        super(name);
        this.name = name;
    }

    public void Cont(Actions act)
    {
        if (act == Actions.cont)
        {
            System.out.print(name + " продолжал ");
        }
    }

    public void Shuffle(Actions act)
    {
        if (act == Actions.shuffle)
        {
            System.out.print("переминаться с ноги на ногу); ");
        }
    }

    public void Looking(Actions act, Objects o)
    {
        if(act == Actions.looking)
        {
            System.out.print("поглядывая на " + o + ", ");
        }
    }

    public void Bite(Actions act)
    {
        if (act == Actions.bite)
        {
            System.out.print(" откусил ");
        }
    }

    @Override
    public void getConditions(String cond) {
        System.out.print(this.name = cond);
    }


    @Override
    public void getAdditions(String add)
    {
        System.out.print(this.name = add);
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
