package study.designpattern.proxy.protection;

public interface PersonBean {
    String getName();

    String getGender();

    String getInterest();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);

}
