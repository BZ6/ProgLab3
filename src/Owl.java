public class Owl extends AnimalAbstract implements OwlInterface {
    public Owl() {
        name = "Сова";
        location = LocationEnum.INHOUSE;
        System.out.println("Сова с именем " + name + " создана.");
    }

    @Override
    public void admire() {
        System.out.println(name + " залюбовалась своим почтовым ящиком.");
    }

    @Override
    public void flyDown() {
        System.out.println(name + " слетела вниз.");
    }
}
