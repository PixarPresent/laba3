package Objects;


import Enums.Adjectives;
import Interfaces.Conditions;

public class Shlyapa extends Entity implements Conditions {

    private String name;

    public Shlyapa(String name)
    {
        super(name);
        this.name = name;
    }

    public void poor(Adjectives adj)
    {
        if (adj == Adjectives.poor)
        {
            System.out.print("бедному " + name);
        }
    }
    @Override
    public void getConditions(String cond)
    {
        System.out.println(this.name = cond);
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
