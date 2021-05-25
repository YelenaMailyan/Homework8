package com.company;

public class Person {

    int hasErrors;
    String errorMsg = "";
    private String firstName;    // must be in range 3 to 15
    private String lastName;     // lastName must be in range 6 to 20
    private int age;             // age must be in range 18 - 99
    private String sex;          // must be male or female(compareToIgnoreCase())
    private String passportId;   // must be start with "AN" and contain 6 digits with length 8

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String sex, String passportId) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSex(sex);
        setPassportId(passportId);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        boolean bool = firstName.matches(("[a-zA-Z]+"));
        if (firstName.length() >= 3 && firstName.length() <= 15 && bool) {
            this.firstName = firstName;
        } else {
            this.hasErrors++;
            this.errorMsg = errorMsg.concat("Wrong input for field 'First name',it must contain only letters. ");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        boolean bool = lastName.matches(("[a-zA-Z]+"));
        if (lastName.length() >= 6 && lastName.length() <= 20 && bool) {
            this.lastName = lastName;
        } else {
            this.hasErrors++;
            this.errorMsg = errorMsg.concat("\nWrong input for field 'Last name',it must contain only letters.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
            this.age = age;
        } else {
            this.hasErrors++;
            this.errorMsg = errorMsg.concat("\nWrong input for field 'Age'.Age is not in range 18-99.");
        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String str1 = "male";
        String str2 = "female";
        if (sex.compareTo(str1) == 0 || sex.compareTo(str2) == 0) {
            this.sex = sex;
        } else {
            this.hasErrors++;
            this.errorMsg = errorMsg.concat("\nWrong input for field 'Sex',please enter 'male' or 'female'. ");
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        String str = "AN";
        if (passportId.substring(0, 2).compareTo(str) == 0 && passportId.substring(2).matches(("[0-9]+"))
                && passportId.length() == 8) {
            this.passportId = passportId;
        } else {
            this.hasErrors++;
            this.errorMsg = errorMsg.concat("\nWrong input for field 'PassportId',it must be started with 'AN' " +
                    "and contain 6 digits with length 8");
        }

    }

    public void personInfo() {
        String str1, str2, str3;

        if (hasErrors > 0) {
            System.out.println("You have  " + hasErrors + " wrong inputs");
            System.out.println(errorMsg);
        } else {
            if (getSex().equals("female")) {
                str1 = "She ";
                str2 = " she is ";
                str3 = "her ";
            } else {
                str1 = "He";
                str2 = " he is ";
                str3 = "his ";
            }
            System.out.println("Persons first name is " + getFirstName() + " and last name is " + getLastName()
                    + "." + "\n" + str1 + " is " + getAge() + " years old ," + str3 + " passport Id is  "
                    + getPassportId() + " and " + str2 + getSex() + ".\n ");
        }
    }


}
