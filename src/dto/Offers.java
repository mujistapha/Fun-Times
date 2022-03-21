package dto;

import enumClasses.OfferTypes;

import java.util.Date;

public class Offers {
    private int id;
    private String title;
    private Date validFrom;
    private Date validTo;
    private OfferTypes types;
    private boolean status;

    public Offers(int id, String title, Date validFrom, Date validTo, OfferTypes types, boolean status) {
        this.id = id;
        this.title = title;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.types = types;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public OfferTypes getTypes() {
        return types;
    }

    public void setTypes(OfferTypes types) {
        this.types = types;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
