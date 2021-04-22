package corejava.enumeration;

/**
 * Created by Maor on 5/22/2018.
 */

enum  WebPage {

    A("http://artoftesting.com"),
    B("http://toolsqa.com"),
    C("https://www.linkedin.com"),
    D("https://www.facebook.com"),
    E("https://twitter.com");

    private String url;

    WebPage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

    public static void main(String[] args) {

        // Print
        System.out.println(WebPage.A);
        System.out.println(WebPage.B);

        WebPage Selected = WebPage.A;
        if (Selected == WebPage.A) {
            System.out.println("Selected : " + Selected.name() +" " + Selected.url());

        }
    }
}

