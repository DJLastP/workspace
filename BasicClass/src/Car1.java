public class Car1 {
    String madeBy;
    String carName;
    String carNum;
    int carPrice;
    String  owner;

    public void setMadeBy(String made){
        madeBy = made;
    }
    public void setCarName(String name){
        carName = name;
    }
    public void setCarNum(String num){
        carNum = num;
    }
    public void setPrice(int price){
        carPrice = price;
    }
    public void setPerson(String per1){
        owner = per1;
    }

    //모든 정보를 변경하는 메소드
    public void setCarInfo(String made1,String name1,String num1,int price1,String owner1){
        madeBy = made1;
        carName = name1;
        carNum = num1;
        carPrice = price1;
        owner = owner1;
    }

    public void printCarInfo(){
        System.out.println("제조사 : " + madeBy);
        System.out.println("차이름 : " + carName);
        System.out.println("차량번호 : " + carNum);
        System.out.println("가격 : " + carPrice);
        System.out.println("소유주 :" + owner);
    }
}
