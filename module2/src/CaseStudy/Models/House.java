package CaseStudy.Models;

public class House extends Services {
    private String kindOfRoom;
    private String description;
    private int numberOfFloor;

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String nameServices, float areaUse, float feeRent, int numOfPeopleMax, String typeOfRent, String kindOfRoom, String description, int numberOfFloor) {
        super(id, nameServices, areaUse, feeRent, numOfPeopleMax, typeOfRent);
        this.kindOfRoom = kindOfRoom;
        this.description = description;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    @Override
    public void showInfor() {
        System.out.println("Tên dịch vụ: " + this.getNameServices());
        System.out.println("Diện tích sử dụng: " + this.getAreaUse());
        System.out.println("Chi phí thuê: " + this.getFeeRent());
        System.out.println("Số lượng người tối đa: " + this.getNumOfPeopleMax());
        System.out.println("Kiểu thuê: " + this.getTypeOfRent());
        System.out.println("Số lầu: " + this.getNumberOfFloor());
        System.out.println("Mô tả dịch vụ khác: " + this.getDescription());
        System.out.println("Loại phòng:" + this.getKindOfRoom());

    }


}
