package com.example.demo;

public interface Regex {

    //UA
    String REGEX_NAME_UK= "[А-ЩЬЮЯЇІЄҐ][а-щьюяїієґ']{1,20}";
    String REGEX_NIKNAME_UK = "^[А-ЩЬЮЯЇІЄҐа-щьюяїієґ0-9_.-]{1,30}$ ";
    String REGEX_GROUPS_UK = "[А-ЩЬЮЯЇІЄҐа-щьюяїієґ ]{1,200}";
    String REGEX_CITY_AND_STREET_UK = "[А-ЩЬЮЯЇІЄҐ][ А-ЩЬЮЯЇІЄҐа-щьюяїієґ-]{1,30}";
    String REGEX_HOME_NUMBER_UK = "[0-9]{1,3}[А-ЩЬЮЯЇІЄҐа-щьюяїієґ]?(\\/[0-9]{1,3})?";
    String REGEX_FLAT_NUMBER_UK = "[0-9]{1,4}[А-ЩЬЮЯЇІЄҐа-щьюяїієґ]?";
    String REGEX_DATE_UK = "([1-9]|0[1-9]|[1-2][0-9]|3[0-1])\\.([1-9]|0[1-9]|1[0-2])\\.(0[1-9]|[1-9][0-9]|[1-9][0-9]{3})$";

    //EN
    String REGEX_NAME_EN= "[A-Z][a-z]{1,20}";
    String REGEX_NIKNAME_EN = "[a-zA-Z-9_.-]{1,30}";
    String REGEX_GROUPS_EN = "[A-Za-z ]{1,200}";
    String REGEX_CITY_AND_STREET_EN = "[A-Z][A-Za-z- ]{1,30}";
    String REGEX_HOME_NUMBER_EN = "[0-9]{1,3}[A-Za-z]?(\\/[0-9]{1,3})?";
    String REGEX_FLAT_NUMBER_EN = "[0-9]{1,4}[A_Za-z]?";
    String REGEX_DATE_EN = "([1-9]|0[1-9]|1[0-2])\\/([1-9]|0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|[1-9][0-9]|[1-9][0-9]{3})$";

    //BOTH
    String REGEX_COMMENT = ".{0,1000}";
    String REGEX_HOME_PHONE = "^((\\+\\d{1,2})|\\d{0,2})\\(\\d{3,4}\\)\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_MOBILE_PHONE = "^((\\+\\d{1,2})|\\d{0,2})\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_EMAIL = "^[A-Za-z0-9.]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,6}$";
    String REGEX_SKYPE = "^[A-Za-z][A-Za-z0-9_.-]{5,31}$";
    String REGEX_INDEX = "[0-9]{5}";

}