package corejava.enumeration;

/**
 * Created by Maor on 5/22/2018.
 */
public class WebPageSwitchcase {

    public static void main(String[] args) {

        WebPage page = WebPage.A;

        switch (page) {
            case A:
                System.out.println("Selected " + WebPage.A);
                break;
            case B:
                System.out.println("Selected " + WebPage.B);
                break;
            case C:
                System.out.println("Selected " + WebPage.C);
                break;
            default:
                throw new AssertionError("Unknown Page " + page);
        }
    }
}
