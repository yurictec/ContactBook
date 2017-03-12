package org.contactBook.entity;

import org.contactBook.entity.enums.TypeEmail;


/**
 * Created by Yuriy Kolennikov on 12.03.2017.
 */
public class Email {

    private TypeEmail typeEmail;
    private String email;
    private boolean useFlag;

    public TypeEmail getTypeEmail() {
        return typeEmail;
    }

    public void setTypeEmail(TypeEmail typeEmail) {
        this.typeEmail = typeEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUseFlag() {
        return useFlag;
    }

    public void setUseFlag(boolean useFlag) {
        this.useFlag = useFlag;
    }

    @Override
    public String toString() {
        return "Email: " + email + ", Type email: " + typeEmail;
    }
}
