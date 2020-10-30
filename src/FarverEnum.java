public class FarverEnum {
    public enum Blues{BLACK, BLUE, WHATEVER
    }

    public static void main(String[] args) {
        final Blues type  = Blues.WHATEVER;
        Blues[] color = Blues.values();
        for (Blues we: color
             ) {
            if (we == type){
                System.out.println("yep");
                break;
            }

        }
    }
}
