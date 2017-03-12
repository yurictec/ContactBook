package org.contactBook.entity;

import org.contactBook.entity.enums.TypePhone;

/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public class Phone {

    private int id;
    private TypePhone typePhone;
    private String phone;
    private boolean useFlag;

    public TypePhone getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isUseFlag() {
        return useFlag;
    }

    public void setUseFlag(boolean useFlag) {
        this.useFlag = useFlag;
    }

    @Override
    public String toString() {
        return "Phone: " + phone + ", Type phone: " + typePhone;
    }
}
