package design;

public abstract class AbstractEmployee implements Employee {

    public final String founderName = "Matiur Rahman";
    static String address = "3601 Steinway Street, Astori, NY";

    public void describeCompany() {
        System.out.println("In the year 2015 " + founderName + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);

}
