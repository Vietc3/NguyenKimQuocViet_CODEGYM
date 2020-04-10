package CaseStudy.Models;

public class Room extends Services{


    public Room(String id, String nameServices, float areaUse, float feeRent, int numOfPeopleMax, String typeOfRent, String namePlusService, int amountPlusService, float pricePlusService) {
        super(id, nameServices, areaUse, feeRent, numOfPeopleMax, typeOfRent, namePlusService, amountPlusService, pricePlusService);
    }


    @Override

    public void showInfor() {
        System.out.println("Tên dịch vụ: " + this.getNameServices());
        System.out.println("Diện tích sử dụng: " + this.getAreaUse());
        System.out.println("Chi phí thuê: " + this.getFeeRent());
        System.out.println("Số lượng người tối đa: " + this.getNumOfPeopleMax());
        System.out.println("Kiểu thuê: " + this.getTypeOfRent());
        System.out.println("Dịch vụ kèm miễn phí: " + this.getNamePlusService());
        System.out.println("Số lượng dịch kèm vụ miễn phí: " + this.getAmountPlusService());
        System.out.println("Giá dịch kèm vụ miễn phí: " + this.getPricePlusService()+"VND");


    }
}
