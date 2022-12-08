package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Lab.SayHello;

public class Chinese extends BasePerson{
    private String name;

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
