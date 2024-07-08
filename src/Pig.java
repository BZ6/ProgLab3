public class Pig extends AnimalAbstract {
    public Pig() {
        name = "Пятачок";
        location = LocationEnum.INHOUSE;
        System.out.println("Свин с именем " + name + " создан.");

    }
    public void bowDown(Bear bear) {
        if (bear.getCall())
            System.out.println(name + " склонился над ним.");
    }
}
