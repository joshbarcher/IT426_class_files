package entities;

//This class is not mutable, unlike the String class.
public class StringStorage
{
    private String data;

    public StringStorage(String data)
    {
        this.data = data;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return data;
    }
}
