package dev.mrpanda.EduFund;

public class SchoolCampaign {

    public String schoolName;
    public int schoolImage;
    public String schoolDescription;
    public String donationAmount;


    public SchoolCampaign(String schoolName, int schoolImage, String schoolDescription, String donationAmount) {
        this.schoolName = schoolName;
        this.schoolImage = schoolImage;
        this.schoolDescription = schoolDescription;
        this.donationAmount = donationAmount;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolImage() {
        return schoolImage;
    }

    public void setSchoolImage(int schoolImage) {
        this.schoolImage = schoolImage;
    }

    public String getSchoolDescription() {
        return schoolDescription;
    }

    public void setSchoolDescription(String schoolDescription) {
        this.schoolDescription = schoolDescription;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }
}
