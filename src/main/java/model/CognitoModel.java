package model;


public class CognitoModel {
	
	private String region;

    private DatasetRecords datasetRecords;

    private String identityPoolId;

    private String identityId;

    private String datasetName;

    private String eventType;

    private String version;

    public String getRegion ()
    {
        return region;
    }

    public void setRegion (String region)
    {
        this.region = region;
    }

    public DatasetRecords getDatasetRecords ()
    {
        return datasetRecords;
    }

    public void setDatasetRecords (DatasetRecords datasetRecords)
    {
        this.datasetRecords = datasetRecords;
    }

    public String getIdentityPoolId ()
    {
        return identityPoolId;
    }

    public void setIdentityPoolId (String identityPoolId)
    {
        this.identityPoolId = identityPoolId;
    }

    public String getIdentityId ()
    {
        return identityId;
    }

    public void setIdentityId (String identityId)
    {
        this.identityId = identityId;
    }

    public String getDatasetName ()
    {
        return datasetName;
    }

    public void setDatasetName (String datasetName)
    {
        this.datasetName = datasetName;
    }

    public String getEventType ()
    {
        return eventType;
    }

    public void setEventType (String eventType)
    {
        this.eventType = eventType;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [region = "+region+", datasetRecords = "+datasetRecords+", identityPoolId = "+identityPoolId+", identityId = "+identityId+", datasetName = "+datasetName+", eventType = "+eventType+", version = "+version+"]";
    }

}
