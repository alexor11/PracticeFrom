package ObjectData;

import Pages.BasePage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public class PracticeFormObject extends CommonObject{

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String month;
    private String year;
    private String date;
    private String subjects;
    private List<String> hobbies;
    private String currentaddress;
    private String state;
    private String city;

    public PracticeFormObject(HashMap<String,String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData){
        for(String key:testData.keySet()){
            switch(key){
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "email":
                    setEmail(testData.get(key));
                    break;
                case "gender":
                    setGender(testData.get(key));
                    break;
                case "mobile":
                    setMobile(testData.get(key));
                    break;
                case "subjects":
                    setSubjects(testData.get(key));
                    break;
                case "hobbies":
                    setHobbies(getValueAsList(testData.get(key)));
                    break;
                case "currentaddress":
                    setCurrentaddress(testData.get(key));
                    break;
                case "state":
                    setState(testData.get(key));
                    break;
                case "city":
                    setCity(testData.get(key));
                    break;
                case "month":
                    setMonth(testData.get(key));
                    break;
                case "year":
                    setYear(testData.get(key));
                    break;
                case "date":
                    setDate(testData.get(key));
                    break;

            }
        }
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSubjects() {
        return subjects;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }



    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}







