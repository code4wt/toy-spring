package com.titizz.simulation.toyspring.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by code4wt on 17/8/3.
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }

}