package testDataPackage;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "registrationInfo")
    public static Object[][] registrationData() {
        Object[][] obj = {
                {
                        "shuzan111@gmaiil.com", "Nurul", "Amin", "testpass123@", "12",
                        "7", "2000", "AdventureSports", "87 Nickel Road", "2661 Kennedy Court",
                        "Kentucky", "6", "41002", "21", "Take first left after Jr. school",
                        "774-280-5944", "606-402-2834", " My address"
                },
                {
                        "sumaiya222@gmaiil.com", "Sumaiya", "Nipa", "@testpass123", "28",
                        "5", "1990", "Market Basket", "2358 Barfield Lane", "Indianapolis",
                        "Indiana", "12", "55555", "21", "Take first Right after KFC",
                        "317-529-7499", "317-425-8779", " My address"
                }
        };
        return obj;

    }

    @DataProvider(name = "loginInfo")
    public static Object[][] loginData() {

        Object[][] obj = {
                {"shuzan111@gmaiil.com", "testpass123@", "Call before knock the door"},
                {"sumaiya222@gmaiil.com", "@testpass123", "Be aware about dog"}
        };
        return obj;

    }

}
