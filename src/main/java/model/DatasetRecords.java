package model;

public class DatasetRecords {
	
	private SampleKey2 SampleKey2;

    private SampleKey1 SampleKey1;

    public SampleKey2 getSampleKey2 ()
    {
        return SampleKey2;
    }

    public void setSampleKey2 (SampleKey2 SampleKey2)
    {
        this.SampleKey2 = SampleKey2;
    }

    public SampleKey1 getSampleKey1 ()
    {
        return SampleKey1;
    }

    public void setSampleKey1 (SampleKey1 SampleKey1)
    {
        this.SampleKey1 = SampleKey1;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SampleKey2 = "+SampleKey2+", SampleKey1 = "+SampleKey1+"]";
    }

}
