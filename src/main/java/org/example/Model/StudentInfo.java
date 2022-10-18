package org.example.Model;

public class StudentInfo {
    int sid;
    String sname;
    String sdeprt;
    String scontact;

    public StudentInfo() {
    }

    public StudentInfo(String sname, String sdeprt, String scontact) {
        this.sname = sname;
        this.sdeprt = sdeprt;
        this.scontact = scontact;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSdeprt() {
        return sdeprt;
    }

    public void setSdeprt(String sdeprt) {
        this.sdeprt = sdeprt;
    }

    public String getScontact() {
        return scontact;
    }

    public void setScontact(String scontact) {
        this.scontact = scontact;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sdeprt='" + sdeprt + '\'' +
                ", scontact='" + scontact + '\'' +
                '}';
    }
}
