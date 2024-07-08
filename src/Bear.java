public class Bear extends AnimalAbstract {
    protected boolean isCall;

    public Bear() {
        name = "Винни-Пух";
        location = LocationEnum.INHOUSE;
        isCall = true;
        System.out.println("Медведь с именем " + name + " создан.");
    }
    public boolean getCall() {
        return isCall;
    }
}
