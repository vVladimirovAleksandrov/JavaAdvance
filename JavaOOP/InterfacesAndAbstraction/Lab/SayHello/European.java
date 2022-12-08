package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Lab.SayHello;

public class European extends BasePerson{
    private String name;

    public European(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
