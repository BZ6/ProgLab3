public class MailBox implements InscriptionInterface {
    protected boolean
        isWire,
        isHaveSlot,
        isHaveInscription,
        isVisibilityInscription;
    protected LocationEnum
        locationSlot,
        locationInscription;
    protected String valueOfInscription;

    public MailBox() {
        isWire = true;
        isHaveSlot = true;
        isHaveInscription = true;
        isVisibilityInscription = false;
        locationSlot = LocationEnum.INDOOR;
        locationInscription = LocationEnum.OUTSIDE;
        valueOfInscription = "Для писем и газет";
        System.out.println("Почтовый ящик создан.");
    }
    public void beWire() {
        if (isWire)
            System.out.println("Почтовый ящик был проволочный.");
        else
            System.out.println("Почтовый ящик был непроволочный.");
    }

    @Override
    public void beSlotAndInscription() {
        if (locationSlot == LocationEnum.INDOOR)
            if (isHaveSlot)
                if (isHaveInscription)
                    System.out.println("В двери была щель с надписью '" + valueOfInscription + "'.");
                else
                    System.out.println("В двери была щель.");
            else
                System.out.println("В двери не было ничего.");
        else
            if (isHaveSlot)
                if (isHaveInscription)
                    System.out.println("Где-то была щель с надписью '" + valueOfInscription + "'.");
                else
                    System.out.println("Где-то была щель.");
        /*
            else
                System.out.println("Где-то не было ничего.");
        */
    }

    @Override
    public void beVisibilityInscription() {
        if (isHaveInscription)
            if (!isVisibilityInscription)
                System.out.print("Надпись не было видно, ");
            else
                System.out.print("Надпись было видно, ");
        else
            System.out.println("Надписи не было.");
    }

    @Override
    public void beOutside() {
        if (isHaveInscription)
            if (!isVisibilityInscription)
                if (locationInscription == LocationEnum.OUTSIDE)
                    System.out.println("потому что она была снаружи.");
                else
                    System.out.println("потому что она была неизвестно где.");
            else if (locationInscription == LocationEnum.INHOUSE)
                System.out.println("потому что она была внутри.");
    }
}
