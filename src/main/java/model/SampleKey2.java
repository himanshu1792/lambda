package model;

public class SampleKey2 {
	
	private String newValue;

    private String op;

    private String oldValue;

    public String getNewValue ()
    {
        return newValue;
    }

    public void setNewValue (String newValue)
    {
        this.newValue = newValue;
    }

    public String getOp ()
    {
        return op;
    }

    public void setOp (String op)
    {
        this.op = op;
    }

    public String getOldValue ()
    {
        return oldValue;
    }

    public void setOldValue (String oldValue)
    {
        this.oldValue = oldValue;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [newValue = "+newValue+", op = "+op+", oldValue = "+oldValue+"]";
    }

}
