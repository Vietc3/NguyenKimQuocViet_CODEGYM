package CaseStudy.Models;

public abstract class Services {
    private String id;
    private String nameServices;
    private float areaUse;
    private float feeRent;
    private int numOfPeopleMax;
    private String typeOfRent;
    private String namePlusService;
    private int amountPlusService;
    private float pricePlusService;
    public void plusService(String namePlusService,int amount,float price){
        this.namePlusService=namePlusService;
        this.amountPlusService =amount;
        this.pricePlusService =price;

    }

    public String getNamePlusService() {
        return namePlusService;
    }

    public void setNamePlusService(String namePlusService) {
        this.namePlusService = namePlusService;
    }

    public int getAmountPlusService() {
        return amountPlusService;
    }

    public void setAmountPlusService(int amountPlusService) {
        this.amountPlusService = amountPlusService;
    }

    public float getPricePlusService() {
        return pricePlusService;
    }

    public void setPricePlusService(float pricePlusService) {
        this.pricePlusService = pricePlusService;
    }


    public Services(String id, String nameServices, float areaUse, float feeRent, int numOfPeopleMax, String typeOfRent, String namePlusService, int amountPlusService, float pricePlusService) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.feeRent = feeRent;
        this.numOfPeopleMax = numOfPeopleMax;
        this.typeOfRent = typeOfRent;
        this.namePlusService = namePlusService;
        this.amountPlusService = amountPlusService;
        this.pricePlusService = pricePlusService;
    }

    public Services(String id, String nameServices, float areaUse, float feeRent, int numOfPeopleMax, String typeOfRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.feeRent = feeRent;
        this.numOfPeopleMax = numOfPeopleMax;
        this.typeOfRent = typeOfRent;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public float getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(float areaUse) {
        this.areaUse = areaUse;
    }

    public float getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(float feeRent) {
        this.feeRent = feeRent;
    }

    public int getNumOfPeopleMax() {
        return numOfPeopleMax;
    }

    public void setNumOfPeopleMax(int numOfPeopleMax) {
        this.numOfPeopleMax = numOfPeopleMax;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public Services() {
    }

    public Services(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void showInfor();
}
