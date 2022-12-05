/*
 * Brendan Sherman 
 */

 package ps6.adapter;

public class ExpressBookPolicies implements Policies
{   
    private Policies bp = new BookPolicies();

    public void signOutPeriod(){
        System.out.println("Express books circulate for two weeks");
    }

    public void requestingAndRenewing(){
        System.out.println("Express books may not be requested or renewed");
    }

    public void returnLocations(){
        bp.returnLocations();
    }

    public void overdueFines(){
        bp.overdueFines();
    }
}
