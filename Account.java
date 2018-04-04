public class Account
{
    private int feeDue;
    private Member member;
    public Account()
    {
        this.member=null;
        feeDue=0;
    }

    public Account(Member m)
    {
        member=m;
    }
    public void setMember(Member m)
    {
        member=m;
    }
    public void deposit(int ammount)
    {
        if(ammount>feeDue)
            feeDue=0;
        else 
            feeDue-=ammount;
    }
    public boolean anyDue()
    {
        if(feeDue==0)
            return false;
        else
            return true;
    }
}