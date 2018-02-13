package com.pojo;

import java.util.ArrayList;

/**
 * @author shefali.jain
 */
public class P2p {

        private ArrayList<Category> categories;

        public ArrayList<Category> getCategories()
        {
            return this.categories;
        }

    public void setCategories(ArrayList<Category> categories) { this.categories = categories; }

    private RideLater rideLater;

    public RideLater getRideLater() { return this.rideLater; }

    public void setRideLater(RideLater rideLater) { this.rideLater = rideLater; }
}
