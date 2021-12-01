package modelo;

public class Desastre {
    private String DisNo;
    private int Year;
    private double Seq;
    private String Glide;
    private String DisasterGroup;
    private String DisasterSubgroup;
    private String DisasterType;
    private String DisasterSubtype;
    private String DisasterSubsubtype;
    private String EventName;
    private String Country;
    private String ISO;
    private String Region;
    private String Continent;
    private String Location;
    private String Origin;
    private String AssociatedDis;
    private String AssociatedDis2;
    private String OFDAResponse;
    private String Appeal;
    private String Declaration;
    private String AidContribution;
    private int DisMagValue;
    private String DisMagScale;
    private Double Latitude;
    private Double Longitude;
    private String LocalTime;
    private String RiverBasin;
    private int StartYear;
    private int StartMonth;
    private int StartDay;
    private int EndYear;
    private int EndMonth;
    private int EndDay;
    private int TotalDeaths;
    private int NoInjured;
    private int NoAffected;
    private int NoHomeless;
    private int TotalAffected;
    private int ReconstructionCosts;
    private int ReconstructionCostsAdjusted;
    private int InsuredDamages;
    private int InsuredDamagesAdjusted;
    private int TotalDamages;
    private int TotalDamagesAdjusted;
    private String CPI;
    private String Admevel;
    private String Admin1Code;
    private String Admin2Code;
    private String GeoLocations;

    public Desastre(String disNo, int year, double seq, String glide, String disasterGroup, String disasterSubgroup, String disasterType, String disasterSubtype, String disasterSubsubtype, String eventName, String country, String ISO, String region, String continent, String location, String origin, String associatedDis, String associatedDis2, String OFDAResponse, String appeal, String declaration, String aidContribution, int disMagValue, String disMagScale, Double latitude, Double longitude, String localTime, String riverBasin, int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay, int totalDeaths, int noInjured, int noAffected, int noHomeless, int totalAffected, int reconstructionCosts, int reconstructionCostsAdjusted, int insuredDamages, int insuredDamagesAdjusted, int totalDamages, int totalDamagesAdjusted, String CPI, String admevel, String admin1Code, String admin2Code, String geoLocations) {
        try {
        DisNo = disNo;
        Year = year;
        Seq = seq;
        Glide = glide;
        DisasterGroup = disasterGroup;
        DisasterSubgroup = disasterSubgroup;
        DisasterType = disasterType;
        DisasterSubtype = disasterSubtype;
        DisasterSubsubtype = disasterSubsubtype;
        EventName = eventName;
        Country = country;
        this.ISO = ISO;
        Region = region;
        Continent = continent;
        Location = location;
        Origin = origin;
        AssociatedDis = associatedDis;
        AssociatedDis2 = associatedDis2;
        this.OFDAResponse = OFDAResponse;
        Appeal = appeal;
        Declaration = declaration;
        AidContribution = aidContribution;
        DisMagValue = disMagValue;
        DisMagScale = disMagScale;
        Latitude = latitude;
        Longitude = longitude;
        LocalTime = localTime;
        RiverBasin = riverBasin;
        StartYear = startYear;
        StartMonth = startMonth;
        StartDay = startDay;
        EndYear = endYear;
        EndMonth = endMonth;
        EndDay = endDay;
        TotalDeaths = totalDeaths;
        NoInjured = noInjured;
        NoAffected = noAffected;
        NoHomeless = noHomeless;
        TotalAffected = totalAffected;
        ReconstructionCosts = reconstructionCosts;
        ReconstructionCostsAdjusted = reconstructionCostsAdjusted;
        InsuredDamages = insuredDamages;
        InsuredDamagesAdjusted = insuredDamagesAdjusted;
        TotalDamages = totalDamages;
        TotalDamagesAdjusted = totalDamagesAdjusted;
        this.CPI = CPI;
        Admevel = admevel;
        Admin1Code = admin1Code;
        Admin2Code = admin2Code;
        GeoLocations = geoLocations;
        }catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("era el constructor");
        }
    }

    public String getDisNo() {
        return DisNo;
    }

    public int getYear() {
        return Year;
    }

    public double getSeq() {
        return Seq;
    }

    public String getGlide() {
        return Glide;
    }

    public String getDisasterGroup() {
        return DisasterGroup;
    }

    public String getDisasterSubgroup() {
        return DisasterSubgroup;
    }

    public String getDisasterType() {
        return DisasterType;
    }

    public String getDisasterSubtype() {
        return DisasterSubtype;
    }

    public String getDisasterSubsubtype() {
        return DisasterSubsubtype;
    }

    public String getEventName() {
        return EventName;
    }

    public String getCountry() {
        return Country;
    }

    public String getISO() {
        return ISO;
    }

    public String getRegion() {
        return Region;
    }

    public String getContinent() {
        return Continent;
    }

    public String getLocation() {
        return Location;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getAssociatedDis() {
        return AssociatedDis;
    }

    public String getAssociatedDis2() {
        return AssociatedDis2;
    }

    public String getOFDAResponse() {
        return OFDAResponse;
    }

    public String getAppeal() {
        return Appeal;
    }

    public String getDeclaration() {
        return Declaration;
    }

    public String getAidContribution() {
        return AidContribution;
    }

    public int getDisMagValue() {
        return DisMagValue;
    }

    public String getDisMagScale() {
        return DisMagScale;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public String getLocalTime() {
        return LocalTime;
    }

    public String getRiverBasin() {
        return RiverBasin;
    }

    public int getStartYear() {
        return StartYear;
    }

    public int getStartMonth() {
        return StartMonth;
    }

    public int getStartDay() {
        return StartDay;
    }

    public int getEndYear() {
        return EndYear;
    }

    public int getEndMonth() {
        return EndMonth;
    }

    public int getEndDay() {
        return EndDay;
    }

    public int getTotalDeaths() {
        return TotalDeaths;
    }

    public int getNoInjured() {
        return NoInjured;
    }

    public int getNoAffected() {
        return NoAffected;
    }

    public int getNoHomeless() {
        return NoHomeless;
    }

    public int getTotalAffected() {
        return TotalAffected;
    }

    public int getReconstructionCosts() {
        return ReconstructionCosts;
    }

    public int getReconstructionCostsAdjusted() {
        return ReconstructionCostsAdjusted;
    }

    public int getInsuredDamages() {
        return InsuredDamages;
    }

    public int getInsuredDamagesAdjusted() {
        return InsuredDamagesAdjusted;
    }

    public int getTotalDamages() {
        return TotalDamages;
    }

    public int getTotalDamagesAdjusted() {
        return TotalDamagesAdjusted;
    }

    public String getCPI() {
        return CPI;
    }

    public String getAdmevel() {
        return Admevel;
    }

    public String getAdmin1Code() {
        return Admin1Code;
    }

    public String getAdmin2Code() {
        return Admin2Code;
    }

    public String getGeoLocations() {
        return GeoLocations;
    }
}
