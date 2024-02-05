public class Formatter {
    public static String formatted(int rouble) {

        if ((rouble % 100 / 10) == 1){
            return " рублей.";
        }
        switch (rouble % 10){
            case 1:
                return " рубль.";
            case 2:
            case 3:
            case 4:
                return " рубля.";
            default:
                return " рублей.";
        }
    }
}
