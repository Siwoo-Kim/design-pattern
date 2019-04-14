package com.siwoo.designpattern.proxy;

/**
 * Created by sm123tt@gmail.com on 2019-04-14
 * Project : design-pattern
 * Github : http://github.com/Siwoo-Kim
 */

public class BeanImpl implements Bean {
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    public int getHotOrNotRating() {
        if (ratingCount == 0) return 0;
        return (rating/ratingCount);
    }

    public void setHotOrNotRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}
