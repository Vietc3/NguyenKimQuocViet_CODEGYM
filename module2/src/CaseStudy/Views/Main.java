package CaseStudy.Views;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

public class Main {
    public static void main(String[] args) {

        Villa villa = new Villa("1D32", "villa", 100.2f, 1000, 8,
                "Ngày", 200, "Vip", "Có tủ lạnh", 5);
        villa.showInfor();
        House house = new House("1D32", "villa", 100, 1000, 8,
                "Ngày", "Vip", "Có tủ lạnh", 5);
        house.showInfor();
        Room room=new Room("1D32", "villa", 100, 1000, 8,
                "Ngày", "Karaoke", 3,0);
        room.showInfor();

    }
}
