
/**
 * Models a voting district.
 *
 * @author gcschmit
 * @version 14 June 2022
 */
public class District
{
    private int districn;
    private int democratvotes;
    private int republicanvotes;
    public District(int districnum, int democratv, int republicanv)
    {
        this.districn = districnum;
        this.democratvotes = democratv;
        this.republicanvotes = republicanv;
    }
    public int getDemocratVotes()
    {
        return this.democratvotes;
    }
    public int getRepublicanVotes()
    {
        return this.republicanvotes;
    }
    
}
